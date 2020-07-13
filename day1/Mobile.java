package day1;

public class Mobile {
	
	public String S="IPhone SE" ;
	int mm=555;
	boolean D= true;
	boolean F=false;
		
		public void  makeCall()
		{
			long lv=8946022543l;
			System.out.println(lv);
			System.out.println("Dialled in ");
		}
	    public void sendSms()
	    {
	    	System.out.println("Texted");
	    }
	    public void takeSnap()
	    {
	    	System.out.println("Clicked a Snap");
	    }
	    public static void main(String[] args)
	    {
			Mobile mb=new Mobile();
			mb.makeCall();
			mb.sendSms();
			mb.takeSnap();
			System.out.println(mb.mm);
			System.out.println(mb.S);
			System.out.println(mb.D);
	}

}


/*Create 3 Global Variable as below and print the values in using object in the main method
String mobileBrand
int mobileModel 
boolean isUsed 
2. Create a local variable inside makeCall and print
    mobileNumber */

