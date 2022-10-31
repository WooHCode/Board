package com.SpringBoardStudy.Board.repository;

import com.SpringBoardStudy.Board.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Member, Integer> {
}
