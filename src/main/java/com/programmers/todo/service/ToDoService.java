package com.programmers.todo.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmers.todo.dao.ToDoDAO;
import com.programmers.todo.frame.SampleService;
import com.programmers.todo.vo.ToDoVO;

@Service("todoService")
public class ToDoService implements SampleService<ToDoVO,String>{
	
	@Resource(name="todoDAO")
	private ToDoDAO todoDAO;
	
	@Override
	public void registerToDoList(ToDoVO t) throws Exception {
		todoDAO.insertToDoList(t);
	}

	@Override
	public void modifyToDoList(ToDoVO t) throws Exception {
		todoDAO.updateToDoList(t);
	}

	@Override
	public void removeToDoList(String v) throws Exception {
		todoDAO.deleteToDoList(v);
	}

	@Override
	public ArrayList<ToDoVO> getNowList() throws Exception {
		return todoDAO.selectNowList();
	}

	@Override
	public ArrayList<ToDoVO> getPriNowList() throws Exception {
		return todoDAO.selectPriNowList();
	}

	@Override
	public ArrayList<ToDoVO> getDoneList() throws Exception {
		return todoDAO.selectDoneList();
	}

	@Override
	public ArrayList<ToDoVO> getPriDoneList() throws Exception {
		return todoDAO.selectPriDoneList();
	}

	@Override
	public ArrayList<ToDoVO> getLaterList() throws Exception {
		return todoDAO.selectLaterList();
	}

	@Override
	public ArrayList<ToDoVO> getPriLaterList() throws Exception {
		return todoDAO.selectPriLaterList();
	}

	@Override
	public ArrayList<ToDoVO> getAllList() throws Exception {
		return todoDAO.selectAllList();
	}
}
