package edu.kh.collecton.pack4.model.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {
	
	/*
	 * Wrapper Class
	 * 
	 * - wrap : 감싸다, 포장하다
	 * - 기본 자료형을 객체로 감싸는 클래스
	 *  -> 기본 자료형의 객체화
	 *  
	 *  ->왜? 컬렉션 처럼 객체만 취급하는 상황에서 
	 *    기본 자료형도 취급 가능한 형태로 바꾸기 위해서
	 * 
	 * 				-->Boxing
	 * 
	 * Unboxing     <--
	 * 
	 * boolean		--> Boolena
	 * byte			--> Byte
	 * short		--> Short
	 * int			--> Integer
	 * long			--> Long
	 * float		--> Float
	 * double		--> Double
	 * char			--> Character 
	 * 
	 * 
	 *  * Boxing, Unboxing을 자동으로 수행되도록 구현되어 있음
	 *   -> Auto Boxing, Auto Unboxing
	 * 
	 * + Wrapper Calss를 이용해 객체화 되었을 때
	 *   추가적인 필드, 기능을 제공함
	 * 
	 */
	
	/**
	 * Auto Boxing, Auto Unboxing 확인
	 */
	public void method1() {
		int num1=100; //int
		//Integer wrap1=new Integer(num1);
		//삭제 예정인 방법(쓰지마ㅜㅜ)
		
		Integer wrap1=num1; //캄파일러가 Auto Boxing 수행 코드 추가
							//(int)num1 -> (Integer)num1
		
		int num2=wrap1.intValue(); //정수 값 반환(추천x)
		
		int num3=wrap1; //컴파일러가 Auto Unboxing 수행 토드 추가
						//(Integer) wrap1 ->(int)wrap1에 저장된 값
		
		long num4=10000000000L; //100억
		Long wrap2=num4; //auto boxing
		long num5=wrap2; //auto unboxing
		
		
		//Integer 객체만 저장하는 List
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(1000); //(int)1000 ->(Integer)1000 /Auto Boxing
		list.add(2000); 
		list.add(3000); 
		
		//print 구문 내에서
		//Wrapper 클래스로 만든 캨게를 참조할 때
		// .toString() 호출하는 것이 아닌
		//Auto Unboxing을 진행해서 기본 자료형으러 변경한다. 
		System.out.println(list.get(0)+list.get(1)+list.get(2));
		
	}
	
	
	
	/**
	 * Wrapper Class가 제공하는 필드, 메서드
	 * -> 대부분이 static!
	 *   -->클래스명.필드명/ 클래스명.메서드명() 사용
	 *   
	 */
	public void method2() {
		
		// 정수형, 실수형 공통
		System.out.println("byte의 용량 : "+Byte.BYTES + "바이트");
		System.out.println("byte의 용량 : "+Byte.SIZE + "비트");
		System.out.println("byte의 최대값 : "+Byte.MAX_VALUE);
		System.out.println("byte의 최소값 : "+Byte.MIN_VALUE);
		
		
		//실수형만 사용 가능
		System.out.println(Double.NaN);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
		
		//논리형은 true/false 밖에 없음
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		

		//-----------------------------------------------------------------
		
		//Stirng -> 기본 자료형 변환
		System.out.println("===========================================================");
		System.out.println("[Stirng -> 기본 자료형 변환]");
		
		//HTML 연결 시(요청 데이터 처리) 많이 사용
		// -> HTML에 관련된 모든 값은  String
		// 단, char(Character)는 별도로 존재하지 않음
		
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3"); //중요
		long l = Long.parseLong("4"); //중요
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2"); //중요
		boolean bool = Boolean.parseBoolean("true");

		System.out.println("변환 확인");
		
		
		
		System.out.println("===========================================================");
		System.out.println("[ 기본 자료형 변환 -> Stirng ]");
		
		
		// Wrapper Class를 이용하는 방법
		// -> 코드는 길지만 효율이 좋음
		int test1=400;
		String change1=Integer.valueOf(test1).toString(); //저장된 필드 값을 문자열로 저장하는 것
		
		double test2=4.321;
		String change2=Double.valueOf(test2).toString();;
		
		//String 이어쓰기를 이용한 방법
		// -> 코드는 짧으나 효율이 좋지 않음(속도 down , 메모리 소모 up)
		long test3=12345678910L;
		String change3=test3+""; //long + String -> String+String -> 이어쓰기
		
	}//method2()
	
	
	
	/**
	 * String의 불변성(immutable, 변하지 않는 성질 == 상수)
	 * - 문자열이 수정되면 새로운 String 객체가 생성됨
	 * 
	 * String을 ""리터럴을 이용해 생성/수정하면
	 * String Pool에 String 객체가 계속 새롭게 생성된다. 
	 * 
	 * ->수정으로 인해 참조 당하지 않는 String 객체가 바로 
	 * 삭제되지 않기 때문에 메모리를 계속 차지하는 문제 발생
	 * ->JVM의 GC가 관리를 해주지만
	 * 지워질 때 까지 메모리가 낭비되는 문제가 발생하여
	 * String의 수정을 권하지 않은(효율 낭비)
	 */
	public void method3() {
		
		//System.identityHashCode(str)
		 //-> 주소값을 이용해서 만든 해시코드(식별 번호)
		 //-> 같은 객체에 저장된 값이 변했다면 주소는 일정해야 된다
		 //->identityHashCode도 일정 해야된다. 
		String str="hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str="world";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str +="!!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		//->identityHashCode가 다 다른값?!!
		//-->str이 참조하고 있는 객체가 변하고 있다! 
		
	}//method3()
	
	
	/**
	 * String 리터럴("")로 생성된 객체 활용
	 * - 동일한 리터럴을 이용해 String 객체를 생성한 경우
	 *   추가적으로 객체를 생성하지 않고
	 *   기존에 존재하는 String 객체의 주소를 반환(재활용)
	 */
	public void method4() {
		String temp1="Hello";
		String temp2="Hello";
		
		System.out.println(System.identityHashCode(temp1)); //0x400생성
		System.out.println(System.identityHashCode(temp2)); //0x400 주소만 반환 받음
															//기존 객체 재활용 (얕은 복사)
		
		//같음을 비교
		
		//객체의 필드 값 비교
		System.out.println("저장된 값 비교"+temp1.equals(temp2)); //저장된 값 비교
		
		//변수에 저장된 값(주소)비교
		System.out.println("주소를 비교" + (temp1==temp2)); //저장된 값 비교
		
	}//method4()
	
	
	/**
	 * 사용자(개발자)가 관리하는 String 객체 생성
	 *  - "" 리터럴로 생성된 String -> JVM관리 (String Pool)
	 *  - new 연산자로 생성된 String -> 사용자 관리(Heap)
	 */
	public void method5() {
		String temp1="abcd"; //리터럴 생성
		String temp2=new String("abcd"); //new 연산자로 생성
		String temp3=new String("abcd");
		
		System.out.println("temp1 " + System.identityHashCode(temp1));
		System.out.println("temp2 " + System.identityHashCode(temp2));
		System.out.println("temp2 "
				+ "" + System.identityHashCode(temp3));
		
		// 셋 다 주소가 다름 =="abcd"를 재활용 하지 않음
		// -> 값은 같지만 전부 다른 객체
	}//method5()
	
	
	/**
	 * StringBuilder/StringBuffer 클래스
	 * - String의 불변성 문제를 해결한 클래스
	 * ->가변성(mutable)
	 * 
	 * -기본 16글자 저장할 크기로 생성
	 *  저장되는 문자열의 길이에 따라 크기가 증가/감소
	 *  ->마음대로 문자열 수정, 삭제 가능!
	 *  ->수정, 삭제를 해도 추가적인 객체 생성이 없어 효율 좋음  
	 *  
	 *  
	 *  -StringBulider : Thread Safe 미제공(비동기)
	 *  -StringBuffer  : Thread Safe    제공(동기)
	 */
	public void method6() {
		//StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		//StringBuilder 객체에 문자열을 쌓아 나가는 방식으로 사용
		// -> 뒤에 추가, 앞에 추가
		sb.append("오늘 점심은 ");//"오늘 점심은"
		System.out.println(System.identityHashCode(sb));
		sb.append("무엇을 먹을까요?");//"오늘 점심음" + "무엇을 먹을까요?'
		System.out.println(System.identityHashCode(sb));
		
		sb.insert(0, "2원14일 ");
		System.out.println(System.identityHashCode(sb));
		
		//identityHashCode 값이 일정
		//== 참조하는 객체가 변하지 않음
		// 객체 내에 값만 수정되고 있다==가변성
		 
		System.out.println(sb);

		
		//StringBuilder -> String
		String temp =sb.toString(); //객체에 저장된 필드를 문자열로 반환
		
		//String[] 문자열.spilt("구분자")
		//=문자열을 "구분자"를 기준으로 쪼개어 String[]로 반환
		String[] arr= temp.split(" ");
		for(String str: arr) {
			System.out.println(str);
		}
	}//method6()
	
}






































