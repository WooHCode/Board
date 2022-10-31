package com.SpringBoardStudy.Board.service;

import com.SpringBoardStudy.Board.entity.Member;
import com.SpringBoardStudy.Board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardRepository repository;


    @Override
    public Iterable<Member> selectAll() {
        return null;
    }
}
