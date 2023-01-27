package Overriding;

public class CardiacSurgen implements Doctor{
	@Override
	public void treatPatient() {
		System.out.println("I will do your Heart Surgery");
	}

}
