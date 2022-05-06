package com.atamie.braintrainer.multiplication.challenge;

public interface ChallengeService {

    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
    Iterable<ChallengeAttempt> getStatsForUser(String userAlias);

}
