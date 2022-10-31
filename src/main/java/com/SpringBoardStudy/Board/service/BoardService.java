package com.SpringBoardStudy.Board.service;

import com.SpringBoardStudy.Board.entity.Member;

import java.util.Optional;

public interface BoardService {

    Iterable<Member> selectAll();

}
