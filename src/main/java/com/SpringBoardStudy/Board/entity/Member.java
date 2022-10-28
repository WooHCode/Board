package com.SpringBoardStudy.Board.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    private Integer id;

    @NotBlank
    private String title;

    @NotBlank
    private String name;

    @NotBlank
    private String date;

    private Integer count;
}
