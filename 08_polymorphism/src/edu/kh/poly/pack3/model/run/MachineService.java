package edu.kh.poly.pack3.model.run;

import edu.kh.poly.pack3.model.dto.Computer;
import edu.kh.poly.pack3.model.dto.Machine;
import edu.kh.poly.pack3.model.dto.Washer;

public class MachineService {

	public void method1() {
		
		// �씤�꽣�럹�씠�뒪(�젒�젏)�룄 遺�紐� ���엯 李몄“ 蹂��닔濡� �궗�슜 媛��뒫
		// -> �떎�삎�꽦�쓽 �뾽罹먯뒪�똿
		//   + 留ㅺ컻 蹂��닔�쓽 �떎�삎�꽦
		//   + 諛섑솚�삎�쓽 �떎�삎�꽦
		//   + 遺�紐� ���엯 媛앹껜 諛곗뿴
		//   + �룞�쟻 諛붿씤�뵫
		
		Machine[] arr = new Machine[2]; // �깮�꽦�맂 諛곗뿴 二쇱냼瑜� arr�뿉 ���엯
		// Machine[] arr : 
		//  Machine[] 諛곗뿴�쓣 李몄“�븯�뒗 二쇱냼瑜� ���옣�븷 李몄“�삎 蹂��닔 arr �꽑�뼵
		
		// new Machine[2] : 
		//  Heap �쁺�뿭�뿉 Machine 李몄“ 蹂��닔 2移� 吏쒕━ 諛곗뿴 Machine[] �깮�꽦
	
		// Machine 
		arr[0] = new Computer(); // �뾽罹먯뒪�똿 �쟻�슜
		arr[1] = new Washer();   // �뾽罹먯뒪�똿 �쟻�슜
		
		for(Machine temp : arr) {
			temp.powerOn();
			temp.powerOff();
			System.out.println("------------------------------");
		}
	}
	
}
