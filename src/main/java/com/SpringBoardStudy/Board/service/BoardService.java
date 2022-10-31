package com.SpringBoardStudy.Board.service;

import com.SpringBoardStudy.Board.entity.Member;

import java.util.Optional;

public interface BoardService {

    Iterable<Member> selectAll();

    /** id로 한건을 가져옵니다. */
    Optional<Member> selectOneById(Integer id);

    /** 한건을 등록합니다 */
    void insertText(Member member);

    /** 한건을 가져와 수정합니다. */
    void updateText(Member member);
    /** id로 한건을 가져와 삭제를 합니다. */
    void deleteById(Integer id);





}
