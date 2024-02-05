package edu.kh.oop.method;

import java.util.Scanner;

//기능 제공 클래스
public class StudentService {

	
	//필드
	private Scanner sc= new Scanner(System.in);
	
	
	/**
	 * 메인 메뉴 화면
	 */
	public void displayMenu() {
		
		int input=0; //scanner로 입력 받은 메뉴 변호를 저장할 변수
		
		
		// 학생 객체를 참조할 참조형 변수 2개 선언
		//(null : 참조하는 객체가 없음)
		Student std1=new Student("홍길동","112233",'남'); 
		Student std2=null;
		
		
		// do~while : 최소 1회 이상 반복
		do {
			
			System.out.println("""

=====학생 관리 프로그램=====
1. 학생 등룍
2. 학생 정보 확인
3. 학생 이름 수정
4. Java 공부하기
5. Html 공부하기
6. Java 역량 비교하기
7. Html 역량 비교하기
0. 프로그램 종료					
					""");
			
			System.out.print("메뉴 선택 >> ");
			input=sc.nextInt();
			
			switch(input) {
			
			case 1: 
				System.out.println("학생을 등록할 변수를 선택(1:std1 / 2:std2) : ");
				int  select=sc.nextInt();
				if(select==1) std1=createStudent();
				else		  std2=createStudent();
				break;
				
			case 2:
				System.out.println("정보를 조회할 학생 선택(1:std1 / 2:std2) : ");
				String text=null; //학생 정보가 담긴 문자열을 저장할 변수
				if(sc.nextInt()==1) text=stduentInform(std1);
				else		 		text=stduentInform(std2);	
				System.out.println(text); //반환된 결과
				break;
				
			case 3: 
				System.out.println("이름을 수정할 학생 선택(1:std1 / 2:std2) : ");
				if(sc.nextInt()==1) updateStudentName(std1);
				else				updateStudentName(std2);
				break;
				
			case 4: 
				System.out.print("Java 역량을 수정할 학생 숸택(1:std1 / 2:std2) :");
				
				if(sc.nextInt()==1) updateJava(std1);
				else 				updateJava(std2);
				break;
				
			case 5:
				System.out.println("Html 역량을 수정할 학생 숸택(1:std1 / 2:std2)");
				
				if(sc.nextInt()==1) updateHtml(std1);
				else				updateHtml(std2); 
				break;
				
			case 6: 
				String result=compareJava(std1, std2);
				System.out.println(result);
				break;
				
			case 7: 
				String resultHtml=compareHtml(std1,std2);
				System.out.println(resultHtml);
				break;
				
			case 0:  System.out.println("===== 프로그램 종료 ====="); break;
			default :
				
			}
			
			
		}while(input!=0); //input이 0이 아닐 때 반복
	}//displayMenu
	
	/**
	 * 학생 정보를 입력받아 생성된 Student 객체를 반환
	 * @return 생성된 Student 객체 주소
	 */
	private Student createStudent() {
		
		System.out.print("이름 : ");
		String name=sc.next();
		
		System.out.print("학번 : ");
		String studentNumber=sc.next();
		
		System.out.print("성별(남/여) : ");
		char gender=sc.next().charAt(0);
		//sc.next()로 입력받은 문자열 중 0번 인덱스 버넂 문자 하나를 반환받아 gender변수에 저장

		//Student 객체를 생성한 후 그 주소를 호출한 곳으로 반환한다
		return new Student(name, studentNumber, gender);
	}
	
	/**매개 변수로 전달 받은 학생의 정보를 문자로 만들어 반환
	 * @param s :std1 / std2(학생 객체 참조 주소)
	 * @return : 학생 정보가 작성된 문자열
	 */
	private String stduentInform(Student s) {
		
		//String.format("패턴",변수)
		//- 패턴 모양의 문자열을 반환하는 String 메서드
		return String.format("%s / %s / %c / %s / %d / %d",
				Student.schoolName, s.getStudentNumber(),
				s.getGender(),s.getName(),s.getJava(),s.getHtml());
	}
	
