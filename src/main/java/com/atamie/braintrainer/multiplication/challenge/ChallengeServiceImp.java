package com.atamie.braintrainer.multiplication.challenge;

import com.atamie.braintrainer.gamification.Controllers.GamificationController;
import com.atamie.braintrainer.multiplication.repository.ChallengeAttemptsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ChallengeServiceImp implements ChallengeService{

    @Autowired
    private ChallengeAttemptsRepository repository;
    @Autowired
    private GamificationController controller;

    //private GamificationMicroserviceClient client;

    @Transactional
    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO){
        boolean isCorrect = attemptDTO.guess == (attemptDTO.getFactorA()* attemptDTO.getFactorB());
        //User user = new User(null, attemptDTO.getUserAlias());
        LocalDate time = LocalDateTime.now().toLocalDate();
        ChallengeAttempt attempt = new ChallengeAttempt(null, attemptDTO.getUserId(), attemptDTO.getFactorA(),attemptDTO.getFactorB(),
                attemptDTO.getGuess(),isCorrect, time);
        ChallengeAttempt stored = repository.save(attempt);
        //client.sendAttemptToGamificationService(attemptDTO);
        com.atamie.braintrainer.gamification.Domain.ChallengeAttemptDTO dto =
                new com.atamie.braintrainer.gamification.Domain.ChallengeAttemptDTO(attemptDTO.getFactorA(),
                        attemptDTO.getFactorB(),attemptDTO.getUserId(),attemptDTO.getGuess());
        controller.postAttempt(dto);

        return  stored;
    }

    @Override
    public Iterable<ChallengeAttempt> getStatsForUser(String userAlias){

        return repository.findByAliasOrderByIdDesc(userAlias);
    }
}
