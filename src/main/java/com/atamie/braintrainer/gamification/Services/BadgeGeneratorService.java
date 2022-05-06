package com.atamie.braintrainer.gamification.Services;



import com.atamie.braintrainer.gamification.Domain.BadgeType;
import com.atamie.braintrainer.gamification.Domain.ChallengeAttemptDTO;
import com.atamie.braintrainer.gamification.Domain.ScoreCard;

import java.util.List;
import java.util.Optional;

public interface BadgeGeneratorService {

    BadgeType getBadgeType();
    Optional<BadgeType> assignBadgeToUser(Long total, List<ScoreCard> badgeCards, ChallengeAttemptDTO attemptDTO);
}
