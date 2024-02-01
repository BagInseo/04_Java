package edu.kh.array.practice;

import java.lang.reflect.Array;
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
		
		System.out.println("양의 정수 : ");
		int input =sc.nextInt();
		
		int[] arr= new int[input];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=i+1;
		}
		System.out.print(Arrays.toString(arr));
	}//practice3()

	
	public void practice4() {
		
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
		
	}//practice4()
	
	
	
	public void practice5() {
		
		System.out.print("정수 : ");
		int len=sc.nextInt();
		
		int[] arr= new int[len];
		int sum=0;
		
		for(int i=0; i<len; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값: ",i);
			int input= sc.nextInt();
			arr[i]=input;		
			sum+=arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("총 합 : " +sum);
		
	}//practice5()
	
	
	
	public void practice6() {
		
		
		System.out.print("주민등록번호(-포함) : ");
		String idNum=sc.next();
		
		int len=idNum.length();
		char[] idArr=new char[len];

		for(int i=0; i<len; i++) {
			
			if(i<=7) idArr[i]=(idNum.charAt(i));
			else idArr[i]='*'; //char이기 때문에 '' 사용
			
		}
		for(int i=0; i<len; i++) {
			System.out.print(idArr[i]);
			}
		}//practice6()
	
	
	public void practice7() {
		//조건에 맞는 수가 입력될 떄까지 입력
		//+break
		
		//배열 요소에 대입되는 숫자는 count값을 ++,--를 이용해 제어
		
		int len=0;
		
		while(true) {//무한 루프
			//3이상의 홀수가 입력될 때 까지
			
			System.out.print("정수 : ");
			len =sc.nextInt();
			
			//입력 받은 정수가 3이상의 홀수인 경우 반복을 종료
			if(len>=3 && len%2==1) {break;}

			//if문 수행x ==> 3이상이 아니거나 짝수인 경우			
			System.out.println("다시 입력하세요");
			
		}//while()
		
		//입력 받은 정수 크기 만큼의 배열 선언
		int[] arr= new int[len];
		
		int count=0; //arr배열 요소에 대입될 수
		
		for(int i=0; i<len; i++) {
			if(i<=len/2) {
				count++;
				arr[i]=count;
			}
			else {
				count--;
				arr[i]=count;
			}
		}//for
		System.out.println(Arrays.toString(arr));
		
	}//practice7()

	
	
	public void practice8() {
		
		int[] arr= new int[10];
//		String str="";
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
//			str+=arr[i]+"";
			
		}
		System.out.print("발생한 난수 : "+ Arrays.toString(arr));
		
	}//practice8()
	
	
	
	public void practice9() {
		int[] arr= new int[10];
		int min=0; //최소값 저장용
		int max=0; //최대값 저장용

		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			
			if(i==0) {
				max=arr[i];
				min=arr[i];
				continue;//다음 반복으로 이동
			}
			
			if(arr[i]>max) {max=arr[i];}
			if(arr[i]<min) {min=arr[i];}
			
		}
		
		System.out.println("발생한 난수 : "+ Arrays.toString(arr));
		System.out.println("최대값 : "+ max );
		System.out.println("최소값 : "+ min );
	}//practice9()

	
	public void practice10() {
		
		int[] arr= new int[10];
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--; //바깥쪽 i값의 증가를 막아서
						 //현재 인덱스 번째 요소에 다시 새로운 난수를 생성				
					break;//중복을 발견했으니 추가적인 검사 필요x
					
				}//if
			}//for
		}//for
		System.out.print(Arrays.toString(arr));
	}//practice10()
	
	
	

	
	public void practice11() {
		int[] lotto=new int[6];
		
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45+1);
			
			for(int x=0; x<i; x++) {
				if(lotto[i]==lotto[x]) 
					i--;
					break;

			}//중복 제거		
		}//for
		
		for(int i=0; i<lotto.length-1;i++) {
			for(int x=i+1; x<lotto.length; x++) {
				if(lotto[i]>lotto[x]) {
					int temp= lotto[i];
					lotto[i]=lotto[x];
					lotto[x]=temp;
				}//if
			}//for
		}
		
//		Arrays.sort(lotto);  자바에서 제공해주는 배열 오름차순 정렬 기능
		
		System.out.println(Arrays.toString(lotto));
	}
}
	
	

