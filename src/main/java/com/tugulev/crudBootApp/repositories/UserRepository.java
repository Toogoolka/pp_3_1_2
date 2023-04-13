package com.tugulev.crudBootApp.repositories;


import com.tugulev.crudBootApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContainsIgnoreCase(String name);
}
