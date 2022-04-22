package com.qkrfowns45.restpractice.repository;

import com.qkrfowns45.restpractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{

}

