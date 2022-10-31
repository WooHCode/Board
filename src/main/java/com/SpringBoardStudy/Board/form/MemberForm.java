package com.SpringBoardStudy.Board.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberForm {

    private Integer id;

    @NotBlank
    private String text;

    private String date;

    @NotBlank
    private String author;

    private Boolean newText;


}
