package day1BasicsCore;
import java.util.Scanner;
import java.util.Random;
public class randomnumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Objective Random Number Generate
		 * Pacakge: java.util
		 * Class: Random
		 * method: nextInt(ranges)
		 * 
		 * 
		 * Package: java.util
		 * Class: Scanner
		 * method: nextInt() : read int
		 * 
		 * 
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the high Range : ");
		int high=sc.nextInt();
		
		Random rg = new Random();
		System.out.println("Random Number Genearted is : "+rg.nextInt(high));
		System.out.println("Random Number Genearted is : "+rg.nextDouble());
		System.out.println("Random Number Genearted by Gaus is : "+rg.nextGaussian());

	}

}
