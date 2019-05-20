package com.programmers.todo.frame;

import java.util.ArrayList;

public interface SampleService<T,V> {
	
	//CURD ����� �޼ҵ� ����
	//�� �� ���
	public void registerToDoList(T t) throws Exception;
	
	//�� �� ����
	public void modifyToDoList(T t) throws Exception;
	
	//�� �� ����
	public void removeToDoList(V v) throws Exception;
	
	//���� ����� �� �� ��� ��ȸ
	public ArrayList<T> getNowList() throws Exception;
	
	//�켱 ������ �ִ� ���� ����� �� �� ��� ��ȸ
	public ArrayList<T> getPriNowList() throws Exception;
	
	//�Ϸ��� �� �� ��� ��ȸ
	public ArrayList<T> getDoneList() throws Exception;
	
	//�켱 ������ �ִ� �Ϸ��� �� �� ��� ��ȸ
	public ArrayList<T> getPriDoneList() throws Exception;
	
	//���߿� �� �� ��� ��ȸ
	public ArrayList<T> getLaterList() throws Exception;
	
	//�켱 ������ �ִ� ���߿� �� �� ��� ��ȸ
	public ArrayList<T> getPriLaterList() throws Exception;
	
	//��ü �� �� ��� ��ȸ
	public ArrayList<T> getAllList() throws Exception;
}
