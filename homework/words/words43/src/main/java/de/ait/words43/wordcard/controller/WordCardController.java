package de.ait.words43.wordcard.controller;

import de.ait.words43.wordcard.dto.RequestWordCardDto;
import de.ait.words43.wordcard.dto.ResponseWordCardDto;
import de.ait.words43.wordcard.service.WordCardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class WordCardController {
    private final WordCardService service;

    @GetMapping("/wordcards")
    public List<ResponseWordCardDto> getWordCards() {
       return service.findAllWordCards();
    }
    @PostMapping("/wordcards")
    public ResponseWordCardDto addWordCard(@RequestBody RequestWordCardDto dto){
        return service.saveWordCard(dto);
    }
    @GetMapping("/wordcards/{id}")
    public ResponseWordCardDto getWordCard(@PathVariable Long id) {
        return service.findWordCardById(id);

    }
}
