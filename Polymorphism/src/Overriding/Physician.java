package Overriding;

public class Physician implements Doctor{
	@Override
	public void treatPatient() {
		System.out.println("I will treat General Health Hazards");
	}

}
