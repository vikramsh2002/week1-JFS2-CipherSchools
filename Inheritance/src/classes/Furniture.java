package classes;

public class Furniture {

	  protected double width,height,costperunit;
	  int units;
	  
	  protected void showBill(String prodname) {
		  double totcost = width*height*costperunit*units;
		  System.out.println("The Product Name : "+prodname+" \n Measurements \t Width : "+width+" \t Height : "+height+"\n Total Payable Amount : "+totcost);
		  
	  }

}

