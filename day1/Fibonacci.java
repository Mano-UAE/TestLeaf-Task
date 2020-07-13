package day1;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int n = 6;
		int f=0;
		int s=1;
		int t;
		
for(int i =0;i<n;i++)
{
	System.out.println(f);
	t=f+s;
	f=s;
	s=t;
}
	}

}
