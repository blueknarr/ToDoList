package com.programmers.todo.controller;
 
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.programmers.todo.service.ToDoService;
import com.programmers.todo.vo.ToDoVO;
 
@Controller
public class HomeController {
	
	@Resource(name="todoService")
	ToDoService service;
	
	//메인 페이지로 이동
    @RequestMapping("home.do")
    public String home(Model model) throws Exception {
        //데이터 베이스에서 현재 할 일의 개수 가져오기
		int numOfNow = service.getNowList().size() + service.getPriNowList().size();
        int numOfDone = service.getDoneList().size() + service.getPriDoneList().size();
        int numOfLater = service.getLaterList().size() + service.getPriLaterList().size();
        //jsp에 값 전달하기
        model.addAttribute("numOfNow", numOfNow);
        model.addAttribute("numOfDone", numOfDone);
        model.addAttribute("numOfLater", numOfLater);
        
        return "home";
    }
    
    //할 일 등록
	@RequestMapping(value="upload.do", method=RequestMethod.POST)
	public String upload(HttpServletRequest request) {
		System.out.println("uploaddd");
		// 1. 사용자 입력 정보 추출
		String title = request.getParameter("title");
		String state = request.getParameter("state");
		String content = request.getParameter("content");
		String priority = request.getParameter("priority");
		String regDate = request.getParameter("regDate");
		String dlDate = request.getParameter("dlDate");
		
		// 2. 데이터 베이스에 저장
		try {
			ToDoVO vo = new ToDoVO
					(0, title, Integer.parseInt(state), 
							 content, Integer.parseInt(priority), "2012", dlDate);
			System.out.println(vo);
			service.registerToDoList(vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:home.do";
	}
    
    //NOW 페이지로 이동
	@RequestMapping("now.do")
	public ModelAndView now(Model model,HttpServletResponse response) throws Exception {
        //데이터 베이스에서 현재 할 일의 개수 가져오기
		int numOfNow = service.getNowList().size() + service.getPriNowList().size();
        int numOfDone = service.getDoneList().size() + service.getPriDoneList().size();
        int numOfLater = service.getLaterList().size() + service.getPriLaterList().size();
        //jsp에 값 전달하기
        model.addAttribute("numOfNow", numOfNow);
        model.addAttribute("numOfDone", numOfDone);
        model.addAttribute("numOfLater", numOfLater);
		   				
        ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("centerpage","now");
				
		return mv;
	}
	
    //DONE 페이지로 이동
	@RequestMapping("done.do")
	public ModelAndView done(Model model) throws Exception {
        //데이터 베이스에서 현재 할 일의 개수 가져오기
		int numOfNow = service.getNowList().size() + service.getPriNowList().size();
        int numOfDone = service.getDoneList().size() + service.getPriDoneList().size();
        int numOfLater = service.getLaterList().size() + service.getPriLaterList().size();
        //jsp에 값 전달하기
        model.addAttribute("numOfNow", numOfNow);
        model.addAttribute("numOfDone", numOfDone);
        model.addAttribute("numOfLater", numOfLater);
        
        ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("centerpage","done");
		return mv;
	}
	
    //LATER 페이지로 이동
	@RequestMapping("later.do")
	public ModelAndView later(Model model) throws Exception {
        //데이터 베이스에서 현재 할 일의 개수 가져오기
		int numOfNow = service.getNowList().size() + service.getPriNowList().size();
        int numOfDone = service.getDoneList().size() + service.getPriDoneList().size();
        int numOfLater = service.getLaterList().size() + service.getPriLaterList().size();
        //jsp에 값 전달하기
        model.addAttribute("numOfNow", numOfNow);
        model.addAttribute("numOfDone", numOfDone);
        model.addAttribute("numOfLater", numOfLater);
        
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("centerpage","later");
		return mv;
	}
}