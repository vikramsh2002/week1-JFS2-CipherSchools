package day1BasicsCore;
import java.util.Scanner;
public class Grader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Grade : ");
		Scanner sc = new Scanner(System.in);
		
		char grad = sc.next().charAt(0);
		switch(grad) {
		case 'A':
		case 'a':
			System.out.println("I st Div ");
		
		break;
		
		case 'B':
		case 'b':
			System.out.println("II nd Div ");
		
		case 'C':
		case 'c':
			System.out.println("III rd  Div ");
		
		break;
		
		default:
			System.out.println("Fail ");
		
		
		}
	}

}
