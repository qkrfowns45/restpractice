package com.qkrfowns45.restpractice.service;

import com.qkrfowns45.restpractice.model.Board;
import com.qkrfowns45.restpractice.model.User;
import com.qkrfowns45.restpractice.repository.BoardRepository;
import com.qkrfowns45.restpractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board){
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
