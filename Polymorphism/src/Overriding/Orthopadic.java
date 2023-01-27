package Overriding;

public class Orthopadic implements Doctor{
	
	@Override
	public void treatPatient() {
		System.out.println("I will treat bones");
	}
}
