package com.atamie.braintrainer.gamification.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BadgeCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long badgeId;
    private String userId;
    private String badge;
    @EqualsAndHashCode.Exclude
    private LocalDateTime timeEarned;

    public BadgeCard(String uID, String badg){
        this(null, uID,badg, LocalDateTime.now());
    }

    public String getBadge() {
        return badge;
    }
}
