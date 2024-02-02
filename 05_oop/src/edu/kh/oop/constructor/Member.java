package edu.kh.oop.constructor;

public class Member {
	
	
	/*오버로딩(Over Loding:과적)
	 * - 한 클래스 내에 동일한 이름의 메서드를 여러 개 작성하는 기법
	 * - 같은 이름의 메서드가 수행하는 기능은 기본적으로 같으나
	 * 	 전달되는 매개 변수에 따라서 조금씩 동작이 달라야 하는 경우
	 *   상황별로 정의
	 *   
	 * -오버로딩의 조건
	 * 1)메서드 이름은 똑같아야 한다
	 * 2)매개 변수는 개수, 타입, 순서가 하나라도 달라야 한다
	 * */
	
	
	
	//필드(==멤버 변수)
	//- 클래스 변수 : static이 붙은 필드
	//				=>static 메모리에 할당 될 때 클래스명.변수명으로 할당되기 떄문에
	//- 인스턴스 변수 : static이 없는 변수
	//				=>인스턴스(객체)가 생성될 떄 heap 메모리에 할당되기 때문에
	
	private String memberId;	//아이디
	private String memberPw;	//비밀번호
	private String memberName;	//이름
	private int memberAge;		//나이
	
	
	//생성자 : 객체 생성 시 필드를 초기화 혹은 특정 기능을 수행하는 
	//  		일종의 메서드
	//작성 규칙
	//1)반환형 없음
	//2)생성자 이름은 클래스명과 동일
	
	/*기본생성자*/
	//- 매개 변수가 없는 형태 
	//- 생성자가 하나도 작성되지 않은 경우 컴파일러가 자동으로 추가
	public  Member() {
		//생성 시 수행할 기능 
		System.out.println("[기본] 생성자로 Member 객체 생성됨");
		
		//생성 시 객체 초기화
		memberId="ID를 입력해 주세요";
		memberPw="PW를 입력해 주세요";
		memberName="이름를 입력해 주세요";

	}
	
	
	
	/*매개 변수 생성자*/
	// - 객체 생성 시 매개 변수로 전달된 값을
	// 	 생성된 객체의 필드에 초기화 용도의 생성자

	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		System.out.println("[매개 변수] 생성자로 Member 객체 생성됨");
		
		//this.== 생성되고 있는 객체
		this.memberId=memberId;
		this.memberPw=memberPw;
		this.memberName=memberName;
		this.memberAge=memberAge;
	}
	
	
	
	//오버로딩을 이용해서 생성자 만들기
	public Member(String memberId) {//매개 변수 개수가 다름
		this.memberId=memberId;
	}
	
	public Member(String memberId, String memberPw) {//매개 변수 개수가 다름
		this.memberId=memberId;
		this.memberPw=memberPw;
	}
	
	public Member(int memberAge) {//매개 변수의 타입이 다름
		this.memberAge=memberAge;
	}
	
	public Member(String memeberId,int memberAge) {//매개 변수의 타입이 다름
		this.memberId=memeberId;
		this.memberAge=memberAge;
	}
	
	public Member(int memberAge,String memeberId) {//매개 변수의 순서가 다름
		this.memberAge=memberAge;
		this.memberId=memeberId;
	}
	
	
	
	//오버로딩이 안되는 경우
	//Duplicate method Member(int, String) in type Member
	
	//->Member(int,String) 생성자 중복
	//-->오버로딩은 변수명이 아닌 자료형이 개수, 순서, 타입 중
	//   하나라도 달라야 성립!
//	public Member(int memberAge,String memberPw) {}
	
	
	/*this() 생성자*/
	//현재 클래스에 있는 다른 생성자를 호출
	//-> 코드 중복 감소(길이 감소)
	public Member(int memberAge, String memberId, String memberPw) {
		this(memberAge,memberId); 
		this.memberPw=memberPw;
	}
	
	
	
	
	
	
	//기능(메서드)
	//-객체가 가지고 있는 기능
	// (클래스 내부에 작성된 함수)
	
	//함수(function)
	// -프로그램에 정의된 기을
	// (클래스 외부에 작성된 함수)
	
	//메서드 반환혛: 메서드 종료 시 반환되는 자료형
	 
	
	//setter : 전달 받은 매개 변수로 현재 객체의 필에 대입
	public void setMemberId(String memberId) {
		this.memberId=memberId;
	}//setMemberId
	


	public void setMemberPw(String memberPw) {
		this.memberPw=memberPw;
	}//setMemberPw


	public void setMemberName(String memberName) {
		this.memberName=memberName;
	}//setMemberName


	public void setMemberAge(int memberAge) {
		this.memberAge=memberAge;
	}//setMemberAge
	
	
	//getter : 현재 객체의 필드를 외부에서 얻어갈 수 있게 반환

	public String getMemberId() {
		return memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	
	
	
	/**
	 *현재 객체의 필드 값을 한번에 출력 
	 */
	public void inform() {
		System.out.println("\n----------------------------");
		System.out.println("memberId: " +memberId);
		System.out.println("memberPw: " +memberPw);
		System.out.println("memberName: " +memberName);
		System.out.println("memberAge: " +memberAge);
		System.out.println("----------------------------\n");
	}
}
