package com.programmers.todo.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.programmers.todo.vo.ToDoVO;

public class Test {
	 public static void main(String[] args) throws Exception {
	  String id = "winuser";
	  String pwd = "4321";
	  String url = "jdbc:mysql://13.125.169.151:3306/todolist_db";
	  
	  ArrayList<ToDoVO> list = new ArrayList<ToDoVO>();
	  String driver = "org.mariadb.jdbc.Driver";
	  
	  Class.forName(driver);
	  //CREATE
	  //String sql = "INSERT INTO todo VALUES (#{no},#{title},#{state},#{content},#{priority},#{regdate},#{dldate})";
	  //String sql = "INSERT INTO todo VALUES (null,'���α׷��ӽ�2',1,'ȭ���ϱ��� ����',1,'20190517','20190519')";
	  //String sql = "INSERT INTO todo VALUES (null,'��Ƽ��2',2,'�ٴ����ֿ�',1,'20190517','20190523')";
 	  String sql = "INSERT INTO todo VALUES (null,'�ڵ��׽�Ʈ2',0,'���������׽�Ʈ',1,'20190505','20190512')";
	  //�о����
	  //String sql = "SELECT * FROM todo";
	  //���� ����, �Ϸ�, ����
	  //String sql = "SELECT * FROM todo WHERE STATE=0";
	  //String sql = "SELECT * FROM todo WHERE STATE=1";
	  //String sql = "SELECT * FROM todo WHERE STATE=2";
	  //������Ʈ
	  //String sql = UPDATE todo SET title=#{title}, state=#{state},content=#{content},priority=#{priority},regdate=#{regdate}, dldate={dldate} WHERE no=#{no};
	  //String sql = "UPDATE todo SET title='���α׷��ӽ�3', state=1,content='�����ϱ��� ����',priority=1,regdate='20190517012205', dldate='20190518142202' WHERE no=4";
	  //�����
	  //String sql = "DELETE FROM todo WHERE title='���α׷��ӽ�2'";
	  Connection con = 
	  DriverManager.getConnection(url, id, pwd);
	  PreparedStatement pstmt = 
	    con.prepareStatement(sql);
	  ResultSet rset = pstmt.executeQuery();

	  while(rset.next()) {
	   String no = rset.getString("no");
	   String title = rset.getString("title");
	   String state = rset.getString("state");
	   String content = rset.getString("content");
	   String priority = rset.getString("priority");
	   String regdate = rset.getString("regdate");
	   String dldate = rset.getString("dldate");
	   System.out.println(no+" "+title+" "+state+" "+content+" "+priority
			   +" "+regdate+" "+dldate);
	   ToDoVO td = new ToDoVO(Integer.parseInt(no),title,Integer.parseInt(state),content,Integer.parseInt(priority),regdate,dldate);
	   list.add(td);
	  }
	  rset.close();
	  pstmt.close();
	  con.close();
	  System.out.println("------------------------------------------------------------");
	  System.out.println("");
	  System.out.println(list.size());
	 }
}