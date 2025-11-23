package edu.kh.todoList.model.service;

<<<<<<< HEAD
import static edu.kh.todoList.common.JDBCTemplate.*;

import java.sql.Connection;

=======
import java.sql.Connection;
>>>>>>> 5995733 (TodoList)
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dao.TodoListDAO;
import edu.kh.todoList.model.dao.TodoListDAOImpl;
import edu.kh.todoList.model.dto.Todo;

<<<<<<< HEAD
=======
import static edu.kh.todoList.common.JDBCTemplate.*;

>>>>>>> 5995733 (TodoList)
public class TodoListServiceImpl implements TodoListService{

	private TodoListDAO dao = new TodoListDAOImpl();
	
<<<<<<< HEAD
	
=======
>>>>>>> 5995733 (TodoList)
	@Override
	public Map<String, Object> todoListFullView() throws Exception {
		
		// 커넥션 생성
		Connection conn = getConnection();
		
<<<<<<< HEAD
		// dao 호출 및 반환하기
		// 1) 할 일 목록 얻어오기
		List<Todo> todoList = dao.todoListFullView(conn);
		// 2) 완료된 할 일 갯수 카운트
		int completeCount = dao.getCompleteCount(conn);
		
		// Map 에 1, 2번으로 얻어온 데이터들을 세팅하여 리턴
		// -> 메서드에서 반환은 하나의 값 또는 객체밖에 할 수 없기 때문
		// Map 이라는 컬렉션을 이용해 여러 형태의 값을 한번에 묶어서 반환
		
		Map<String, Object> map = new HashMap<>();
		
=======
		// dao 호출 및 반환받기
		// 1) 할 일 목록 얻어오기 
		List<Todo> todoList = dao.todoListFullView(conn);
		
		// 2) 완료된 할 일 갯수 카운트
		int completeCount = dao.getCompleteCount(conn);
		
		// Map에 1,2 번으로 얻어온 데이터들을 세팅하여 리턴
		// -> 메서드에서 반환은 하나의 값 또는 객체밖에 할 수 없기때문
		// Map이라는 컬렉션을 이용해 여러형태의 값을 한번에 묶어서 반환
		Map<String, Object> map = new HashMap<>();
>>>>>>> 5995733 (TodoList)
		map.put("todoList", todoList);
		map.put("completeCount", completeCount);
		
		close(conn);
		
		return map;
	}

<<<<<<< HEAD

=======
>>>>>>> 5995733 (TodoList)
	@Override
	public int todoAdd(String title, String detail) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.todoAdd(conn, title, detail);
		
<<<<<<< HEAD
		// DML => 트랜잭션 제어처리
		if(result > 0) commit(conn);
		else			rollback(conn);
		
=======
		// DML -> 트랜잭션 제어처리
		if(result > 0) commit(conn);
		else			rollback(conn);
		
		close(conn);
>>>>>>> 5995733 (TodoList)
		
		return result;
	}

<<<<<<< HEAD


=======
	@Override
	public Todo todoDetail(int todoNo) throws Exception {
		
		Connection conn = getConnection();
		
		Todo todo = dao.todoDetail(conn, todoNo);
		
		close(conn);
		
		return todo;
	}

	@Override
	public int todoComplete(int todoNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.todoComplete(conn, todoNo);
		
		if(result > 0) commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}
	
	@Override
	public int todoDelete(int todoNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.todoDelete(conn, todoNo);
		
		if(result > 0) commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}
	
	@Override
	public int todoUpdate(int todoNo, String title, String detail) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.todoUpdate(conn, todoNo, title, detail);
		
		if(result > 0) commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}
	
>>>>>>> 5995733 (TodoList)
}
