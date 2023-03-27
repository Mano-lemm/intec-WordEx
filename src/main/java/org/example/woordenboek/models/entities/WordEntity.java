package org.example.woordenboek.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dutchWord;
    private String englishWord;

    public WordEntity(Long id, String dutch, String english){
	this.id = id;
	this.dutchWord = dutch;
	this.englishWord = english;
    }

    public WordEntity(){}

    public Long getId() {
        return this.id;
    }

    public String getDutchWord() {
        return this.dutchWord;
    }

    public String getEnglishWord() {
        return this.englishWord;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDutchWord(String dutchWord) {
        this.dutchWord = dutchWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }
}
