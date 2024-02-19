package edu.kh.test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class test {


	
	public static void main(String[] args) {
		
	test t= new test();
	t.method2();
		
	
	}//main
	
	public void method0() {
		String str= "가 나 다 라";
		String[] strArr=str.split("다");
		
		System.out.println(Arrays.toString(strArr));
		
	}//method0()
	
	public void method1() {
	try {
			
		}catch(Exception e) {
			e.printStackTrace();
		} 
//		catch(IOException e) {
//			e.printStackTrace();
//		};
	
	/*IOException[자식]  /  Exception[부모]
	 -다형성의 개념
	부모는 자식 객체를 받을 수 있지만, 자식은 부모 객체를 받을 수 없다.
	부모 타입이 자식 객체까지 다 처리해서, 하단에 있는 IOException까지 내려오지 않는다. 

	[에러 해결 방법]
	=> Exception은 예외 최고 조상이기 때문에 
		제일 마지막 절에 있어야 한다. 

*/
	}//method1()
	
	
	public void method2() {
		//임의의 값 5개를 갖는 strArr배열
		String[] strArr= new String[5];
		
		strArr[0]="가";
		strArr[1]="나";
		strArr[2]="다";
		strArr[3]="라";
		strArr[4]="마";
		
		System.out.println(Arrays.toString(strArr));
		
		//방법2
		
		String[] strArr1= {"가","나","다","라","마"};
		System.out.println(Arrays.toString(strArr1));


}//mrthod2()
	
	
}