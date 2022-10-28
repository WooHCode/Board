package com.SpringBoardStudy.Board.controller;

import com.SpringBoardStudy.Board.entity.Member;
import com.SpringBoardStudy.Board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    BoardService service;

    @GetMapping
    public String showList(Member member, Model model){
        Iterable<Member> list = service.selectAll();

        return "index";
    }


}
