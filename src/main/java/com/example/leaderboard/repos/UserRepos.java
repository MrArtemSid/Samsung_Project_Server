package com.example.leaderboard.repos;

import com.example.leaderboard.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepos extends JpaRepository<User, Long> {
    List<User> findAllByName(String name);
    List<User> findByOrderByPoints();
}
