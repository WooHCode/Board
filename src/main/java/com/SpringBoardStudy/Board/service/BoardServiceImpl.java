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
        return repository.findAll();
    }

    @Override
    public Optional<Member> selectOneById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Boolean checkText(Integer id) {
        Optional<Member> optMember = repository.findById(id);

        if(optMember.isPresent()){
            return false;
        }else {

        return true;}
    }

    @Override
    public void insertArticle(Member member) {
        repository.save(member);

    }

    @Override
    public void updateArticle(Member member) {
        repository.save(member);
    }

    @Override
    public void deleteArticleById(Integer id) {
        repository.deleteById(id);
    }
}
