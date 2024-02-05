package edu.kh.condition.ex;

import java.util.Scanner;

/**
 * 조건문 기능용 클래스
 */
public class ConditionEx {

	//필드(객체의 속성==객체가 가지고 있는 값/변수)
	Scanner sc= new Scanner(System.in);
	
	
	
	
	/**
	 *  나이를 입력받아 19세 이상은 "성인", 미만은 "성인이 아닙니다" 
	 */
	public void method1() {
		
		System.out.print("나이 입력 : ");
		
		int age=sc.nextInt();
		
		if(age>=19) {
			System.out.print("성인");
		}else {
			System.out.println("성인이 아닙니다");
		}	
	}//method1()
	
	
	
	
	
	/**
	 * 나이를 입력 받아
	 * 13세 이하면"어린이"
	 * 13세 초과 18세이하 "청소년"
	 * 19세 이상 "성인"
	 */
	public void method2() {
		
		System.out.print("나이 입력 : ");
		int age=sc.nextInt();

		
		String result;
		
		if(age<=13) {
//			System.out.print("어린이");
			result="어린이";
		}
		else if(age>13 && age<=18) { //괄호와 age>13 생략 가능
//			System.out.print("청소년");
			result="청소년";
		}
		else {
//			System.out.print("성인");
			result="성인";
		}
		
		System.out.print(result);
		
	} //method2()
	
	
	
	
	
	
	/**
	 * 달(월)을 입력 받아 해당 계절 출력하기 
	 * <ul>
	 * <li>봄 : 3,4,5</li>
	 * <li>여름 : 6,7,8</li>
	 * <li>가을 : 9,10,11</li>
	 * <li>겨울 : 12,1,2</li>
	 * </ul> 
	 */
	public void method3() {
		System.out.print("달(월) 입력 : ");
		
		int month = sc.nextInt();
		String result;
		
		
		//방법1
		switch (month) {
		case 3,4,5: result="봄"; break;
		
		case 6,7,8:result="여름"; break;
		
		case 9,10,11:result="가을"; break;

		case 12,1,2: result="겨울"; break;
		
		default: result="잘못 입력"; break;
		}	
		
		
		//방법2
		if(month==3 || month==4 ||month==5) result="봄";
		else if(month==6 || month==7 ||month==8) result="여름";
		else if(month==9 || month==10 ||month==11) result="가을";
		else if(month==12 || month==1 ||month==2) result="겨울";
		else result="잘못 입력";
			
		
		 
		//방법3
		if(month>=3 && month<=5) result="봄";
		else if(month>=6 && month<=8) result="여름";
		else if(month>=9 && month<=11) result="가을";
		else if(month==12 || month==1 ||month==2) result="겨울";
		else result="잘못 입력";
		
		
		System.out.println(result);
	}//method3()
	
	
	
	/**
	 * P/F판별하기
	 * <pre>
	 * 중간고사, 기말고사 , 과제 점수를 입력 받아
	 * 총점 60점 이상일 경우 PASS, 아니면 FAIL
	 * 
	 * -중간고사(40%), 기말고사(50%), 과제(10%)
	 * -각각 100점 만점
	 * 
	 * 
	 * + PASS인 경우 
	 * 90점 이상 : A
	 * 80점 이상 : B
	 * 70점 이상 : C
	 * 60점 이상 : D
	 * </pre>
	 */
	public void method4() {
		
		System.out.print("중간고사 점수 : ");
		int middleTest=sc.nextInt();
		
		System.out.print("기말고사 점수 : ");
		int finalTest=sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int subject=sc.nextInt();
		
		
		
		double total= (middleTest*0.4)+(finalTest*0.5)+(subject*0.1);
		
		
		//변수에 아무런 값도 대입되지 않은 경우 사용 불가능(에러)
		//해결1) 모든 경우레 변수에 값을 대입
		//해결2) 변수 선언 시 특정한 값으로 초기화 진행
		//     -> 숫자는 0, String은 null/"",  boolean은 false 이 외에 객체들은 null
		
		
		String result=null;
		//The local variable result may not have been initialized
		//초기화 하지 않았을 때 생기는 오류
		
		String score = "F";
		
		if(middleTest<=100 && finalTest<=100 && subject<=100) {
			
			if(total>=60) {
				
//				if(total>=90 && total<100) score="A";
//				else if(total>=80 && total<90) score="B";
//				else if(total>=70 && total<80) score="C";
//				else score="D";
//				
				//switch문 매개변수로는 정수, 문자열, 문자만 가능
				//때문에 int로 강제 형변환
				switch((int)(total/10)) {
				case 10: result="A"; break;
				case 9: result="A"; break;
				case 8: result="B"; break;
				case 7: result="C"; break;
				case 6: result="D"; break;
				}
				
			}else{
				result="FAIL";
				}
			
			System.out.println(total);
			System.out.print(result);
			
		}//if
		
		else 
		{
			System.out.println("다시 입력");
		}//else
		
		
	}//method4()
	
	
	
	
	/**
	 * <pre>국어, 영어, 수학, 사탐, 과탐 점수를 입력 받아
	 * 40점 미만 과목이 있으면 FAIL
	 * 편균이 60점 미만인 경우도 FAIL
	 * 
	 * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
	 * 
	 * [출력 예시]
	 * 
	 * 1) 40점 미만 과목이 존재할 때
	 * 
	 * FAIL [40점 미만 과목 : 국어 영어]
	 * 
	 * 2) 평균이 60점 미만인 경우
	 * FAIL[점수 : 50.4 (평균 미달)]
	 * 
	 * 3)PASS인 경우
	 * PASS[점수 : 83.4]
	 * 
	 *
	 * </pre>
	 * 
	 */
	public void method5() {
		

		
		//40점 미만 ->true
		//40점 이상 ->false
		
		System.out.print("국어 : ");
		int kor=sc.nextInt();


		System.out.print("영어 : ");
		int eng=sc.nextInt();

		
		System.out.print("수학 : ");
		int math=sc.nextInt();

		
		System.out.print("사탐 : ");
		int society=sc.nextInt();

		
		System.out.print("과탐 : ");
		int science=sc.nextInt();
		
		String result="";
		boolean flag=false;
		
		
		
			
			
			if(kor<40) {result += "국어 "; flag=true;}
			if(eng<40) {result += "영어 "; flag=true;}
			if(math<40){result += "수학 "; flag=true;}
			if(society<40) {result += "사탐 "; flag=true;}
			if(science<40){result += "과학 "; flag=true;}
			
			if(flag) {
				System.out.printf("FAIL [40점 미만 과목: %s]\n", result);
				return;
			}
			

			

		
		double total= (kor+eng+math+society+science)/5;
		
		if(total<60.0) {
			result="FAIL";
			System.out.printf("%s[점수 : %.1f (평균 미달)]",result,total);
		}
		else {
			result="PASS";
			System.out.printf("%s[점수 : %.1f]",result, total);		
		}
		
	}//method5()
	
}//ConditionEx