	/** 매개 변수로 전달 받은 학생 객체의 이름 수정
	 * @param s : std1 / std2(학생 객체 주소)
	 */
	private void updateStudentName(Student s) {
		System.out.print("수정할 학생 이름 : ");
		String newName=sc.next();
		
		String beforeName=s.getName();
		s.setName(newName);
		//학생 이름이 수정되었습니다.
		//홍길동 -> 홍길길
		
		System.out.print("학생 이름이 수정 되었습니다.");
		System.out.printf("%s -> %s \n",beforeName,newName);
	};
	
	private void updateJava(Student s) {
		System.out.print("증가 또는 감소한 Java 역량 입력(정수) : ");
		int input=sc.nextInt();
		
		//이전 점수 + 입력 받은 점수를 전달 받은 학생에게 세팅
		int before=s.getJava();
		s.setJava(before+input);
		
		// 점수가 최대/최소 값을 넘지 못하게 처리
		if(s.getJava()>Student.MAX_VALUE) s.setJava(Student.MAX_VALUE);
		if(s.getJava()<Student.MIN_VALUE) s.setJava(Student.MIN_VALUE);
		
		System.out.println("Java  역량 수정 완료");		
		System.out.printf("%d -> %d (%d)\n", before, s.getJava(),input);
	}
	
	private void updateHtml(Student s) {
	
		System.out.print("증가 또는 감소한 HTML 역량 입력(정수) : ");
		int input=sc.nextInt();
		
		int before=s.getHtml();
		s.setHtml(before+input);
		
		if(s.getHtml()>Student.MAX_VALUE) s.setHtml(Student.MAX_VALUE);
		if(s.getHtml()<Student.MIN_VALUE) s.setHtml(Student.MIN_VALUE);
		
		System.out.println("HTML  역량 수정 완료");		
		System.out.printf("%d -> %d (%d)\n", before, s.getHtml() ,input);
	}
	
	/**매개 변수로 전달 받은 두 Student 의 Java점수 비교
	 * @param s1
	 * @param s2
	 * @return
	 */
	private String compareJava(Student s1, Student s2) {
		
		//전달 받은 s1이 참조하는 Student 객체가 없을 경우
		
		if(s1==null) {
			return "첫 번째 학생이  등록되지 않았습니다. ";
		}
		
		if(s2==null) {
			return "두 번째 학생이  등록되지 않았습니다. ";
		}
		
		String result=String.format("%s : %d / %s : %d \n", s1.getName(),s1.getJava(),s2.getName(), s2.getJava());
		
		//두 학생의 점수 비교
		if(s1.getJava() > s2.getJava()) {
			return result + s1.getName()+"의 점수가 더 좊습니다.";
		}
		if(s1.getJava() < s2.getJava()) {
			return result + s2.getName()+ "의 점수가 더 좊습니다.";
		}
		
		return result + "점수가 같습니다.";
	}
	
	
	private String compareHtml(Student s1, Student s2) {
		
		//전달 받은 s1이 참조하는 Student 객체가 없을 경우
		
		if(s1==null) {
			return "첫 번째 학생이  등록되지 않았습니다. ";
		}
		
		if(s2==null) {
			return "두 번째 학생이  등록되지 않았습니다. ";
		}
		
		String result=String.format("%s : %d / %s : %d \n", s1.getName(),s1.getHtml(),s2.getName(), s2.getHtml());
		
		//두 학생의 점수 비교
		if(s1.getHtml() > s2.getHtml()) {
			return result + s1.getHtml()+"의 점수가 더 좊습니다.";
		}
		if(s1.getHtml() < s2.getHtml()) {
			return result + s2.getName()+ "의 점수가 더 좊습니다.";
		}
		
		return result + "점수가 같습니다.";
	}
	
 
}
