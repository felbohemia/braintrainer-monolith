package com.atamie.braintrainer.gamification.Services;


import com.atamie.braintrainer.gamification.Domain.BadgeType;
import com.atamie.braintrainer.gamification.Domain.ChallengeAttemptDTO;
import com.atamie.braintrainer.gamification.Domain.ScoreCard;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class SilverGenerator implements BadgeGeneratorService{

    @Override
    public BadgeType getBadgeType() {
        return BadgeType.SILVER;
    }

    @Override
    public Optional<BadgeType> assignBadgeToUser(Long total, List<ScoreCard> badgeCards, ChallengeAttemptDTO attemptDTO) {
        return total > 100 ? Optional.of(BadgeType.SILVER): Optional.empty();
    }
}
