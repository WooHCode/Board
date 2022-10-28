package com.SpringBoardStudy.Board.service;

import com.SpringBoardStudy.Board.entity.Member;

import java.util.Optional;

public interface BoardService {

    Iterable<Member> selectAll();

    Optional<Member> selectOneById(Integer id);

    Boolean checkText(Integer id);

    void insertArticle(Member member);

    void updateArticle(Member member);

    void deleteArticle(Member member);


}
