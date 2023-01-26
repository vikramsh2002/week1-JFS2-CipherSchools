package classes;

public class Chair extends Furniture {
	// The variables and method are inherited from the parent class i.e., furniture 

	void GenerateBill(int untsBuy) {
		width=28.5;
		height=30.5;
		costperunit=100;
		units=untsBuy;
		showBill("Chair");
	}


}
