package edu.kh.poly.pack3.model.run;

import edu.kh.poly.pack3.model.dto.Calculartor;
import edu.kh.poly.pack3.model.dto.Machine;
import edu.kh.poly.pack3.model.dto.PISCalculator;

public class CalculatorRun {
public static void main(String[] args) {
		
	
	//인터페이스 장점:
	// 상속 받은 클래스들의 형태가 똑같거나 비슷하기 때문에
	//코드 유지 보수 시
	//참조하는 객체만 변경하면 유지 보수가 완료된다.
	  
		Calculartor cal = new PISCalculator();
	
		
		System.out.println( "두 수의 합 : "+cal.plus(1, 2) );
		System.out.println( "두 수의 차 : "+cal.minus(10, 7) );
		System.out.println( "두 수의 곱 : "+cal.multi(10, 7) );
		System.out.println( "두 수의 나눈 결과 : "+cal.div(3,9) );
		System.out.println( "두 수의 나눈 나머지 : "+cal.mod(3,14) );
		System.out.println( "sum : "+cal.sum(1,2,3,4,5,6,7,8,9,10) );
		
		System.out.println( "원의 넓이: "+cal.areaOfCircle(5) );
		System.out.println( "값의 범위 : "+cal.rangeCheck(10000) );
		System.out.println( "pow : "+cal.pow(2,10) );
		System.out.println( "toBinary : "+cal.toBinary(15) );
		System.out.println( "toHexadecimal : "+cal.toHexadecimal(15) );
			
		
		
		//참조 변수의 자료형을 Machine으로 강제 형변환 해야지만
		//powerOn(),powerOff()를 호출 가능\
		Machine machine=(Machine)cal;
		machine.powerOn();
		machine.powerOff();
		
		
		
	}
}
