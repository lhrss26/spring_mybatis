package com.work.board.user.controller;

import com.work.board.user.dto.SignUpDTO;
import com.work.board.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/login")
	public String getLoginPage(){ //로그인 페이지
//		model. addAttribute();
//		moedl.addAttribut();
		return "user/login.html";
	}

	@PostMapping("/login")
	public String login(SignUpDTO signUpDTO){
		// 아이디 / 패스워드 확인 처리.
		// OK -> board/list로 '리다이렉트'

		//Fail -> '알림창 추가' / login 페이지 내용 다시 불러오기.
		return "redirect:/board/list";
	}

	@GetMapping("/signup")
	public String getSignupPage(ModelMap model) { //회원가입 페이지

		return "user/signupPage.html";
	}
	@PostMapping("/signup")
	public String signUp(SignUpDTO signUpDTO, ModelMap model){
		/*
		1. 공통된 사용자 이름이 있는지 확인한다.
		true: 에러(이미 존재하는 사용자 이름입니다.)
		false: continue(계속)
		2. 입력된 비밀번호 2개가 같은지 확인한다.
		true:continue
		false: 에러(비밀번호를 확인해 주세요)
		3.아이디 형식 확인(글자수 등등...)
		4.비밀번호 규칙 확인(대소문자 / 기호 등)
		에러가 있으면 -> 에러 내용을 화면에 추가해주고, user/signupPage.html 파일 불러오기.
		전부 문제가 없으면-> 사용자 생성 -> login

		*/
		boolean idCheck = userService.isUserNameExist(signUpDTO.getId());
		if(idCheck){
			model.addAttribute("alert","이미 존재하는 사용자 입니다. ");

			System.out.println("이미 존재하는 사용자. no");

			return "user/signUpPage.html";
		}
		userService.signUp(signUpDTO);
		return "redirect:/user/login";


	}

	/*
	public int post(@RequestBody CompanyDto companyDto) {
		return companyMapper.insert(companyDto);
	}
	 */
}
