package day1BasicsCore;

public class AlphabetPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a= 'A'; //65 , small a: 97, 
		// Z: 90, z:122 ascii
		while(a<=122) {
			if(a==97) {
				System.out.println();
			}
			System.out.print(a+" ");
			++a;
		}

	}

}
