package com.work.board.board.service;

import com.work.board.board.dto.BoardDTO;
import com.work.board.board.entity.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    void write(BoardDTO boardDTO);

    public List<Board> getList();

    public Board getDetail(Long board_id);
    public Board getUpdate(Long board_id);
    void postUpdate(BoardDTO boardDTO);

    void getDelete(Long board_id);
//    void insert(CompanyVO vo);
//    List<CompanyVO> list();
//    void delete(CompanyVO vo);
}
