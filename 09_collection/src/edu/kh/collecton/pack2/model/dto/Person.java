package edu.kh.collecton.pack2.model.dto;

import java.util.Objects;

import javax.print.attribute.standard.MediaSize.Other;

public class Person {

	
	private String name;
	private int age;
	private char gender;
	
	
	
	public Person() {};
	
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	//객체가 같다(동일, 동등)를 어떻게 비교할까?
	//동일 : 가르키고 있는 것이 같다 
	//동등 : 값이 같음
	
	//동일 비교 : Object.hashCode() 메서드 오버라이딩
	//hash 함수 : 값을 넣으면 같은 길이의 문저열이 반환되는 함수
	//ex) 123-> qwerty
	//    abcdefghi -> asdfgh
	//(암호화에 많이 사용)
	
	//hashCode : 객체별 식별 코드
	//비슷한 예: 주민븡록 번호, 학번, 은핵 번호표	
	
	@Override//오버라이딩 잘 하고 있는지 검사
	public int hashCode() {
		//필드에 저장된 값을 이용해서 hashCode 생성
		
//		return name.hashCode()+age*31+gender*31;
		
		
		//Objects 관련 유용한 기능 모음
		return Objects.hash(name,age,gender);
		
	}
	
	
	//동등 비교 : equals() 메서드 오버라이딩
	
	@Override
	public boolean equals(Object obj) {
		
		//현재 객체의 필드와 
		//전달 받은 obj의 필드가 모두 같을 경우 true, 아니면 flase
		
		
		if(obj==null) return false;
		if(obj==this) return true; //바교 대상이 현재 객체
		if(!(obj instanceof Person)) return false; //같은 타입이 아니면 비교 불가 
		//다운캐스팅
		Person other=(Person)obj;
		
		return name.equals(other.name)
				&&age==other.age
				&&gender==other.gender;
	}
	
	
	
	

	
}
