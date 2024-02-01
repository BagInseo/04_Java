package edu.kh.oop.baiise;


public class BasicRun {

	public static void main(String[] args) {
		
		
		//국민 객체 생성
		//==국민(Narion) 클래스의 내용대로 heap영역에 할당되는 것
		
		Nation n1=  new Nation();
		
		
		//점, 하위 접근 연산자(.)
		//객체의 속성/기능을 접근 ,홏ㄹ, 실행 시키는 연산자
		
		n1.name="홍길동";
		n1.age=34;
		n1.gender='남';
		n1.introduce();
		
		//Nation 객체 참조 변수 n2에
		//Heap 영역에  Nation 클래스를 이용해 생성된 객체의 주소를 대입
		Nation n2= new Nation();
		n2.name="신짱구";
		n2.age=5;
		n2.gender='남';
		n2.introduce();
		
		Nation n3= new Nation();
		n3.name="봉미선";
		n3.age=29;
		n3.gender='여';
		n3.introduce();
		
		//납세의 의무 확인
		n1.납세의의무();
		n2.납세의의무();
		n3.납세의의무();
		
		
	}
}
