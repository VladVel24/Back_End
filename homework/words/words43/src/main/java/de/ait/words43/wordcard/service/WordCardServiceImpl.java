package de.ait.words43.wordcard.service;


import de.ait.words43.wordcard.dto.RequestWordCardDto;
import de.ait.words43.wordcard.dto.ResponseWordCardDto;
import de.ait.words43.wordcard.entity.WordCard;
import de.ait.words43.wordcard.repository.WordCardRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class WordCardServiceImpl implements WordCardService {

    private final WordCardRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<ResponseWordCardDto> findAllWordCards() {
        return repository.findAll().stream()
                .map(wordCard -> mapper.map(wordCard, ResponseWordCardDto.class))
                .toList();

    }

    @Override
    public ResponseWordCardDto saveWordCard(RequestWordCardDto dto) {
        WordCard card = mapper.map(dto, WordCard.class);
        WordCard newCard = repository.save(card);
        return mapper.map(newCard, ResponseWordCardDto.class);
    }

    @Override
    public ResponseWordCardDto findWordCardById(long id) {
        return repository.findById(id)
                .map(wordCard -> mapper.map(wordCard, ResponseWordCardDto.class))
                .orElse(null);
    }

    @Override
    public List<ResponseWordCardDto> findByWord(String word) {
        List<WordCard> wordCardsByWord = repository.findByWord(word);
        return wordCardsByWord.stream()
                .map(wordCard -> mapper.map(wordCard, ResponseWordCardDto.class))
                .toList();
    }

    @Override
    public List<ResponseWordCardDto> findByLanguageAndTranslateLanguage(String language, String translatelanguage) {
        List<WordCard> byLanguageAndTranslatelanguage = repository.findByLanguageAndTranslatelanguage(language, translatelanguage);
        return byLanguageAndTranslatelanguage.stream()
                .map(e-> mapper.map(e, ResponseWordCardDto.class))
                .toList();
    }


}
