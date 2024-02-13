package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Book;

//컬렉션 : java에서 자료구조를 만들어서 모아둔 것

//특징
//1) 크기 제한 없음(부족하면 자동으로 증가)
//(java.util)
//2)추가, 수정, 삭제, 검샘 등 다양한 기능이 구현되어 있음
//3) 객체만 저장 가능
//  (기본 자료형은 안됨.. 하지만 Wrraper클리샐를 이용하면 된다. )



public class ListService {

	//List:  자료를 순차적으로 나열한 자료 구조
	//- 인덱스가 존재
	//-> 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능
	
	/**
	 * LIst 사용 해보기
	 */
	public void method1() {
		// List 객체 생성
		// - List (인터페이스) -> 객체 생성 불가 -> 다형성 이용
		// - ArrayList (클래스) (List의 후손)
		
//		List list = new ArrayList(); // 10칸 짜리 생성
			List list =new ArrayList();//10칸 짜리 생성
			
			//반환형 베서드명(매개변수)
			
			//E(Element) : 요소를 뜻하는 상징적인 글자(자료형x)
			//						==Object, String, Student 등
			//							자료형 가리지 않고 들어갈 수 있다 
			
			//1.boolean add(E e): 마지막 요소로 추가
			list.add("아무거나");
			list.add(new Object());
			list.add(12341234);  //int가 Integer(Wrapper 클래스)로 변환 
								 // ->컴파일러가 자동으로 변환을 해준다. 
			
			
			list.add(3.123123);//크기 3 초과 했을 때 오류 발생 확인
			list.add(false);
			
			//=> 오류 x
			//왜?? 크기가 자동으로 늘어나서
			
			
			System.out.println(list);
			
			//2. E get(int index) : List에서 index번째 요소 반환 받기
			//3. int size : List에 저장된  요소 개수를 받기
			System.out.println("저장된 개수 : "+ list.size()); //5
			
			
			//0번 부터 list의 저장된 개수 미만까지 1씩 증가하며 반복
			for(int i=0; i<list.size();i++) {
				System.out.printf("%d 번째 인덱스 : ", i);
				System.out.println(list.get(i));
				
				
				//list의 i번째 요소가 String인 경우
				if(list.get(i) instanceof String) {
					System.out.println("[String자료형 입니다.]");
					continue;
				}
				//List의 i번째 요소가 int(->Integer 변환)인 경우
				if(list.get(i) instanceof Integer) {
					//Incompatible conditional operand types Object and int
					System.out.println("*****integer자료형 입니다.*****");
					continue;
				}
				
				//List의 i번째 요소가 doudble(->Double 변환)인 경우
				if(list.get(i) instanceof Double) {
					//list.get(i)==>Object 반환
					
					Double d=(Double)list.get(i); //Double 다운 캐스팅
					System.out.println("double의 바이트 크기 : " + d.BYTES);
				}
				
				//Object 타입은 아무거나 다 참조할 수 있다!!!
				Object[] test= new Object[5];
				test[0]="아무거나";
				test[1]=123123;
				test[2]=new Object();
				test[3]=3.123123;
				
				
			}
	}		////method1()
	
	
	
	
	
