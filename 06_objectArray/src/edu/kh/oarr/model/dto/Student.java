package edu.kh.oarr.model.dto;


//DTO : Data Tranfer Object (갑 전달용 객체)
public class Student {
	private String 	studentNumber; //학번
	private String 	name;		  //이름
	private char 	gender;		  //성별
	private int 	html;
	private int		css;
	private int 	js;
	private int 	java;
	
	//매개 변수 생성자
	public Student(String studentNumber, String name, char gender) {
		this.studentNumber=studentNumber;
		this.name=name;
		this.gender=gender;
	}
	
	//studentNumber getter/setter
	public void setStudentNumber(String studentNumber) {
		//외부로부터 전달 받아온 학번을 혀내 객체에 저장
		this.studentNumber=studentNumber;
	}
	
	public String getStudentNumber() {
		//전달 받은 내용을 반환
		return studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int getCss() {
		return css;
	}

	public void setCss(int css) {
		this.css = css;
	}

	public int getJs() {
		return js;
	}

	public void setJs(int js) {
		this.js = js;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}
	
	
	
	//객체.toString() : 객체의 필드를 하나의 문자열로 만들어서 반환
	public String toString() {
		
		//학번 / 성별 / 이름
		//HTML : 100 / CSS : 50 / JS : 70 / Java : 100
		return String.format("%s / %c / %s \n "
				+ "HTML : %d / CSS : %d / JS : %d / Java : %d ",
				studentNumber, gender, name, html, css, js, java );
	}
	
	
}


//getter / setter 자동완성
//alt+[shift] + s -> r (Generated Getters and Setters...)
//Select All 클릭 -> Generate 클릭
