package interfaces;
import interfaces.UberCustomer;
import interfaces.UberDriver;
import interfaces.UberOwner;
public class main implements UberCustomer,UberDriver,UberOwner{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// We have a new customer ram
		// Create a object of main class and store it in UberCustomer interface type 
		// Becoz it abstracts the func of rest all
		UberCustomer ram = new main();
		ram.setPickupPoint_and_DroppingPoint();
		ram.bookride();
		ram.payBill();
		ram.rateRide();
		ram.cancelRide();
		
		
		// Driver 
		UberDriver sham = new main();
		sham.acceptRide();
		sham.callCustomer();
		sham.getLocation_Customer();
		sham.getCommision();
		
		
		// Owner
		UberOwner vikram = new main();
		vikram.addNewDriver();
		vikram.createStrategy();
		vikram.getMonthlyReport();
		vikram.getRecordsDrivers();
		vikram.getRegionalReport();
		vikram.getRevenue();
		vikram.removeDriver();
		
		
		
		

	}

	@Override
	public void getRecordsDrivers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getRevenue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getMonthlyReport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getRegionalReport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createStrategy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptRide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getLocation_Customer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getCommision() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void callCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookride() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateRide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelRide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payBill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPickupPoint_and_DroppingPoint() {
		// TODO Auto-generated method stub
		
	}

}
