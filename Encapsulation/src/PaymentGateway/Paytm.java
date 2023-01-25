package PaymentGateway;

public class Paytm {
	/*
	 * It is  a Service provider that provide the payment gateways 
	 * and aginst of it charges the client the transaction fee
	 * 
	 * */
	private double txnfee = 0.2;
	private double mintxnfee=0.05;
	public double gettxnfee() {
		return txnfee;
	}
	
	// Not recommended but if needed comes condition
	public void setTxnfee(double newfee) {
		
		if(mintxnfee<newfee) {
			txnfee+=newfee;
			return;
		}
		System.out.println("Invalid Transaction Fee not fulfill the minmum criteria..");
	}

}
