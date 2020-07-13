package day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int am =153 ;
		int calc=0;
		int rem;
		int orig=am;
		
  while(am>0)
   {
	rem=am%10;
	am=am/10;
	calc=calc+(rem*rem*rem);
}
   if(orig==calc)
   {
	   System.out.println("its an Armstrong number");
   }
   else
   {
	   System.out.println("its not a Armstrong number");
   }
	}

}
