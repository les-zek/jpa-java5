package pl.sda.jpajava5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.jpajava5.entity.CompletedQuiz;
import pl.sda.jpajava5.entity.Quiz;

public interface CompletedQuizRepository extends JpaRepository <CompletedQuiz, Long> {
}
