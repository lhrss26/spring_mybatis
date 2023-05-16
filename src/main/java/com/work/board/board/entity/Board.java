package com.work.board.board.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Board {
    public long id;
    public String title;
    public String content;
    public long user_num;
    public Timestamp create_date;
    public String userId;
}
