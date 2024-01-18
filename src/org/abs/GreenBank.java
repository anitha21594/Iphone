package org.abs;

public class GreenBank implements RciBank {
	public void savings() {
		System.out.println("savings is 5%");
	}
	public void current() {
		System.out.println("current is 6%");
	}
	public void fixed() {
		System.out.println("fixed is 7%");
	}
	public static void main(String[] args) {
		GreenBank g=new GreenBank();
		g.current();
		g.fixed();
		g.savings();
		RciBank r=new GreenBank();
		r.current();
		r.savings();
		r.fixed();
	
		
		
	}

}
