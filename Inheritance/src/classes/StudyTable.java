package classes;

public class StudyTable extends Table {
	
	@Override
	void GenerateBill(int untsBuy) {
		costperunit=4000;
		units=untsBuy;
		showBill("Study Table");
	}

}
