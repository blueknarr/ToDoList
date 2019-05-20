package com.programmers.todo.frame;

import java.util.ArrayList;

public interface dao<T,V> {
	
	//CURD 기능의 메소드 구현
	//할 일 등록
	public void insertToDoList(T t) throws Exception;
	
	//할 일 수정
	public void updateToDoList(T t) throws Exception;
	
	//할 일 삭제
	public void deleteToDoList(V v) throws Exception;
	
	//현재 등록한 할 일 목록 조회
	public ArrayList<T> selectNowList() throws Exception;
	
	//우선 순위가 있는 현재 등록한 할 일 목록 조회
	public ArrayList<T> selectPriNowList() throws Exception;
	
	//완료한 할 일 목록 조회
	public ArrayList<T> selectDoneList() throws Exception;
	
	//우선 순위가 있는 완료한 할 일 목록 조회
	public ArrayList<T> selectPriDoneList() throws Exception;
	
	//나중에 할 일 목록 조회
	public ArrayList<T> selectLaterList() throws Exception;
	
	//우선 순위가 있는 나중에 할 일 목록 조회
	public ArrayList<T> selectPriLaterList() throws Exception;
	
	//전체 할 일 목록 조회
	public ArrayList<T> selectAllList() throws Exception;
}

