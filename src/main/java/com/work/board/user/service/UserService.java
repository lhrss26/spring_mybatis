package com.work.board.user.service;

import com.work.board.user.dao.UserDAO;
import com.work.board.user.dto.SignUpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void signUp(SignUpDTO signUpDTO);
    Boolean isUserNameExist(String username);

//    void insert(CompanyVO vo);
//    List<CompanyVO> list();
//    void delete(CompanyVO vo);
}
