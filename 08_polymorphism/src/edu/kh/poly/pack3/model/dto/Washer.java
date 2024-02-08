package edu.kh.poly.pack3.model.dto;

public class Washer implements Machine{

	@Override
	public void powerOn() {
		System.out.println("세탁기의 터치식 전원 버튼을 누름");
	}

	@Override
	public void powerOff() {
		System.out.println("세탁기가 켜져 있을 때 다시 전원 버튼을 누름");
	}
}
