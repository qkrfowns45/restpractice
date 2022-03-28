package com.qkrfowns45.restpractice.repository;

import com.qkrfowns45.restpractice.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>{
}
