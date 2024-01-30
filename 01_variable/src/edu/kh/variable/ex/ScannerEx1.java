package edu.kh.variable.ex;

//import : 다른 패키지에 존재하는 클래스 가져오기
import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		
		/* Scanner 클래스
		 * 
		 * -사용자로부터 입력을 받기위해 java에서 제공하는 클래스
		 * 
		 * -java.util 패키지에 존재
		 *  ->import  구문 작성 필요
		 * 
		 * 
		 * -Scannner.next() : 단어(String)1개 입력
		 * 					공백 입력 시 입력 종료
		 * 
		 * -Scanner.nextLine() : 문자열(String)1개 입력
		 * 						엔터(개행 문자)입력	시 종료
		 * 
		 *  -Scanner.nextInt() : int형 정수 1개 입력
		 *  -Scanner.nextLong() : long형 정수 1개 입력
		 *  -Scanner.nextDouble() : double형 실수 1개 입력
		 *  
		 *  
		 * 
		 * */
		
		//Scanner 사용하기
		
		//1. 클래스 위에 import하는 구문 작성
		
		//2. import한 Scanner클래스를 이용해서 
		// 	Scanner 객체 생성
		// System.in : (이클립스) 키보드
	
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수 입력 1 : ");
		int num1=sc.nextInt(); //다음 입력된 정수를 얻어와 num1에 대입
		
		System.out.print("정수 입력 2 : ");
		int num2=sc.nextInt();
		
		System.out.print("실수 입력 2 : ");
		double num3=sc.nextDouble();
		
		System.out.print("단어 입력(2개) : "); //사과 바나나
		String word1=sc.next();
		String word2=sc.next();
		
		//-next() /nexyInt() /nextDouble() 등을 작성한 이 후에 
		//nextLine() 구쿤을 미리 한번 작성하기
		sc.nextLine();
		
		//Scanner 사용시 
		//입력되는 값이  Scanner의 입력 버퍼라는 곳에 저장된 후 
		//nextInt()면 버퍼에 저장된 값 ㅈ우 정수만 추출
		// -. 이 때, 정수와 같이 입력된 엔터가 버퍼에 남아있게 됨
		
		//이 후 nextLine() 해석 시
		//버퍼에서 다음 엔터까지 읽어오는 작업이 수행되는데
		//버퍼에 남아있던 엔터를 일거오기 때문에 아무것도 입력 못함
		
		//[해결 방법]
		//nextLine(0을 한번 호출 해서 남아있던 엔터가 빼버림(제거)
		System.out.print("문장 입력 : ");
		String str=sc.nextLine();
		
		System.out.printf("%d, \t\t %d, %f, %s, %s, %s \\ \" \' \n", 
				num1, num2, num3, word1, word2, str);

		
		}
}
