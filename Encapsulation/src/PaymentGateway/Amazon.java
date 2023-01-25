package PaymentGateway;

public class Amazon {
	private double amzncharges=0.01; // 5000*1/100 : 50rs
	
	public double GenerateBill(double amt) {
		
		// Taking the Paytm payment gateway
		
		Paytm pgt1 = new Paytm();
		double paygateCharges=pgt1.gettxnfee();  // 0.2*5000: : 1000
		
		double pgate = paygateCharges*amt;
		System.out.println("PGate Charnges : "+pgate);
		System.out.println("Amazon Charnges : "+(amt*amzncharges));
		
		
		double totalamt = amt+amzncharges*amt+pgate;
		
		return totalamt;
		
	}

}
