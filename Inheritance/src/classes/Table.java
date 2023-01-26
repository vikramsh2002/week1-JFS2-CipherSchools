package classes;

public class Table extends Furniture{
	// The variables and method are inherited from the parent class i.e., furniture 
		Table(){
			width=58.5;
			height=60.5;
		}
		void GenerateBill(int untsBuy) {
			
			costperunit=1000;
			units=untsBuy;
			showBill("Table");
		}

}
