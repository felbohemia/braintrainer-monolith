package com.atamie.braintrainer.multiplication.challenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Data
public class ChallengeAttempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String alias;//references user attempting the challenge
    private int factorA;
    private int factorB;
    private int result_Attempt;
    private boolean correct;
    private LocalDate when_Attempted;


    public boolean isCorrect() {
        return correct;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public String getAlias() {
        return alias;
    }

    public int getResult_Attempt() {
        return result_Attempt;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getWhen_Attempted() {
        return when_Attempted;
    }
}
