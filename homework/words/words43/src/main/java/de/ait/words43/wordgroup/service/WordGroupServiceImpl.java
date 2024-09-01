package de.ait.words43.wordgroup.service;

import de.ait.words43.wordcard.entity.WordCard;
import de.ait.words43.wordcard.repository.WordCardRepository;
import de.ait.words43.wordgroup.dto.WordGroupRequestDto;
import de.ait.words43.wordgroup.dto.WordGroupResponseDto;
import de.ait.words43.wordgroup.entity.WordGroup;
import de.ait.words43.wordgroup.repository.WordGroupRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class WordGroupServiceImpl implements WordGroupService {

    private final WordGroupRepository repository;
    private final WordCardRepository cardRepository;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public WordGroupResponseDto createGroup(WordGroupRequestDto dto) {
        WordGroup wordGroup = modelMapper.map(dto, WordGroup.class);
        WordGroup savedWordGroup = repository.save(wordGroup);
        return modelMapper.map(savedWordGroup, WordGroupResponseDto.class);
    }

    @Override
    @Transactional
    public Optional<Object> addWordToGroup(Long wordGroupId, Long wordCardId) {
        Optional<WordGroup> wordGroupOpt = repository.findById(wordGroupId);
        Optional<WordCard> wordCardOpt = cardRepository.findById(wordCardId);

        if(wordGroupOpt.isPresent() && wordCardOpt.isPresent()) {
            WordGroup wordGroup = wordGroupOpt.get();
            WordCard wordCard = wordCardOpt.get();

            wordGroup.addWordCard(wordCard);
            repository.save(wordGroup);

            return Optional.of(modelMapper.map(wordGroup,WordGroupResponseDto.class));
        }
        return Optional.empty();
    }

    @Transactional
    @Override
    public Optional<WordGroupResponseDto> removeWordFromGroup(Long wordGroupId, Long wordCardId) {
        Optional<WordGroup> wordGroupOpt = repository.findById(wordGroupId);
        Optional<WordCard> wordCardOpt = cardRepository.findById(wordCardId);

        if(wordGroupOpt.isPresent() && wordCardOpt.isPresent()) {
            WordGroup wordGroup = wordGroupOpt.get();
            WordCard wordCard = wordCardOpt.get();

            wordGroup.removeWordCard(wordCard);
            repository.save(wordGroup);

            return Optional.of(modelMapper.map(wordGroup,WordGroupResponseDto.class));
        }
        return Optional.empty();
    }





}
