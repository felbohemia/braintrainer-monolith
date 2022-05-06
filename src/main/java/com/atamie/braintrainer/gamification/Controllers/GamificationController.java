package com.atamie.braintrainer.gamification.Controllers;

import com.atamie.braintrainer.gamification.Domain.ChallengeAttemptDTO;
import com.atamie.braintrainer.gamification.Domain.LeaderBoardRow;
import com.atamie.braintrainer.gamification.Services.LeaderBoardGeneratorService;
import com.atamie.braintrainer.gamification.Services.ScoreCardGeneratorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/attempt")
@Slf4j
public class GamificationController {
    private final ScoreCardGeneratorService scoreCardGeneratorService;
    private final LeaderBoardGeneratorService leaderBoardGeneratorService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void postAttempt( @RequestBody @Valid ChallengeAttemptDTO challengeAttemptDTO){
        scoreCardGeneratorService.generateScoreAndBadgeCards(challengeAttemptDTO);
    }
    @GetMapping("/leaders")
    public List<LeaderBoardRow> getLeaders(){
        return leaderBoardGeneratorService.getLeaderBoard();
    }
}
