package com.programmers.todo.frame;

import java.util.ArrayList;

public interface dao<T,V> {
	
	//CURD ����� �޼ҵ� ����
	//�� �� ���
	public void insertToDoList(T t) throws Exception;
	
	//�� �� ����
	public void updateToDoList(T t) throws Exception;
	
	//�� �� ����
	public void deleteToDoList(V v) throws Exception;
	
	//���� ����� �� �� ��� ��ȸ
	public ArrayList<T> selectNowList() throws Exception;
	
	//�켱 ������ �ִ� ���� ����� �� �� ��� ��ȸ
	public ArrayList<T> selectPriNowList() throws Exception;
	
	//�Ϸ��� �� �� ��� ��ȸ
	public ArrayList<T> selectDoneList() throws Exception;
	
	//�켱 ������ �ִ� �Ϸ��� �� �� ��� ��ȸ
	public ArrayList<T> selectPriDoneList() throws Exception;
	
	//���߿� �� �� ��� ��ȸ
	public ArrayList<T> selectLaterList() throws Exception;
	
	//�켱 ������ �ִ� ���߿� �� �� ��� ��ȸ
	public ArrayList<T> selectPriLaterList() throws Exception;
	
	//��ü �� �� ��� ��ȸ
	public ArrayList<T> selectAllList() throws Exception;
}

