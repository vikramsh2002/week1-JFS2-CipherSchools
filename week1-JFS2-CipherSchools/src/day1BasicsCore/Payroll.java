package day1BasicsCore;
import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner is a class use to take the inputs from anywhere
		// System.in ====>Keyborad Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base salary of employee : ");
		double basesal = sc.nextDouble();
		double hra,da,gp;
		
		if (basesal>=5000) {
			hra = 0.1*basesal;
			da = 0.2*basesal;
			
		}
		else {
			hra = 0.2*basesal;
			da = 0.3*basesal;
		}
		gp = basesal+hra+da;
		System.out.println("HRA : "+hra+"\n DA : "+da+"\n Gross Pay : "+gp);
		

	}

}
