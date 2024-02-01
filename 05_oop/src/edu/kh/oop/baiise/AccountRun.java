package edu.kh.oop.baiise;

public class AccountRun {
	public static void main(String[] args) {
		
		//Account 객체 생성
		Account a1=new Account();
		
		//private이 설정된 값과 안된 값 접근 가능 여부를 확인
		

		//The field Account.balance is not visible
		//private을 적용한 변수(필드)는 외부에서 보이지 않음(정보 은닉)
		
		//a1.name="홍길동";
		//a1.accountNumber="11111111";	
		//a1.balance
		
		//간접 접근 기능을 이용해서 값을 세팅
		a1.setName("신형만");
		a1.setAccountNumber("1234-56-7890");
		a1.setPassword("7890");
		
		//간접 접근 기능을 이용해서 객체의 속성을 얻어와 출력
		String name1=a1.getName();
		System.out.println(name1);
		
		
		///////////////////////////////////////////////////////////////
		
		Account a2=new Account();
		
		a2.setName("신짱아");
		a2.setAccountNumber("4567-23-4321");
		a2.setPassword("4321");

		//각 계좌에 입금
		a1.deposit(1000000L); 
		a1.deposit(500000L);
		
		a2.deposit(500000L);
		a2.deposit(50000L);
		System.out.println("--------------------------------------------------------");
		
		//각 계좌에서 출금
		a1.withdraw("1234", 200000);//비밀번호 불일치
		a1.withdraw("7890", 3000000);//잔액부족
		a1.withdraw("7890", 100000);//출금 성공
		
		
System.out.println("--------------------------------------------------------");
		
		//각 계좌에서 출금
		a2.withdraw("1234", 200000);//비밀번호 불일치
		a2.withdraw("4321", 3000000);//잔액부족
		a2.withdraw("4321", 100000);//출금 성공
	}
}
