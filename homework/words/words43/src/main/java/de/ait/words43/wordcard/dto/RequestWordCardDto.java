package de.ait.words43.wordcard.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class RequestWordCardDto {
    private String language;
    private String word;
    private String example;
    private String translateLanguage;
    private String translation;


}
