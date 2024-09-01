package de.ait.words43.wordgroup.entity;

import de.ait.words43.wordcard.entity.WordCard;
import de.ait.words43.wordgroup.dto.WordGroupResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "word_group")
public class WordGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinTable( name = "word_group_word_card",
            joinColumns = @JoinColumn(name = "word_group_id"),
            inverseJoinColumns = @JoinColumn(name = "word_card_id")
    )
    private List<WordCard> wordCards = new ArrayList<>();

    public boolean addWordCard(WordCard wordCard) {
         wordCards.add(wordCard);
         return true;
    }

    public boolean removeWordCard(WordCard wordCard) {
        return wordCards.remove(wordCard);
    }


}
