package com.hikaad.global.repository;

import com.hikaad.global.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("select u from Users u where u.username = :username and u.password = :password")
    Users findUserByLogin(@Param("username") String username,
                          @Param("password") String password);
}