package com.qkrfowns45.restpractice.repository;

import com.qkrfowns45.restpractice.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long>{

    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title,String content);
}
