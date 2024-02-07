package edu.kh.poly.pack2.model.dto;

public class Snake extends Animal {

	
	private boolean poison;
	
	//생성자
	public Snake() {}
	
	public Snake(String type, boolean poison) {
		super(type);
		this.poison=poison;
	}
	
	
	public boolean isPoison() {
		return poison;
	}

	public void setPoison(boolean poison) {
		this.poison = poison;
	}
	

	@Override
	public String toString() {
		return super.toString()+" / 독 유무 : "+poison;
	}
	
	@Override
	public void eat() {
		System.out.println("한 번에 삼켜서 천천히 소화시킨다");
		
	}

	@Override
	public void sleep() {
		 System.out.println("뱀은 똬리를 틀고 잔다");
	}

	
}
