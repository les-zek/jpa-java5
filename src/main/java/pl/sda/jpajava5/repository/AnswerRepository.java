package pl.sda.jpajava5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.jpajava5.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
