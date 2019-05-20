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
	
	//���� �������� �̵�
    @RequestMapping("home.do")
    public String home(Model model) throws Exception {
        //������ ���̽����� ���� �� ���� ���� ��������
		int numOfNow = service.getNowList().size() + service.getPriNowList().size();
        int numOfDone = service.getDoneList().size() + service.getPriDoneList().size();
        int numOfLater = service.getLaterList().size() + service.getPriLaterList().size();
        //jsp�� �� �����ϱ�
        model.addAttribute("numOfNow", numOfNow);
        model.addAttribute("numOfDone", numOfDone);
        model.addAttribute("numOfLater", numOfLater);
        
        return "home";
    }
    
    //�� �� ���
	@RequestMapping(value="upload.do", method=RequestMethod.POST)
	public String upload(HttpServletRequest request) {
		System.out.println("uploaddd");
		// 1. ����� �Է� ���� ����
		String title = request.getParameter("title");
		String state = request.getParameter("state");
		String content = request.getParameter("content");
		String priority = request.getParameter("priority");
		String regDate = request.getParameter("regDate");
		String dlDate = request.getParameter("dlDate");
		
		// 2. ������ ���̽��� ����
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
    
    //NOW �������� �̵�
	@RequestMapping("now.do")
	public ModelAndView now(Model model,HttpServletResponse response) throws Exception {
        //������ ���̽����� ���� �� ���� ���� ��������
		int numOfNow = service.getNowList().size() + service.getPriNowList().size();
        int numOfDone = service.getDoneList().size() + service.getPriDoneList().size();
        int numOfLater = service.getLaterList().size() + service.getPriLaterList().size();
        //jsp�� �� �����ϱ�
        model.addAttribute("numOfNow", numOfNow);
        model.addAttribute("numOfDone", numOfDone);
        model.addAttribute("numOfLater", numOfLater);
		   				
        ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("centerpage","now");
				
		return mv;
	}
	
    //DONE �������� �̵�
	@RequestMapping("done.do")
	public ModelAndView done(Model model) throws Exception {
        //������ ���̽����� ���� �� ���� ���� ��������
		int numOfNow = service.getNowList().size() + service.getPriNowList().size();
        int numOfDone = service.getDoneList().size() + service.getPriDoneList().size();
        int numOfLater = service.getLaterList().size() + service.getPriLaterList().size();
        //jsp�� �� �����ϱ�
        model.addAttribute("numOfNow", numOfNow);
        model.addAttribute("numOfDone", numOfDone);
        model.addAttribute("numOfLater", numOfLater);
        
        ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("centerpage","done");
		return mv;
	}
	
    //LATER �������� �̵�
	@RequestMapping("later.do")
	public ModelAndView later(Model model) throws Exception {
        //������ ���̽����� ���� �� ���� ���� ��������
		int numOfNow = service.getNowList().size() + service.getPriNowList().size();
        int numOfDone = service.getDoneList().size() + service.getPriDoneList().size();
        int numOfLater = service.getLaterList().size() + service.getPriLaterList().size();
        //jsp�� �� �����ϱ�
        model.addAttribute("numOfNow", numOfNow);
        model.addAttribute("numOfDone", numOfDone);
        model.addAttribute("numOfLater", numOfLater);
        
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("centerpage","later");
		return mv;
	}
}