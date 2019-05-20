package com.programmers.todo.dao.mapper;

import java.util.ArrayList;

import com.programmers.todo.vo.ToDoVO;

public interface todoMapper {
	
	public void insertToDoList(ToDoVO t);
	public void updateToDoList(ToDoVO t);
	public void deleteToDoList(String v);
	public ArrayList<ToDoVO> selectNowList();
	public ArrayList<ToDoVO> selectPriNowList();
	public ArrayList<ToDoVO> selectDoneList();
	public ArrayList<ToDoVO> selectPriDoneList();
	public ArrayList<ToDoVO> selectLaterList();
	public ArrayList<ToDoVO> selectPriLaterList();
	public ArrayList<ToDoVO> selectAllList();
}
