package edu.kh.exception.pack2.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingService2 {
	
	/*
	 * finally : 마지막에 반드시 수행하는 구문
	 * 
	 * -try 구문에서 예외 발생 여부와 관계 없이
	 *  무조건 수행해야되는 구문 작성
	 *  
	 * - try, catch, finally 또는 try~ finallt
	 * 
	 */
	
	private Scanner sc= new Scanner(System.in);

	
	
	public void method1() {
		System.out.println("1. 정상 수행 / 2. 강제 예외 발생 :");
		
		int input=sc.nextInt();
		
		try {
			if(input==1) System.out.println("[정상 수행]'");
			else						throw new RuntimeException();
			
		}catch(Exception e) {
			System.out.println("----캐치문 수행----");
		}
		finally{
			System.out.println("----무조건 수행----");
		}
	}
	
	
	
	
	public void method2() {
	
		
		//Scanner : 외부 장치 (키보드)와 연결하는 객체
		Scanner scan=new Scanner(System.in);
		
		//Resource leak 'scan ic never closed'
		//->프로그램 수행 후 sanc 이 메모리에 남아있어
		//  메모리 누수 (쓸때 없는 메모리 차지) 발생
		
		//[해결방법] Sannerㄹ를 close(메모리 반환) 하기
		//->코드에서 에외가 발생 하든 말든 무조건 close 수행 필수
		// -->finally가 이 코드를 수행하는 부합함!
		
		
		
		System.out.println("정수 입력 :");
		try {
			int input=scan.nextInt();
			System.out.println("입력한 정수 * 10 :" + (input*10));
			
		}catch(InputMismatchException e) {
			System.out.println("잘못 입력함");
		}finally {
			//scan이 참조하는 Scanner 객체가 존재 할 때
			
			if(scan != null) {
				
			}
		}
		}
	//method2()
	}
	

