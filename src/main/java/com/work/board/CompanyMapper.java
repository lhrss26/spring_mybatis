package com.work.board;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CompanyMapper {
	
	@Insert("INSERT INTO company(id, passwd, email) VALUES(#{company.id}, #{company.passwd}, #{company.email})")
	int insert(@Param("company") Company company);
}
