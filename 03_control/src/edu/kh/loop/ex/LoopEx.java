package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx {
	
	//필드(객체의 속성==객체의 변수)
	
	//Scanner 객체 생성
	Scanner sc= new Scanner(System.in);
	
	/**
	 * 1부터 10까지 출력하기
	 */
	public void method1() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);		
			}
		
	}//method1()

	
	
	/**
	 * 첫 번째 입력 받은 수부터
	 * 두 번째 입력 받은 수 까지 
	 * 1씩 증가하며 출력하기
	 */
	public void method2() {
		
		System.out.print("첫 번째 입력 : ");
		int input1=sc.nextInt();
		
		System.out.print("두 번째 입력 : ");
		int input2=sc.nextInt();
		
//		System.out.println("입력(1 2) : ");
//		int input1=sc.nextInt();//첫 번째 입력
//		int input2=sc.nextInt();//두 번째 입력
		
		
		for(int i=input1; i<=input2; i++) {
			System.out.println(i);
		}
		
	}//mrthod2()
	
	
	
	
	
	/**
	 * 10부터 1씩 1감소하기
	 */
	public void mathod3() {	
		for(int i=10; i>=1;i--) {
			System.out.println(i);
			}
		}//method3()
	
	
	
	
	/**
	 * 두 수를 입력 받아서 반복 추렭하는 구문을 작성
	 * (첫 번째 입력 A, 두 번째 입력B)
	 * 조건1: b가 a보다 큰 경우 -> A~B까지 1씩 증가
	 * 조건2:A가 B보다큰 경우 ->A~B까지 1씩 감소
	 * 조건3: 같다면-> "같은 수 입력됨"
	 */
	public void method4() {
		
		System.out.print("입력 (1 2)");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		if(a==b) {
			System.out.println("같은 수 입력됨");
			return;
		}
		
		if(a<b) {
			for(int i=a; i<=b; i++) {
				System.out.println(i);
			}
		}else{
			for(int i=a; i>=b; i--) {
				System.out.println(i);
			}
		}
				
		
	}//method4()
	
	
	
	/**
	 * 두 수를 입력 받아 1씩 증가하며 반복 출력하기
	 * (첫번째 a, 두번째 b)
	 * - 입력받은 두 수 중
	 *  작은 값이 초기식, 큰값이 조건싣에 사용되게 작성
	 *  (같은 경우 초기식 a,조건식b)
	 */
	public void method5() {
		
		System.out.print("두 수 입력 : ");
		int a =sc.nextInt();
		int b= sc.nextInt();
		
		
		for(int i=a; i<=b; i++) {
			System.out.println(i);
		}//for
		
		if(a>b) {
			for(int i=b; i<=a; i++) {
				System.out.println(i);
			}//for
		}//if

	}//method5()
	
	
	
	
	/**
	 * 두 수를 비교해서 최대, 최소값 구하기
	 */
	public void method5a() {
		System.out.print("두 수 입력 : ");
		int a =sc.nextInt();
		int b= sc.nextInt();
		
		int min;
		int max;
		
		if(a<=b) {
			min=a;
			max=b;
		}else {
			min=b;
			max=a;
		}
		
		for(int i=min; i<=max; i++) {
			System.out.println(i);
		}
		
	}//method5a()
	

	
	
	
	/**
	 * 최대, 최소값 구하기 v2(Math)
	 * - Java API 이용한 방법
	 * =>(자바 프로그램에서 제공하는 것을 이용하는 것)
	 */
	public void method5b() {
		System.out.print("두 수 입력 : ");
		int a =sc.nextInt();
		int b= sc.nextInt();
		
		
		int min=Math.min(a, b); //두 수중 작은 값을 반환
		int max=Math.max(a, b); //두 수중 큰 값을 반환
		
		for(int i=min; i<=max; i++) {
			System.out.println(i);
		}
	}//method5b()
	
	
	/**
	 * 변수 값 교환(swap)
	 */
	public void method5c() {
		System.out.print("두 수 입력 : ");
		int a =sc.nextInt();
		int b= sc.nextInt();
		
		if(a>b) { 
			int temp=a;
			a=b;
			b=temp;
		}//swap
		
		
		
	for(int i=a; i<=b; i++) System.out.println(i);
		
	}//method5c()
	
	
	
	
	/**
	 * 1부터 100사이  7의 배수의 개수 세기
	 */
	
	public void method6() {
		
		int count=0;
		
		for(int i=1; i<=100; i++) {
			
			if(i%7==0) { //i가 7의 배수인 경우
				count++;
			}
		}
		System.out.println(count);
	}//method6()
	
	
	
	public void method6a() {
		
		int count=0;
		
		for(int i=7; i<=100; i+=7) count++;
		
		System.out.println(count);
	}//method6a()
	
	
	
	
	/**
	 * 1부터  100사이 정수 중 
	 * 3의 배수의 개수(33)
	 * 3의 배수를 제외한 수 들의 합 출력(3367)
	 */
	public void method7() {
		int count=0;
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {count++;}
			else {sum+=i;}
		}
		System.out.printf("3의 배수의 개수 : %d \n", count);
		System.out.printf("3의 배수를 제외한 수의 합 : %d \n", sum);
	}//method7()
	
	
	
	
	
	/**
	 * 구구단 5단 출력하기
	 * 5 x 1 =  5
	 * 5 x 2 = 10
	 * ...
	 * 5 X 9 = 45
	 *
	 */
	public void method8() {

		for(int i=1; i<=9; i++){
			System.out.printf("5 * %d = %2d \n",i,5*i);
		}//for
	}//method8() 
	
	
	
	
	
	
}


