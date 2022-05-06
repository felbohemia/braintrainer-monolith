package com.atamie.braintrainer.multiplication.controllers;

import com.atamie.braintrainer.multiplication.challenge.ChallengeAttempt;
import com.atamie.braintrainer.multiplication.challenge.ChallengeAttemptDTO;
import com.atamie.braintrainer.multiplication.challenge.ChallengeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/attempts")
public class ChallengeAttemptController {
    private final ChallengeService challengeService;

    @PostMapping
    public ResponseEntity<ChallengeAttempt> postAttempt(@RequestBody @Valid ChallengeAttemptDTO challengeAttemptDTO){
        ChallengeAttempt challengeAttempt = challengeService.verifyAttempt(challengeAttemptDTO);
        log.info("Challenge Attempt: {}", challengeAttempt);
        return ResponseEntity.ok(challengeAttempt);
    }

    @GetMapping
    public ResponseEntity<Iterable<ChallengeAttempt>> getlastAttempts(@RequestParam("alias") String alias){

        return ResponseEntity.ok(challengeService.getStatsForUser(alias));
    }
}
