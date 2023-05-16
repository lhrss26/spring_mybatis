package com.work.board.board.service;

import com.work.board.board.dao.BoardDAO;
import com.work.board.board.dto.BoardDTO;
import com.work.board.board.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

        @Autowired
        BoardDAO boardDao;

        public void write(BoardDTO boardDTO) {
                boardDao.writeWord(boardDTO);
        }

        public List<Board> getList(){
                System.out.println("list:"+ boardDao.getList());
                return boardDao.getList();
        };

        public Board getDetail(Long board_id){
                return boardDao.getDetail(board_id);
        };
        public Board getUpdate(Long board_id){
                System.out.println("getUpdate:"+ boardDao.getUpdate(board_id));
                return boardDao.getUpdate(board_id);
        }
        public void postUpdate(BoardDTO boardDTO){
                //System.out.println("postUpdate:" + boardDao.postUpdate(boardDTO));
                boardDao.postUpdate(boardDTO);
        }
        public void getDelete(Long board_id){
                boardDao.getDelete(board_id);
        }
//
//        public List<CompanyVO> list() {
//            return BoardDAO.listCompany();
//        }
//
//        public void delete(CompanyVO vo) {
//            BoardDAO.deleteCompany(vo);
//        }
}
