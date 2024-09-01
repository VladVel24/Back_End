package de.ait.words43.wordgroup.service;

import de.ait.words43.wordgroup.dto.WordGroupRequestDto;
import de.ait.words43.wordgroup.dto.WordGroupResponseDto;

import java.util.Optional;

public interface WordGroupService {

    public WordGroupResponseDto createGroup(WordGroupRequestDto dto);
    public Optional<Object> addWordToGroup(Long wordGroupId, Long wordCardId);
    public Optional<WordGroupResponseDto> removeWordFromGroup(Long wordGroupId, Long wordCardId);

}
