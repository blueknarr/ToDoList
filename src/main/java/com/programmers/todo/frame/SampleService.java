package com.programmers.todo.frame;

import java.util.ArrayList;

public interface SampleService<T,V> {
	
	//CURD 기능의 메소드 구현
	//할 일 등록
	public void registerToDoList(T t) throws Exception;
	
	//할 일 수정
	public void modifyToDoList(T t) throws Exception;
	
	//할 일 삭제
	public void removeToDoList(V v) throws Exception;
	
	//현재 등록한 할 일 목록 조회
	public ArrayList<T> getNowList() throws Exception;
	
	//우선 순위가 있는 현재 등록한 할 일 목록 조회
	public ArrayList<T> getPriNowList() throws Exception;
	
	//완료한 할 일 목록 조회
	public ArrayList<T> getDoneList() throws Exception;
	
	//우선 순위가 있는 완료한 할 일 목록 조회
	public ArrayList<T> getPriDoneList() throws Exception;
	
	//나중에 할 일 목록 조회
	public ArrayList<T> getLaterList() throws Exception;
	
	//우선 순위가 있는 나중에 할 일 목록 조회
	public ArrayList<T> getPriLaterList() throws Exception;
	
	//전체 할 일 목록 조회
	public ArrayList<T> getAllList() throws Exception;
}
