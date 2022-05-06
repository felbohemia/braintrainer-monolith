package com.atamie.braintrainer.gamification.Services;

import com.atamie.braintrainer.gamification.Domain.ChallengeAttemptDTO;

public interface ScoreCardGeneratorService {
    void generateScoreAndBadgeCards(ChallengeAttemptDTO attemptDTO);
}
