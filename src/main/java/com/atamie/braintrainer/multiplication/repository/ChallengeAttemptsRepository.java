package com.atamie.braintrainer.multiplication.repository;


import com.atamie.braintrainer.multiplication.challenge.ChallengeAttempt;
import org.springframework.data.repository.CrudRepository;

public interface ChallengeAttemptsRepository extends CrudRepository<ChallengeAttempt, Long> {
    Iterable<ChallengeAttempt>findByAliasOrderByIdDesc(String userAlias);
}
