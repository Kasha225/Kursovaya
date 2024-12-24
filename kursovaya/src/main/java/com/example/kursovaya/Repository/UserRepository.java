package com.example.kursovaya.Repository;

import com.example.kursovaya.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email); // Найти пользователя по email
    Optional<User> findByNickname(String nickname); // Найти пользователя по nickname
}