package com.atamie.braintrainer.multiplication.controllers;

import com.atamie.braintrainer.multiplication.challenge.Challenge;
import com.atamie.braintrainer.multiplication.challenge.ChallengeGeneratorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/challenges")
public class ChallengeController {

    private final ChallengeGeneratorService challengeGeneratorService;

    /*public ChallengeController(ChallengeGeneratorService challengeGeneratorService){
        this.challengeGeneratorService = challengeGeneratorService;
    }*/
    @GetMapping("/random")
    public Challenge getChallenge(){
        Challenge challenge = challengeGeneratorService.randomChallenge();
        log.info("Generating random challenge: {}", challenge);
        return  challenge;
    }

}
