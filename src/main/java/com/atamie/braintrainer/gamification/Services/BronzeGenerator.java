package com.atamie.braintrainer.gamification.Services;

import com.atamie.braintrainer.gamification.Domain.BadgeType;
import com.atamie.braintrainer.gamification.Domain.ChallengeAttemptDTO;
import com.atamie.braintrainer.gamification.Domain.ScoreCard;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BronzeGenerator implements BadgeGeneratorService{

    @Override
    public BadgeType getBadgeType() {
        return BadgeType.BRONZE;
    }

    @Override
    public Optional<BadgeType> assignBadgeToUser(Long total, List<ScoreCard> badgeCards, ChallengeAttemptDTO attemptDTO) {
       return total > 50 ? Optional.of(BadgeType.BRONZE): Optional.empty();
    }
}
