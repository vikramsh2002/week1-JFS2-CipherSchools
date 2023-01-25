package PaymentGateway;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Customer does a transaction of 5000
		Amazon cust1 = new Amazon();
		
		System.out.println("Net Payable Amount is : "+cust1.GenerateBill(10000));

	}

}
