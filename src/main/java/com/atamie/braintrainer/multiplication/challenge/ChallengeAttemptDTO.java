package com.atamie.braintrainer.multiplication.challenge;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;


@Getter
@AllArgsConstructor
@ToString
@Setter
@EqualsAndHashCode
public class ChallengeAttemptDTO {
    @Min(11) @Max(99)
    int factorA, factorB;
    @NotBlank
    String userId;
    @Positive(message = "How could you possibly get a negative result here? Try again.")
    int guess;
    /*public ChallengeAttemptDTO(int num1,int num2, String alias, int result){
        factorA = num1;
        factorB = num2;
        userAlias = alias;
        guess = result;

    }*/

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public int getGuess() {
        return guess;
    }

    public String getUserId() {
        return userId;
    }

    public void setFactorA(int factorA) {
        this.factorA = factorA;
    }

    public void setFactorB(int factorB) {
        this.factorB = factorB;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
