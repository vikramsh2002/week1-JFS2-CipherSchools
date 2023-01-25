package day1BasicsCore;
import java.util.Scanner;
import java.util.Random;
public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // 5 attempts
	Random rg = new Random();	
	Scanner sc = new Scanner(System.in);
	int gn = rg.nextInt(10);
	int usern;
	for(int i=0;i<5;++i) {
		System.out.println("Guess the Number : ");
		usern = sc.nextInt();
		if(usern>gn) {
			System.out.println("-----Too High..");
		}
		else if(usern<gn) {
			System.out.println("++++++Too Low..");
		}
		else {
			System.out.println("========>Gotch!!");
			break;
		}
	}
	System.out.println("$$$$$$$$$$$ Game Over$$$$$$$$$$$");
	
	}

}
