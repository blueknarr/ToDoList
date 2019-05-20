package com.programmers.todo.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.programmers.todo.dao.mapper.todoMapper;
import com.programmers.todo.frame.dao;
import com.programmers.todo.vo.ToDoVO;

@Repository("todoDAO")
public class ToDoDAO implements dao<ToDoVO,String> {

	@Autowired
	private todoMapper mapper;
	
	@Override
	public void insertToDoList(ToDoVO t) throws Exception {
		mapper.insertToDoList(t);
	}

	@Override
	public void updateToDoList(ToDoVO t) throws Exception {
		mapper.updateToDoList(t);
	}

	@Override
	public void deleteToDoList(String v) throws Exception {
		mapper.deleteToDoList(v);
	}

	@Override
	public ArrayList<ToDoVO> selectNowList() throws Exception {
		return mapper.selectNowList();
	}

	@Override
	public ArrayList<ToDoVO> selectPriNowList() throws Exception {
		return mapper.selectPriNowList();
	}

	@Override
	public ArrayList<ToDoVO> selectDoneList() throws Exception {
		return mapper.selectDoneList();
	}

	@Override
	public ArrayList<ToDoVO> selectPriDoneList() throws Exception {
		return mapper.selectPriDoneList();
	}

	@Override
	public ArrayList<ToDoVO> selectLaterList() throws Exception {
		return mapper.selectLaterList();
	}

	@Override
	public ArrayList<ToDoVO> selectPriLaterList() throws Exception {
		return mapper.selectPriLaterList();
	}

	@Override
	public ArrayList<ToDoVO> selectAllList() throws Exception {
		return mapper.selectAllList();
	}
}
