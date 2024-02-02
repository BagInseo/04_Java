package edu.kr.oop.cls.field.pack1;

public class FieldRun1 {
	public static void main(String[] args) {
		
		
		//FieldTest1 객체 생성
		FieldTest1 f1=new FieldTest1();
		
		System.out.println(f1.publicValue);
		System.out.println(f1.protectedValue);
		System.out.println(f1.defaultValue);
		
		//private은 접근불가
		//왜 ? 다른 클래스에서 접근 불가
//		System.out.println(f1.privateValue);
	}

}
