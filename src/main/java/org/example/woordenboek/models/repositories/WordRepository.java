package org.example.woordenboek.models.repositories;

import org.example.woordenboek.models.entities.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WordRepository extends JpaRepository<WordEntity, Long> {

    @Query("select id, dutchWord, englishWord from WordEntity where dutchWord like ?1")
    List<Object[]> getWordEntitiesByDutchWord(String word);

    @Query("select id, dutchWord, englishWord from WordEntity where englishWord like ?1")
    List<Object[]> getWordEntitiesByEnglishWord(String word);
}
