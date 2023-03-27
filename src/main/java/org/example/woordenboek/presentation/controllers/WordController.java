package org.example.woordenboek.presentation.controllers;

import org.example.woordenboek.flow.exceptions.WordException;
import org.example.woordenboek.flow.services.WordService;
import org.example.woordenboek.models.dtos.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/words")
public class WordController {
    private final WordService service;

    public WordController(WordService service) {
        this.service = service;
    }

    @PostMapping("/create/list")
    public ResponseEntity<WordsResponse> createList(@RequestBody CreateWordsDTO req){
        try {
            return new ResponseEntity<>(service.createWords(req), HttpStatus.CREATED);
        } catch (WordException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/create/one")
    public ResponseEntity<WordResponse> createWord(@RequestBody CreateWordDTO req){
        try {
            return new ResponseEntity<>(service.createWord(req), HttpStatus.CREATED);
        } catch (WordException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/update/id")
    public ResponseEntity<WordResponse> updatewordById(@RequestBody WordUpdateByIdDTO req){
        try {
            return new ResponseEntity<>(service.updateWord(req), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/read/id")
    public ResponseEntity<WordGetResponse> getWordById(@RequestBody GetByIdWordDTO req){
        try {
            return new ResponseEntity<>(service.getWordById(req), HttpStatus.FOUND);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/read/word")
    public ResponseEntity<WordsGetAllResponse> getWordsByWord(@RequestBody GetWordsByWord req){
        try {
            return new ResponseEntity<>(service.getWordsByWord(req), HttpStatus.FOUND);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/read/transl")
    public ResponseEntity<WordsGetAllResponse> getWordsByTransl(@RequestBody GetWordsByTrans req){
        try {
            return new ResponseEntity<>(service.getWordsByTrans(req), HttpStatus.FOUND);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/read/all")
    public ResponseEntity<WordsGetAllResponse> getAllWords(@RequestBody GetAllWordsDTO req){
        try {
            return new ResponseEntity<>(service.getAllWords(req), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/delete/id")
    public ResponseEntity<WordResponse> delWordById(@RequestBody WordDeleteByIdDTO req){
        try {
            return new ResponseEntity<>(service.deleteById(req), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
