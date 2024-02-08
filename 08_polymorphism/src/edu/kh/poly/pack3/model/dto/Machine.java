package edu.kh.poly.pack3.model.dto;

public interface Machine {
	// 인터페이스는 상수형 필드(public static final)만 작성 가능!
		// -> 작성하는 모든 필드가 public static final
		// -> public static final 구문을 명시적으로 작성하지 않아도
		//    묵시적으로 public static final로 인식된다! 
		
		//public static final int VOLT = 220;
		int VOLT = 220;
		
		// 인터페이스는 추상 메서드(public abstract)만 작성 가능!!
		// -> public abstract 생략 가능
		public abstract void powerOn();
		void powerOff();
}
