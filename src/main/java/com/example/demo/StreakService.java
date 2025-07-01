package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Service
public class StreakService {

    @Autowired
    private StreakRepository streakRepository;

    @Autowired
    private UserRepository userRepository;

    public Streak updateStreak(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Optional<Streak> optionalStreak = streakRepository.findByUser(user);

        Streak streak = optionalStreak.orElseGet(() -> {
            Streak s = new Streak();
            s.setUser(user);
            s.setCurrentStreak(1);
            s.setWeeklyStreak(1);
            s.setLastVisit(LocalDate.now());
            return s;
        });

        LocalDate today = LocalDate.now();
        LocalDate lastVisit = streak.getLastVisit();

        if (lastVisit == null) lastVisit = today.minusDays(1);

        long diff = ChronoUnit.DAYS.between(lastVisit, today);

        if (diff == 0) {
            return streak;
        } else if (diff == 1) {
            streak.setCurrentStreak(streak.getCurrentStreak() + 1);
            streak.setWeeklyStreak(streak.getWeeklyStreak() + 1);
        } else {
            streak.setCurrentStreak(1);
            streak.setWeeklyStreak(1);
        }

        if (today.getDayOfWeek() == DayOfWeek.MONDAY &&
                lastVisit.getDayOfWeek() != DayOfWeek.SUNDAY) {
            streak.setWeeklyStreak(1);
        }

        streak.setLastVisit(today);
        return streakRepository.save(streak);
    }

    public Optional<Streak> getStreak(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return streakRepository.findByUser(user);
    }
}
