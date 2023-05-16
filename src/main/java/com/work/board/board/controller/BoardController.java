package com.work.board.board.controller;

import com.work.board.board.dto.BoardDTO;
import com.work.board.board.entity.Board;
import com.work.board.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

    @GetMapping("/list")
    public String getList(Model model){
        List<Board> boardList = boardService.getList();

        model.addAttribute("list",boardList);


        return "board/list.html";
    }

    @GetMapping("/detail")
    public String getDetail(Model model, Long board_id){
        model.addAttribute("detail", boardService.getDetail(board_id));
        return "board/detail.html";
    }

    @GetMapping("/write")
    public String getWrite(){

        return "board/write.html";
    }
    @PostMapping("/write")
    public String postWrite(BoardDTO boardDTO){

        boardService.write(boardDTO);
        return "redirect:/board/list";
    }

    @GetMapping("/update")
    public String getUpdate(Model model, long board_id){

        model.addAttribute("update", boardService.getUpdate(board_id));
        return "board/update.html";
    }


    @PostMapping("/update")
    public String postUpdate(BoardDTO boardDTO){

        boardService.postUpdate(boardDTO);

        return "redirect:/board/list";
    }
    @GetMapping("/delete")
    public String getDelete(Model model, long board_id){
        boardService.getDelete(board_id);
        return "redirect:/board/list";
    }
//	@PostMapping("")
//	public String list(Model model) {
//		model.addAttribute("list", mapper.변수명());
//		return "index";
//	}
//	// DB에 데이터를 저장하는 controller
//	@RequestMapping(value = "request 주소", method = RequestMethod.POST)
//	public String write(DTO dto) {
//		dto.setTitle(dto.getTitle().trim());
//		dto.setHit(dto.getHit());
//		dto.setWriteDate(dto.getWriteDate().trim());
//		dto.setWriter(dto.getWriter().trim());
//		mapper.write(dto);
//		System.out.println(dto);
//		return "redirect:";
//	}
//	/*
//	public int post(@RequestBody CompanyDto companyDto) {
//		return companyMapper.insert(companyDto);
//	}
//	 */
}
