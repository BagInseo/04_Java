package edu.kr.oop.cls.field.pack2;

import edu.kr.oop.cls.field.pack1.FieldTest1;

public class FieldRun2 extends FieldTest1{
	public static void main(String[] args) {
		
		
		//FieldTest1 객체 생성
		FieldTest1 f1= new FieldTest1();
		
		System.out.println(f1.publicValue); //어디서든 접근 가능
		//System.out.println(f1.protectValue); //같은 패키지+ 상속
		//System.out.println(f1.defaultValue); //같은 패키지
		//System.out.println(f1.privateValue); //같은 클래스
		
	
	}

	public void method1() {
		//다른 패키지이지만 상속 상태이기 때문에
		//protected 접근 제한자를 작성한 필드에 접근 가능하다
		System.out.println(protectedValue);
	}
}
