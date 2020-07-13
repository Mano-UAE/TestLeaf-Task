package day1;

public class SumOfDigits {

	public static void main(String[] args)
	{

		int s=956;
		int r=0;
		int sum=0;
		
	while (s>0)
	{
	r=s%10;
	sum=sum+r;
	s=s/10;	
	}
	System.out.println("Sum is "+sum);
	}
           
}

