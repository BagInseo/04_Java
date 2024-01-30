package edu.kh.variable.ex;
public class VariableEx3 {
	
	public static void main(String[] args) {
		
		/* ***** 강제 형변환 *****
		 * 1. 값의 범위가 큰 자료형 -> 작은 자료형으로 강제적 변환
		 * 	-> 데이터 손실 고려
		 * 
		 * 2. 의도적으로 자료형을 다른 자료형으로 변환 시킬 때
		 * 
		 * 
		 *  [작성법]
		 *  
		 *  (자료형)  변수명 || 값; // 지정된 자료형으로 변경됨
		 * */
		
		
		// 강제 형변환 확인 1 
		// -> 자료형 변환 + 데이터 손실
		int num1 = 290;
		byte result1 = (byte) num1; // 강제 형변환
		
		System.out.println("num1 : "    + num1);
		System.out.println("result1 : " + result1);
		
		
		
		// 강제 형변환 확인 2
		// - 실수를 정수로 변환해서 소수점을 없애기
		//   (데이터 손실을 활용)
		double num2 = 123.123456789;
		
		int result2 = (int) num2;
		
		System.out.println("num2 : "    + num2);
		System.out.println("result2 : " + result2);
		
		
		
		/* 난수 + 강제형변환 */
		
		// 난수 :   Math.random();
		// ->  0.0 <=  x  < 1.0
		
		// 1 ~ 10 사이 난수
		int random =  (int)(Math.random() * 10 + 1);
		// 난수에서 발생하는 소수 부분을 강제 형변환으로 제거
		
		System.out.println("random : " + random);
		
		
		
		// 강제 형변환 확인 3
		// -> 의도적으로 강제 형변환
		System.out.println( 123 ); // (int) 123
		System.out.println( (double)123 ); // -> (double) 123.0
		
		
		// 강제 형변환 확인 4
		//  + 값 처리 원칙 (같은 자료형 연산 -> 같은 자료형 결과)
		
		int num3 = 5;
		int num4 = 2;
		
		System.out.println( num3 / num4 ); //  5 / 2 == 2
		
		System.out.println( (double)(num3 / num4) ); 
		//  (dobule)(5 / 2) == 2.0
		//					 == 2
		
		System.out.println((double)num3 / (double)num4); 
		// (double)5 / (double)2
		// == 5.0 / 2.0
		// == (double)2.5
		
		
		/* 강제 형변환 + 자동 형변환 + 값 처리 원칙 */
		System.out.println((double)num3 / num4); 
		// (double)(int) 5  / (int) 2
		
		// * 강제 형변환
		// (double) 5.0  / (int) 2
		
		// * 자동 형변환
		// (double) 5.0  / (double) 2.0
		
		// * 값 처리 원칙
		// (double) 5.0  / (double) 2.0 == (double) 2.5
		
		
		

		// 강제 형변환 확인 5
		// 문자(char) <-> 유니코드(int)
		
		System.out.println("A의 번호 : " +  (int)'A' );
		
		System.out.println("84번의 문자 : " +  (char)84 ); // T
		
		
		
		// --------------------------------------------------
		
		// 오버 플로우 
		// : 연산으로 인해 자료형 값의 범위를 초과하는 경우 발생
		
		byte temp1 = 127;
		
		byte temp2 =  (byte)(temp1 + 1); // int 결과를 byte로 강제 형변환
		
		System.out.println("temp1 : " + temp1); // 127
		System.out.println("temp2 : " + temp2); // -128
		
		
	}
	
}


