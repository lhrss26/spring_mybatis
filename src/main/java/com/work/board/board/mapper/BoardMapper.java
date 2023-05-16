package com.work.board.board.mapper;

import com.work.board.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
	public List<BoardDTO> dto(); //DB 데이터 불러오는 메소드
	public void dto(BoardDTO dto); //DB에 데이터를 저장하는 메소드


	/*
	@Insert("INSERT INTO company(id, passwd, email) VALUES(#{company.id}, #{company.passwd}, #{company.email})")
	int insert(@Param("company") Company company);
	 */
}
