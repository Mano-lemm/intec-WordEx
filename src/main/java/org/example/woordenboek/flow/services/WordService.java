package org.example.woordenboek.flow.services;

import org.example.woordenboek.flow.exceptions.WordException;
import org.example.woordenboek.flow.mappers.WordMapper;
import org.example.woordenboek.models.dtos.*;
import org.example.woordenboek.models.entities.WordEntity;
import org.example.woordenboek.models.repositories.WordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class WordService {
    private final WordRepository repo;
    private final WordMapper map;

    public WordService(WordRepository repo, WordMapper map) {
        this.repo = repo;
        this.map = map;
    }

    public WordResponse createWord(CreateWordDTO req){
        WordEntity ent;
        try {
            ent = map.toEntity(req);
            ent = repo.save(ent);
            return map.toResponse(ent);
        } catch (Exception e){
            throw new WordException(e.getMessage(), e);
        }
    }

    public WordsResponse createWords(CreateWordsDTO req){
        List<WordEntity> ents;
        try {
            ents = map.toEntity(req);
            ents = repo.saveAll(ents);
            return map.toResponse(ents);
        } catch (Exception e){
            throw new WordException(e.getMessage(), e);
        }
    }

    public WordsGetAllResponse getAllWords(GetAllWordsDTO req){
        try {
            List<WordEntity> ents = repo.findAll();
            return map.toGetResponse(ents);
        } catch (Exception e){
            throw new WordException(e.getMessage(), e);
        }
    }

    public WordGetResponse getWordById(GetByIdWordDTO req){
        Optional<WordEntity> ent;
        try {
            ent = repo.findById(req.getId());
            return map.toGetResponse(ent.orElseThrow(() -> new WordException("Id not found")));
        } catch (Exception e){
            throw new WordException(e.getMessage(), e);
        }
    }

    public WordResponse updateWord(WordUpdateByIdDTO req) {
        Optional<WordEntity> ent;
        try {
            ent = repo.findById(req.getId());
            if(ent.isEmpty()){
                throw new WordException("Word with id " + req.getId() + " doesnt exist.");
            }
            ent.get().setDutchWord(req.getWord() != null ? req.getWord() : ent.get().getDutchWord());
            ent.get().setEnglishWord(req.getTranslation() != null ? req.getTranslation() : ent.get().getEnglishWord());
            WordEntity ntty = repo.save(ent.get());
            return new WordResponse(ntty.getId());
        } catch (Exception e){
            throw new WordException(e.getMessage(), e);
        }
    }

    public WordResponse deleteById(WordDeleteByIdDTO req) {
        Optional<WordEntity> ent;
        try {
            ent = repo.findById(req.getId());
            ent.ifPresentOrElse(
                    (WordEntity e) -> {
                        repo.deleteById(e.getId());
                    },
                    () -> {
                        throw new WordException("Word with id " + req.getId() + " doesnt exist.");
                    }
            );
            return new WordResponse(ent.get().getId());
        } catch (Exception e){
            throw new WordException(e.getMessage(), e);
        }
    }

    public WordsGetAllResponse getWordsByWord(GetWordsByWord req) {
        try {
            List<WordEntity> ents = repo.getWordEntitiesByDutchWord(req.getWord())
		.stream()
		.map((Object[] e) -> new WordEntity((Long) e[0],(String) e[1],(String) e[2]))
		.collect(Collectors.toList());
            return map.toGetResponse(ents);
        } catch (Exception e){
            throw new WordException(e.getMessage(), e);
        }
    }

    public WordsGetAllResponse getWordsByTrans(GetWordsByTrans req) {
        try {
            List<WordEntity> ents = repo.getWordEntitiesByEnglishWord(req.getTranslation())
		.stream()
		.map(e -> new WordEntity((Long) e[0], (String) e[1], (String) e[2]))
		.collect(Collectors.toList());
	    System.out.println(ents);
            return map.toGetResponse(ents);
        } catch (Exception e){
            throw new WordException(e.getMessage(), e);
        }
    }
}
