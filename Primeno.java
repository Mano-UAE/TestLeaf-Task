package day1;

public class Primeno 
{

	public static void main(String[] args)
	{
		int n =29;
		int i=2;
		boolean prime=true;
  for(i=2;i<n;i++)
{
	if(n%i==0) 
	{
		prime=false;
		break;
		}		
}
if(prime)
{
	System.out.println(n + " is a Prime number");
}
else
{
	System.out.println(n + " is not a Prime number");
}
}

}
