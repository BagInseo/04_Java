package edu.kh.loop.ex;

import java.util.Scanner;

/**
 * 중첩 반복문
 */
public class LoopEx2 {

	

	/**
	 * <pre>
	 * 다음 모양 출력하기
	 * 
	 * 1234
	 * 1234
	 * 1234
	 * </pre>
	 */
	public void method1() {
		
		for(int i=1; i<=3; i++) {
			
			for(int j=1;j<=4;j++) {
				System.out.print(j);
			}//for(1234출력)
			
			System.out.println();
		}//for(3번 반복)
		
	}//method1()
	
	
	
	
	
	/**
	 * <pre>
	 * 다음 모양 출력하기
	 * 
	 * 4321
	 * 4321
	 *   
	 * </pre>
	 */
	public void method2() {
		
		for(int i=1; i<=2; i++) {
			for(int j=4; j>=1; j--) {
				System.out.print(j);
			}//for
			System.out.println();
		}//for
	}//method2()
	
	
	
	
	
	/**
	 * <pre>
	 * 다음 모양 출력하기
	 * 
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 * 
	 * </pre>
	 */
	public void method3() {
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				System.out.printf("(%d, %d)",i,j);
			}
			System.out.println();
		}
	}//method3()
	
	
	
	
	public void method4() {
		
		for(int i=2; i>=0; i--) {
			for(int j=2; j>=0; j--) {
				System.out.printf("(%d, %d)",i,j);
			}
			System.out.println();
		}
	}//method4()
	
	
	
	
	
	/**
	 * 2단부터 9단까지 모두 출력
	 * 
	 * 2x1= 2  2x2= 4  2x3= 6
	 * 3x1= 3 ...
	 * 4x1= 4...
	 * ....
	 * 9x1= 9....9x9= 81
	 */
	public void method5() {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%2d\t",i,j,i*j);
			}//for
			System.out.println();
		}//for
	}//method5()
	
	
	
	
	/**
	 * <pre>
	 * 입력 받은 단 부터 9단까지 구구단 출력하기
	 * 단, 입력 값이 2~9 사이가 아니면 "잘못 입력 출력"
	 * 
	 * 단 입력 (2~9) : 7
	 * 
	 *  ======7단=====
	 *  7 x 1 =  7
	 *  7 x 2 = 14
	 *  ...
	 *  
	 *  ====8단=====
	 * </pre>
	 */
	public void method6() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("단 입력 (2~9): ");
		int input =sc.nextInt();
		
		if(input>=2 &&input<=9) {
			
			for(int i=input; i<=9; i++) {
				System.out.printf("=======%d단=======\n",i);
				for(int j=1; j<=9; j++) {
					
					System.out.printf("%d x %d = %2d\n", i,j,i*j);
				}//for
				System.out.println();
			}//for
			
		}else {System.out.println("잘못 입력");}
	}//method6()
	
	
	
	
	/**
	 * <pre>
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9
	 * </pre>
	 */
	public void method7(){
				
		int count=1;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {				
				System.out.print(count++ +" ");
			}//for
			System.out.println();
		}//for		
		
	}	//method7()
	
	
	
	
	/**
	 * <pre>
	 * ####
	 * ####
	 * ####
	 * ####
	 * 
	 * </pre>
	 */
	public void method8(){
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print("*");
			}//for
			System.out.println();
		}//for
		
	}//method8()
	
	
	
	
	/**
	 * <pre>
	 * *
	 * **
	 * ***
	 * ****
	 * 
	 * </pre>
	 */
	public void method9() {
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}//for
			System.out.println();
		}//for
		
	}//method8()
	
	
	
	
	
	
	/**
	 * <pre>
	 * ****
	 * ***
	 * **
	 * *
	 * </pre>
	 */
	public void method10() {
		
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}//for
			System.out.println();
		}//for
	}//method10()
	
	
	
}
