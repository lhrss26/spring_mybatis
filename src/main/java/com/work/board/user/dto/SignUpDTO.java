package com.work.board.user.dto;

import lombok.Data;

@Data
public class  SignUpDTO {
    private String id;

    private String pass1;
    private String pass2;
    private String name;
    private String email;

}
