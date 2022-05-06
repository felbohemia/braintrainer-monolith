package com.atamie.braintrainer.gamification.Services;


import com.atamie.braintrainer.gamification.Domain.LeaderBoardRow;

import java.util.List;

public interface LeaderBoardGeneratorService {
    List<LeaderBoardRow> getLeaderBoard();
}
