package de.ait.words43.wordgroup.controller;


import de.ait.words43.wordgroup.dto.WordGroupRequestDto;
import de.ait.words43.wordgroup.dto.WordGroupResponseDto;
import de.ait.words43.wordgroup.service.WordGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/wordgroups")
@RequiredArgsConstructor
public class WordGroupController {
    private final WordGroupService wordGroupService;

    @PostMapping
    public WordGroupResponseDto createWordGroup(@RequestBody WordGroupRequestDto dto) {
        return wordGroupService.createGroup(dto);
    }

    @PostMapping("/{GroupId}/add/{CardId}")
    public Optional<Object> addWordToGroup(@PathVariable(name = "GroupId") Long wordGroupId,
                                           @PathVariable(name = "CardId") Long wordCardId) {
        return wordGroupService.addWordToGroup(wordGroupId, wordCardId);
    }

    @DeleteMapping("/{GroupId}/remove/{CardId}")
    public Optional<Object> removeWordFromGroup(@PathVariable(name = "GroupId") Long wordGroupId,
                                                @PathVariable(name = "CardId") Long wordCardId) {
        return Optional.ofNullable(wordGroupService.removeWordFromGroup(wordGroupId, wordCardId));

    }
}