package de.ait.words43.wordcard.entity;

import de.ait.words43.wordgroup.entity.WordGroup;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @ManyToMany(mappedBy = "wordCards")
    private List<WordGroup> wordGroups = new ArrayList<>();
}
