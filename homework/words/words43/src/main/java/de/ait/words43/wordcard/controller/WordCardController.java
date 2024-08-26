package de.ait.words43.wordcard.controller;

import de.ait.words43.wordcard.dto.RequestWordCardDto;
import de.ait.words43.wordcard.dto.ResponseWordCardDto;
import de.ait.words43.wordcard.service.WordCardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wordcards")
@AllArgsConstructor
public class WordCardController {
    private final WordCardService service;

    @GetMapping()
    public List<ResponseWordCardDto> getWordCards(@RequestParam(name="word",required = false, defaultValue = "")String word) {
        if (word.isEmpty()) {
            return service.findAllWordCards();
        } else {
            return service.findByWord(word);
        }
    }

    @PostMapping()
    public ResponseWordCardDto addWordCard(@RequestBody RequestWordCardDto dto){
        return service.saveWordCard(dto);
    }
    @GetMapping("/{id}")
    public ResponseWordCardDto getWordCard(@PathVariable Long id) {
        return service.findWordCardById(id);

    }

    @GetMapping("/search")
    public List<ResponseWordCardDto> findByLanguageAndTranslateLanguage(
            @RequestParam(name="language",required = false,defaultValue = "")String language,
            @RequestParam(name = "translatelanguage",required = false,defaultValue = "")String translatelanguage) {
        return service.findByLanguageAndTranslateLanguage(language, translatelanguage);

    }

}
