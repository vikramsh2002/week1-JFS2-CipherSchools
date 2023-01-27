package Overloading;

public class AddDifferentVar {
	
	
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void sum(double a,double b) {
		System.out.println(a+b);
	}
	void sum(char a,char b) {
		System.out.println(a+b);
	}
	void sum(String  a,String b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDifferentVar a = new AddDifferentVar();
		a.sum(10, 10);
		a.sum(20, 10,50);
		a.sum(20.0, 90.0);
		a.sum("Vs","CLT");
		a.sum('A','B');
	}

}
