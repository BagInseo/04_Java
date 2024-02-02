package edu.kr.oop.cls.pack2;

import edu.kh.oop.baiise.Account;
import edu.kh.oop.baiise.Nation;

//ClassTest1과 다른 패키지에 존재하는 클래스
public class OtherClassTestRun {
	public static void main(String[] args) {
		
		//1. public class인 Nation과 Account 클래스를 이용해서 객체 생성
		Nation n1=new Nation();
		Account a1=new Account();
		//=>문제 없음(import도 잘됨)
		
		
		//2.(default) class인 ClasssTest1 클래스를 이용해 객체 셍성
//		ClassTest1 c1= new ClassTest1(); 
		//=> 다른 패키지에 존재하기 때문에 import가 불가능하다(외부 접근 불가)
		// => (default) 접금 제한자는 다른 패키지에서 접근 불가
	}

}
