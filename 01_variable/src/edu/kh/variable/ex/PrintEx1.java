package edu.kh.variable.ex;

public class PrintEx1 {
	public static void main(String[] args) {
		
/*
 * System.out==(이클립스 기준) console창			
		System.out.print();
		-()내의 값을 출력 후 줄바꿈x
		
		
	System.out.println();
		 ()내의 값을 출력 후 줄바꿈o
		
		
	첫 번째 매개변수""
	--패턴이 적용된 문자열 작성
	--패턴의 종류
	%d : 10진법 정수 (Decimal) (byte,short,int)
	%c : 문자 (char)
	%s : 문자열 (Strung)
	%b : 논리형 (boolean)
	%f : 실수형 (float/double)
	
	양수 : 오른쪽 정렬
	음수(-) : 왼쪽 정렬
	
	%숫자d : 정수가 출력된 칸을 숫자 만큼 확보
	ex) %6d=ㅁㅁㅁㅁㅁㅁ 
	
	%.숫자f : 소수점 아래 몇 째 자리까지 표시할지 지정
			(지정된 자리 아래에서 반올림 처리)
			
	- 두번째 매개 변수
	--첫번째 매개 변수 문자열 주 패턴에 들어갈 
	  변수 혹은 값을 순서대로 작성
*/		
		 
		
		System.out.print("이름: ");
		System.out.print("박인서 ");
		
		System.out.println("입니다. ");
		System.out.println("오늘도 재밌는 자바 공부~ ");
		
		System.out.println(); //줄만 바꿈
		
		String name="홍길동";
		int age=30;
		double height=178.34;
		char gender='남';
		boolean javaStudy=true;
		
		//홍길동은 30세 남성으로 키는 178.4cm이고, 자바 공부 여부: true
		System.out.printf("%s은 %d세 %c성으로 키는 %.1fcm이고, 자바 공부 여부: %b ",
				name, age,gender, height, javaStudy);
		
		
		System.out.println("\n----------------------------------");
		
		//20240125  홍길동 		   10000원 입금
		//20240125  아파트 관리비 120000원 출금
		//20240125  식자재마트    120000원 출금
		
		//\n== 개행 문자 (줄바꿈)
		System.out.printf("%8s  %-6s  %7d원 %s \n", "20240125","홍길동",10000,"입금");
		System.out.printf("%8s  %-6s  %7d원 %s \n", "20240126","아파트 관리비",120000,"출금");
		System.out.printf("%8s  %-6s  %7d원 %s \n", "20240127","식자재마트",120000,"출금");
		 
	}
}
