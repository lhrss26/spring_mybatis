package com.work.board.board.dao;

import com.work.board.board.dto.BoardDTO;
import com.work.board.board.entity.Board;
import lombok.Data;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface BoardDAO {

    @Insert("INSERT INTO board (title,content,user_num,create_date) VALUES (#{title},#{content},30,NOW())")
    void writeWord(BoardDTO boardDTO);

    @Select("SELECT user.user_id as userId, board.* FROM board JOIN user ON board.user_num = user.id;")
    List<Board> getList();

    @Select("SELECT user.user_id as userId, board.* FROM board JOIN user ON board.user_num = user.id WHERE board.id = #{board_id}")
    Board getDetail(Long board_id);
    @Select("SELECT user.user_id as userId, board.* FROM board JOIN user ON board.user_num = user.id WHERE board.id = #{board_id}")
    Board getUpdate(Long board_id);
    @Update("UPDATE board SET title = #{title}, content = #{content} WHERE id = #{id}")
    void postUpdate(BoardDTO boardDTO);

    @Delete("DELETE FROM board WHERE board.id = #{board_id}")
    void getDelete(Long board_id);
}
