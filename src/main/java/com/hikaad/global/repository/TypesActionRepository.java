package com.hikaad.global.repository;

import com.hikaad.global.model.TypeAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypesActionRepository extends JpaRepository<TypeAction, Long> {

    @Query("select t from TypeAction t order by t.name asc")
    List<TypeAction> findAll();
}
