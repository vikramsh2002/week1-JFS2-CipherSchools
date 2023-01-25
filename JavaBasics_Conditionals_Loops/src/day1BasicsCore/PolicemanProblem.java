package day1BasicsCore;
import java.util.Scanner;
public class PolicemanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Police that tracks speed 
		 * 1. Ask speed s1
		 * 2. Ask for is birthday today
		 * -------------------------------
		 * If birthday then u will be waived off
		 * by 5 miles/hrs i.e., s1=s1-5
		 * else no waiving
		 * 
		 * If speed s1 >80 then raise High Ticket
		 * If s1 is b/w 60 to 80 then raise Mid Ticket
		 * If s1<60 then raise no ticket will be raised
		 * 
		 * */
		
		
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Speed:  ");
		double speed = sc.nextDouble();
		
		System.out.println("Is it your birthday today :  ");
		boolean isbth = sc.nextBoolean();
		
		
		if (isbth) {
			speed-=5;
		}
		
		if(speed>80) {
			System.out.println("High Ticket !!");
			
		}
		else if(speed>60 && speed<80) {
			System.out.println("Mid Ticket !!");
		}
		else {
			System.out.println("No Ticket U r Free!!");
		}

	}

}
