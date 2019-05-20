package com.programmers.todo.vo;

public class ToDoVO {
	private int no;
	private String title;
	//DONE: 0, NOW: 1, LATER: 2
	private int state;
	private String content;
	private int priority;
	private String regDate;
	private String dlDate;
	
	public ToDoVO() {
		
	}

	public ToDoVO(int no, String title, int state, String content, int priority, String regDate, String dlDate) {
		this.no = no;
		this.title = title;
		this.state = state;
		this.content = content;
		this.priority = priority;
		this.regDate = regDate;
		this.dlDate = dlDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getDlDate() {
		return dlDate;
	}

	public void setDlDate(String dlDate) {
		this.dlDate = dlDate;
	}

	@Override
	public String toString() {
		return "ToDoVO [no=" + no + ", title=" + title + ", state=" + state + ", content=" + content + ", priority="
				+ priority + ", regDate=" + regDate + ", dlDate=" + dlDate + "]";
	}
}
