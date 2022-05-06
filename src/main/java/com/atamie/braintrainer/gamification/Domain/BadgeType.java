package com.atamie.braintrainer.gamification.Domain;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum BadgeType {
    BRONZE("Bronze"),
    SILVER("SIlver"),
    GOLD("Gold"),
    FIRSTWIN("First Win"),
    SUPERB("Superb");

    private String description;
    /*BadgeType(String des){
        description = des;
    }*/

    public String getDescription() {
        return description;
    }
}
