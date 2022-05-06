package com.atamie.braintrainer.multiplication.challenge;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service

public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService{
    private Random random;
    private final static int MINIMUM_FACTOR = 11;
    private final static int MAXIMUM_FACTOR = 100;

    @Override
    public Challenge randomChallenge(){
        return new Challenge(next(), next());
    }
    protected ChallengeGeneratorServiceImpl(){
        this.random = new Random();
    }

    public ChallengeGeneratorServiceImpl(Random random){
        this.random = random;
    }
    public int next(){
        return  MINIMUM_FACTOR + random.nextInt(MAXIMUM_FACTOR-MINIMUM_FACTOR);
    }
}
