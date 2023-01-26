package classes;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair ch = new Chair();
		ch.GenerateBill(1);
		
		
		Table tb1=new Table();
		tb1.GenerateBill(1);
		
		
		
		// It has taken width and the height from the table class since at instanciation both const call
		// Due to Constructor Chaining
		StudyTable stb1=new StudyTable();
		stb1.GenerateBill(1);

	}

}
