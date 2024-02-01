package edu.kh.oop.baiise;

public class Nation {

	
	String name;
	int age;
	char gender;
	String juminNumber;
	String tel;
	String address;
	
	
	/*기능*/
	public void spaekKorean() {
		System.out.println("가나다라 한국어 가능");
	}

	public void welfare() {
		System.out.println("우리나라에서 제공하는 복지를 누릴 수 있음 ");
	}
	
	public void 납세의의무() {
		if(age>=19) {
			System.out.printf("%s님은 세금 납부 대상자 입니다\n",name);
		}else {
			System.out.printf("%s님은 %d세 미성년자로 세금 납부 대상자 아닙니다\n",name,age);
		}

	}
	
	
	/**
	 * 자기 소개 기능
	 */
	public void  introduce() {
		System.out.printf("이름은 %s이고, %d세 %c성 입니다\n",name, age,gender);
		
	}
	
}
