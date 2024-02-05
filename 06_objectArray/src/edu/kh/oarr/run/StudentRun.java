package edu.kh.oarr.run;

import edu.kh.oarr.view.StudentView;

//자바 프로그래 실행용 클랫
public class StudentRun {
	public static void main(String[] args) {
		//실행 시 View 객체의  displayMenu() 메서드 호출
		new StudentView().displayMenu();
		
	}

}
