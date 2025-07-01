package com.example.demo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Streak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private int currentStreak;
    private int weeklyStreak;
    private LocalDate lastVisit;

    public Streak() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public int getCurrentStreak() { return currentStreak; }
    public void setCurrentStreak(int currentStreak) { this.currentStreak = currentStreak; }

    public int getWeeklyStreak() { return weeklyStreak; }
    public void setWeeklyStreak(int weeklyStreak) { this.weeklyStreak = weeklyStreak; }

    public LocalDate getLastVisit() { return lastVisit; }
    public void setLastVisit(LocalDate lastVisit) { this.lastVisit = lastVisit; }
}
