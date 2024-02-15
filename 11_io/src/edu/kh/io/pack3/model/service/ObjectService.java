package edu.kh.io.pack3.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService  {

	/*  ObjectInputStream / ObjectOutputStream 
	 *  - Java 객체(Instance == Object)를 입/출력 할 때 
	 *   사용하는 바이트 기반 "보조" 스트림
	 *   (보조 스트림 단독 사용 불가능!!!)
	 *   
	 *   *** 직렬화( Serializable) ***
	 *   - 객체(Object)를 직렬(직선) 형태로 변환
	 * 
	 */
	
	
	/**
	 * 객체를 외부 파일로 출력
	 */
	public void objectOutput() {
		
		FileOutputStream fos=null;
		ObjectOutputStream oos =null;
		
		try {
			//dat확장자 : data를 담고 있는 파일을 나타내는 확장자
			fos=new FileOutputStream("/io_test/20240215/Member.dat");
			
			oos=new ObjectOutputStream(fos); //객체 보조 스트림 생성
			 
			//Member 객체 하나 생성
			Member member=new Member("member01","pass01!","김회원",30);
			
			/* ObjectOutputStream을 이용해서 Member객체 출력하기*/
			oos.writeObject(member); //객체 출력
			
			System.out.println("회원 출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			
			try {
				if(oos!=null)
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//objectOutput
	
	
	
	/**
	 * 외부 파일로 부터 객체 입력 받기
	 */
	public void objectInput() {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		
		try {
			
			fis=new FileInputStream("/io_test/20240215/Member.dat");
			ois=new ObjectInputStream(fis);
			
			//스트림을 이용해 파일에 작성된
			//직렬화 된 Member 객체를 읽어와
			//역직렬화를 수행하여 정상적인 Member객체로 변경
			
			
			//ois.readObject() : 직렬화된 객체를 읽어와 역직렬화 + Member객체로 변경
			Member member=(Member)ois.readObject(); //다운 캐스팅
			
			System.out.println(member);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
		
			try {
				if(ois!=null)
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//objectInput()
	
	
}
