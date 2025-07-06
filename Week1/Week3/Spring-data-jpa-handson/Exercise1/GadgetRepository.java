package com.example.repository;

import com.example.entity.Gadget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GadgetRepository extends JpaRepository<Gadget, Integer> {
    // No need to write any method — basic CRUD is inherited
}
