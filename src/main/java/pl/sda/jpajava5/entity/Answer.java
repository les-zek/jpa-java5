package pl.sda.jpajava5.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
private int optionNumber;
@ManyToOne
private Question question;
}
/*
2020-09-27
 */