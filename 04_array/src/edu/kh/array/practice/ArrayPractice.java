package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 기능 작성 클래스
 */
public class ArrayPractice {

	Scanner sc= new Scanner(System.in);
	
	public void practice1() {
		int[] arr=new int[9];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			
			if(i%2==0) {
				sum+=arr[i];
			}//if
			
		}//for
		System.out.println("\n짝수 번째 인덱스 합 : "+sum);
	}//practice1()
	
	
	public void practice2() {
		int [] arr= new int[9];
		int sum=0;
		
		for(int i=8; i>=0; i--) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			
			if(i%2==1) sum+=arr[i];
		}
		System.out.println("\n홀수 번째 인덱스 합 : " +sum);
	}//practice2()
	
	
	
	public void practice3() {
		
		int[] arr=new int[5];
		int num=0;
		int num2=0;
		
		for(int i=0; i<arr.length;i++) {
			System.out.printf("입력 %d : ",i);
			num=sc.nextInt();
			arr[i]=num;
			
		}
		
		System.out.print("검색할 값: ");
		num2=sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==num2) {
				System.out.print("인덱스 : "+i);
				return;
			}
		}
		
		System.out.print("일치하는 값이 존재하지 않습니다. ");
		
	}//practice3()
	
	
	
	
}
