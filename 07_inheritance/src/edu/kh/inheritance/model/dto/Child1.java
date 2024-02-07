package edu.kh.inheritance.model.dto;


// 상속 : 부모의 코드를 물려받아 자식이 자신의 것 처럼 사용

//상속 키워 : extends(확장하다)
//				-> 부모 코드를 자식이 물려 받아
//					자식의 전체 크기가 증가

public class Child1 extends Parent {
	
	// 필드
		private String computer;
		
		
		// 기본 생성자
		public Child1() {
			
			/* super() : super 생성자 / 부모 생성자 */
			// - 자식 객체 생성 시 부모 생성자를 호출하는 생성자
			// - super() 생성자는 항상 자식 생성자 첫 번째 줄에 작성
			super();
			
			System.out.println("Child1 기본 생성자로 생성");
		}
		
		
		
		// 매개 변수 생성자
		public Child1(String computer) {
			
			super("김", "경기도 부천시", 3000, "티코");
			
			this.computer = computer;
			System.out.println("Child1 매개 변수 생성자로 생성");
		}

		
		
		
		// alt [+shift] + s  ->  r
		public String getComputer() {
			return computer;
		}

		public void setComputer(String computer) {
			this.computer = computer;
		}
		
		// Child1의 필드 + 물려 받은 필드 문자열로 만들어 반환
		public String informChild1() {
			
			return String.format("%s / %s / %d / %s / %s", 
					lastName, address, getMoney(), getCar(), computer);
		}
		
		
		// 부모로 부터 상속 받은 introduce 메서드 
		// 오버라이딩(재정의) 하기
		public String introduce() {
			return "Child1 입니다";
		}
		
		
		// Object -> Parent 오버라이딩한 toString()을
		// 또 오버라이딩 하기
		
		@Override
		public String toString() {
			return super.toString() + "\nChild1.toString() : " + computer;
						// Parent.toString()
		}
		
		
		
		/*final 메서드 -> 오버라이딩 불가
		 * 
		 * -메서드의 기능이 변하면 안되는 경우
		 * 
		 * 
		 * */
		public final void onlyChild1() {
			System.out.println("final 메서드 입니다 ");
		}
		


}
