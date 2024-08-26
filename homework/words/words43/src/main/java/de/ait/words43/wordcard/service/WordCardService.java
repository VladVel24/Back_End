package de.ait.words43.wordcard.service;

import de.ait.words43.wordcard.dto.RequestWordCardDto;
import de.ait.words43.wordcard.dto.ResponseWordCardDto;
import de.ait.words43.wordcard.entity.WordCard;

import java.util.List;


public interface WordCardService {

   List<ResponseWordCardDto> findAllWordCards();
   ResponseWordCardDto saveWordCard(RequestWordCardDto dto);
   ResponseWordCardDto findWordCardById(long id);

    List<ResponseWordCardDto> findByWord(String word);

    List<ResponseWordCardDto> findByLanguageAndTranslateLanguage(String language, String translatelanguage);
};

