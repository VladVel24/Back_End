package de.ait.words43.wordgroup.dto;

import de.ait.words43.wordcard.dto.ResponseWordCardDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class WordGroupResponseDto {
    private Long id;
    private String name;
    private List<ResponseWordCardDto> wordCards;
}
