package de.ait.words43.wordcard.repository;

import de.ait.words43.wordcard.entity.WordCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordCardRepository extends JpaRepository<WordCard, Long> {}

