package de.ait.words43.wordcard.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "wordcard")
public class WordCard {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="language")
    private String language;
    @Column(name="word")
    private String word;
    @Column(name="example")
    private String example;
    @Column(name="translatelanguage")
    private String translatelanguage;
    @Column(name="translation")
    private String translation;
    @Column(name="cardGroup")
    private String cardGroup;
}
