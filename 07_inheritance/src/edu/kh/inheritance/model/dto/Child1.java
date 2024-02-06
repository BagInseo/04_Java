package edu.kh.inheritance.model.dto;


// 상속 : 부모의 코드를 물려받아 자식이 자신의 것 처럼 사용

//상속 키워 : extends(확장하다)
//				-> 부모 코드를 자식이 물려 받아
//					자식의 전체 크기가 증가

public class Child1 extends Parent {
	
	//필드
	private String computer;
	
	
	//생성자
	public Child1() {
		System.out.println("Child1 기본 생성자로 생성");
	};
	
	//매개 변수 생성자
	public Child1(String computer) {
		this.computer=computer;
	}
	
	
	public String getComputer() {
		return computer;
	}//getter
	
	
	public void setComputer(String computer) {
		this.computer=computer;
	}//setter
	
	
	//child1의 필드 + 물려 받은 필드 문자역로 만들어 반환 
	public String informChild1() {
		return String.format("%s / %s / %d / %s / %s / ", lastName, address,getMoney(),getCar(),computer);
	}
	


}
