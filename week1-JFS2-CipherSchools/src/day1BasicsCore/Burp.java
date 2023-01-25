package day1BasicsCore;
import java.util.Scanner;
public class Burp {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer brp =new StringBuffer("bu");
		System.out.println("Enter the length of burp : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		while(i<=n)
		{
			brp.append("r");
			++i;
		}
		brp.append("p");
		System.out.println(brp.toString());
		

	}

}
