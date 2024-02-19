package edu.kh.todoList.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dao.TodoListDAO;
import edu.kh.todoList.model.dao.TodoListDAOImpl;
import edu.kh.todoList.model.dto.Todo;

public class TodoListServiceImpl implements TodoListService{
	
private TodoListDAO dao=null;
	
	
	//기본 생성자
	public TodoListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		dao=new TodoListDAOImpl();
	
	}

	@Override
	public Map<String, Object> todoListFullView() {//할 일 목록

		//1. 할 일 목록 DAO에서 얻어오기
		List<Todo> todoList =dao.todoListFullView();
		
		//2. 할 일 목록에서 완료 (complete 필드 값이 true)인 요소가 몇개인지 카운트
		int completeCount=0;
		
		for(Todo todo:todoList) {//TodoList 순차접근
			if(todo.isComplete()) completeCount++; //isComplete() ==getComplete()
		}
		
		//3. todoList, completeCount를 저장할 Map 생성
		//->메서드는 반환을 하나 밖에 못해서
		//  여러 개를 반환해야 되는 경우 묶어서 반환
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("todoList", todoList);
		map.put("completeCount", completeCount);
		
		
		//4.Map을 반환
		return map;
		
	}

	@Override
	public String dateFormat(LocalDateTime regDate) {
		//yyyy-MM-dd HH:mm:ss 형태 날짜 반환

		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		 
		 // regDate에 저장되어있는 날짜 데이터를
		 // formatter에 지정된 형식으로 변경
		 String formattedDateTime = regDate.format(formatter);
		return formattedDateTime;
	}//dateFormat
	
	

	@Override
	public String todoDetailView(int index) {
		//할 일 상세 조회
		Todo todo=dao.todoDetailView(index);
		
		//2. 반환 받은 todo가 null인 경우 null반환
		if(todo==null) return null;
		
		//3. Todo가 참조하는 객체가 있다면 문자열 가공
		StringBuilder sb = new StringBuilder(); 
		
		sb.append("--------------------------------------------\n");
		sb.append( String.format("제목 : %s\n", todo.getTitle()) );
		sb.append( String.format("등록일 : %s\n", dateFormat(todo.getRegDate())) );		
		sb.append( String.format("완료여부 : %s\n", todo.isComplete() ? "O" : "X") );
		sb.append("\n[세부 내용]\n");
		sb.append("--------------------------------------------\n");
		sb.append( String.format("%s\n", todo.getDetail()) );
		
		
		//4. 가공한 문자열을 반환
		return sb.toString();
	}//todoDetailView()

	
	
	@Override
	public int todoAdd(String title, String detail) throws FileNotFoundException, IOException {
		
		//Todo 객체 생성
		Todo todo = new Todo(title,detail,false, LocalDateTime.now());
		
		//DAO 메서드 호출 후 반환 받기
		int index=dao.todoAdd(todo); //추가된 index 또는 -1
		return index;
	}

	
	
	
	@Override
	public boolean todoComplete(int index) throws FileNotFoundException, IOException {
		return dao.todoComplete(index);
		//service메서드가 별도 처리를 하지 않음
		// -> 아무것도 안한다 해서 서비스를 사용하지 않으면 안된다!!
	}//todoComplete()

	
	
	
	@Override
	public boolean todoUpdate(int index, String title, String detail) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return dao.todoUpdate(index, title, detail);
	}

	@Override
	public String todoDelete(int index) throws FileNotFoundException, IOException {

		//DAO 메서드 호출 후 결과 반환 받기
		// -> 삭제된 Todo 또는 null
		Todo todo=dao.todoDelete(index);
		
		if(todo==null) return null;
		return todo.getTitle();
	}

	
}
