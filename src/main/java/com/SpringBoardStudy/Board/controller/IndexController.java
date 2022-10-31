package com.SpringBoardStudy.Board.controller;

import com.SpringBoardStudy.Board.entity.Member;
import com.SpringBoardStudy.Board.form.MemberForm;
import com.SpringBoardStudy.Board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    BoardService service;

    @GetMapping
    public String showList(MemberForm memberForm, Model model){
        memberForm.setNewText(true);
        Iterable<Member> list = service.selectAll();

        model.addAttribute("list", list);
        model.addAttribute("title", "게시판 입니다.");


        return "index";
    }

    @PostMapping("/insert")
    public String insert(@Validated MemberForm memberForm, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        Member member = new Member();
        member.setText(memberForm.getText());
        member.setAuthor(memberForm.getAuthor());

        if(!bindingResult.hasErrors()){
            service.insertText(member);
            redirectAttributes.addFlashAttribute("complete", "등록 완료");
                return "redirect:/index";
        }else {
            return showList(memberForm, model);
        }
    }


}