	/**
	 * 컬렉션 List + 제네릭(타입 제한)
	 */
	public void method2() {
		//컬렉션의 장점 중 "여러 타입 저장 가능"이
		//코드 길이를 늘리는 주범!! 
		//-> 타입을 하나로 제한 (제네릭) -> 코드 길이 감소
		
		
		//String타입으로 제한된 ArrayList 객체 생성
		List<String> strList= new ArrayList<String>();
		
		// 제네릭의 타입 제한 확인
		strList.add("닭갈비");
		strList.add("치킨");
		strList.add("보쌈");
		strList.add("족발");
		strList.add("카레돈까스");
		strList.add("한우불고기버거");
//		strList.add(1234); //String이 아니어서 error
		
		for(int i=0; i<strList.size();i++) {
			String foodName=strList.get(i);
			System.out.println(foodName);
		}
		
		//3. void add (int index, E e): index 번째에 중간 삽입
		strList.add(1,"찜닭");
		
		//4. String toString() :: List에 저장된 모든 요소 문자열로 반환
		System.out.println(strList.toString());
		
		//5. E Set(int index, E e) : index번째 요소를 e로 수정
		// -> 수정 전 요소가 반환됨
		String before= strList.set(2, "양념치킨");
		System.out.println("수정 전: "+before);
		System.out.println("수정 후 : "+strList.get(2));
		System.out.println(strList);
		
		
		//int indexOf(E e) : List 내부에 e와 같은 요소가 있으면 해당 인데스
		//없으면 -1 반환
		System.out.println(strList.indexOf("보쌈"));
		System.out.println(strList.indexOf("막국수"));
		
		
		//7. boolean contains(E e)
		//List 내부에 e와 같은 요소가 있으면 true, 없으면 false
		System.out.println(strList.contains("보쌈"));
		System.out.println(strList.contains("막국수"));
		
		
		//8. E remove(int index)
		//index 번쨰 요소를 제거(추출!)
		// -> 제거된 요소가 반환됨
		
		String target=strList.remove(0); //0번 인덱스 요소 제거
		System.out.println("제거된 요소 : "+ target);
		System.out.println(strList);
		

	}//method2()
	
	
	/**
	 * Book으로 제한된 List 객체를 생성 후 
	 * - 추가, 조회, 수정, 제거 구현
	 */
	public void bookManage() {
		
		/*
		 * ArrayList : 배열 형태의 리스트
		 * 장점 : 검색이 빠름
		 * 단점 : 중간 삽입, 제거가 느림
		 * 
		 *   
		 * LinkedList : 연결죈 형태의 리스트
		 * 장점: 중간 삽입, 제거가 빠름
		 * 다ㅡㅁ : 검색이 느림
		 * */
		
		
		List<Book> bookList= new ArrayList<Book>();
		Scanner sc= new Scanner(System.in);
		
		int input=0; //메뉴 번호 입력
		
		do {
			
			System.out.println("-----도서 관리 프로그램-----");
			System.out.println("1.추가");
			System.out.println("2.전체 조회");
			System.out.println("3.index로 조회");
			System.out.println("4.수정");
			System.out.println("5.제거");
			System.out.println("0.종료");
		
			
			System.out.print("메뉴 번호 입력 >>> ");
			input=sc.nextInt();
			
			sc.nextLine(); //스캐너 버터에 남아있는 개행 문자 제거
			
			switch(input) {
			case 1: 
				System.out.print("제목 입력 : ");
				String title=sc.nextLine();
				
				System.out.print("글쓴이 입력 : ");
				String writer=sc.nextLine();
				
				System.out.print("가격 입력 : ");
				int price=sc.nextInt();
				
				if(bookList.add(new Book(title, writer, price))) {
					System.out.println("추가 성공");
				}
				
				break;
			case 2: 
				
				System.out.println("-----\n전체 조회\n-----");
				//향상된 for문
				for(Book b : bookList) System.out.println(b);
				
				
				break;
				
				
			case 3:
				
				System.out.print("조회할 책의 인덱스 입력 : ");
				int index=sc.nextInt();
				
				if(index>=0 && index<bookList.size()) {//정상인 경우
					System.out.println(bookList.get(index));
				}
				else {
					System.out.println("\n<<<<<인덱스 범위가 옳지 않습니다>>>>>\n");
				}
				
				break;
				
			case 4: //index를 정상적으로 입력했다고 가정 
				
				System.out.println("\n[책 수정]\n");
				
				System.out.println("수정할 책의 인덱스 번호 : ");
				index=sc.nextInt();
				sc.nextLine();
				
				System.out.print("수정할 책 제목");
				title=sc.nextLine();
				
				System.out.print("수정할 책 글쓴이");
				writer=sc.nextLine();
				
				System.out.print("수정할 책 가격");
				price=sc.nextInt();
				
				Book after=new Book(title, writer, price);
				Book before=bookList.set(index, after);// 책 바꾸고 이전 책 추출
				
				System.out.println("전 : "+after);
				System.out.println("후 : "+before);
				
				
				break;
				
				
			case 5:
				
				System.out.println("\n[책 제거]\n");
				
				System.out.println("제거할 책의 인덱스 번호 : ");
				index=sc.nextInt();
				
				Book target=bookList.remove(index);
				
				System.out.println("제거된 책 : " + target);
				
				break;
			
			
			case 0: System.out.println("\n[프로그램 종료]\n");break;
			default: System.out.println("\n[잘못 입력]\n");
			}
			
		}while(input!=0);
		
		
	}
	
	
}

