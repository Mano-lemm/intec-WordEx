package org.example.woordenboek.flow.mappers;

import org.example.woordenboek.models.dtos.*;
import org.example.woordenboek.models.entities.WordEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class WordMapper {
    public WordEntity toEntity(CreateWordDTO req){
        WordEntity we = new WordEntity();
        we.setDutchWord(req.getWord());
        we.setEnglishWord(req.getTranslation());
        return we;
    }

    public List<WordEntity> toEntity(CreateWordsDTO req){
        List<WordEntity> r = new ArrayList<>();
        for (CreateWordDTO in : req.getWords()) {
            r.add(this.toEntity(in));
        }
        return r;
    }

    public WordResponse toResponse(WordEntity ent){
        return new WordResponse(ent.getId());
    }

    public WordsResponse toResponse(List<WordEntity> ents){
        return new WordsResponse(ents.stream()
                .map(WordEntity::getId)
                .collect(Collectors.toUnmodifiableList()));
    }

    public WordGetResponse toGetResponse(WordEntity ent){
        return new WordGetResponse(ent.getDutchWord(), ent.getEnglishWord());
    }

    public WordsGetAllResponse toGetResponse(List<WordEntity> ents){
        return new WordsGetAllResponse(ents.stream()
                .map(this::toGetResponse)
                .collect(Collectors.toUnmodifiableList()));
    }
}
