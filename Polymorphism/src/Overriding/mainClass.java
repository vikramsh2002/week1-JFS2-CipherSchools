package Overriding;
import java.util.Scanner;
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to VRL Group of Hospitals\n How Can I help You Which Doctor's Appointmnet You need to Book \n 1) Orthopadic \t2)Physician \n 3)Cardiac Surgen  ");
      
      int ch = sc.nextInt();
	 Doctor obj;
	switch(ch) {
	case 2:
		obj=new Physician();
		break;
	case 1:
		obj=new Orthopadic();
		break;
	case 3:
		obj=new CardiacSurgen();
		break;
	default:
		System.out.println("Invalid Choice");
		obj=null;
		
	}
	if(obj!=null)
		obj.treatPatient();
	
	}

}
