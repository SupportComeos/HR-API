package com.hikaad.global.repository;

import com.hikaad.global.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("select u from Users u where u.username = :username and u.password = :password")
    Optional<Users> findUser(String username, String password);
}