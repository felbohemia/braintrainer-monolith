package com.atamie.braintrainer.gamification.Services;

import com.atamie.braintrainer.gamification.Domain.LeaderBoardRow;
import com.atamie.braintrainer.gamification.repositories.BadgeRepository;
import com.atamie.braintrainer.gamification.repositories.ScoreRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor

public class LeaderBoardGeneratorServiceImp  implements LeaderBoardGeneratorService{
    private final ScoreRepository scoreRepository;
    private final BadgeRepository badgeRepository;

    @Override
    public List<LeaderBoardRow> getLeaderBoard() {
        List<LeaderBoardRow> rows = scoreRepository.findFirst10();
        List<LeaderBoardRow>lbRow = rows.stream().map(row ->{
           // log.info("....{}",badgeRepository.allBadgeBelongingToAUserDesc(row.getUserId()));
            List<String> badgeCards = badgeRepository.allBadgeBelongingToAUserDesc(row.getUserId()).stream()
                    .map(bC -> bC.getBadge()).collect(Collectors.toList());
            //log.info("----{}---",badgeCards);
            row.setBadges(badgeCards);
            //log.info("---{}----",row);
            return  row;
        }).collect(Collectors.toList());

        return lbRow;
    }
}
