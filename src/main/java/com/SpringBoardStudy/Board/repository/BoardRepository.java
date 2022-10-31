package com.SpringBoardStudy.Board.repository;

import com.SpringBoardStudy.Board.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Member,Integer> {
}
