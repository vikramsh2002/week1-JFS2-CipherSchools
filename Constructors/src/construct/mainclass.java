package construct;


class ITProfessional{
	private int itpid;
	private double sal;
	private String name;
	
	ITProfessional(){
		// Default Constructor
		itpid=101;
		sal=0001;
		name=null;
	}
	
	ITProfessional(int i,double s,String n){
		// Parameterized Constructor
		itpid=i;
		sal=s;
		name=n;
	}
	
	public void showdata() {
		System.out.println("IT Professional Id : "+itpid+" \t Name : "+name+"\t Salaray : Rs. "+sal);
		
	}
}

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITProfessional unknown1 = new ITProfessional();
		ITProfessional unknown2 = new ITProfessional();
		
		// Default Constructor is called in order  to create the object
		unknown1.showdata();
		unknown2.showdata();
		
		// Para. Const. called
		ITProfessional raj = new ITProfessional(102,2500.0,"Raj Sharma");
		ITProfessional rajni = new ITProfessional(103,50000,"Rajni Raj");
		
		raj.showdata();
		rajni.showdata();
	}

}
