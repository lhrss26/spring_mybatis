package com.work.board.user.service;

import com.work.board.user.dao.UserDAO;
import com.work.board.user.dto.SignUpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;
    @Override
        public void signUp(SignUpDTO signUpDTO) {
            System.out.println("signUp bool"+this.isUserNameExist(signUpDTO.getId()));
            Map<String, Object> map = new HashMap();
            //{user.userId},#{user.password},#{user.email},
            map.put("userId", signUpDTO.getId());
            map.put("password", signUpDTO.getPass1());
            map.put("email", signUpDTO.getEmail());
            System.out.println("signUp:" + map);
            userDAO.createUser(map);


    }

    @Override
    public Boolean isUserNameExist(String username) {
        //db에서 사용자 아이디가 이미 존재하는지 확인 -> mapper
        // mapper로 data를 넘겨줄때 쓰는 타입 : DAO
        boolean bool = userDAO.selectUserId(username);
        System.out.println(bool);
        return bool;
    }
}
