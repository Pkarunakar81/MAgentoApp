import java.util.Scanner;

public class PrimeNo 
{
	public static void main(String[] args) 
	{
		int count=0;
		String temp1="";
		int temp = Integer.MAX_VALUE;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the limit");

		while(temp!=0)
		{
			temp=scn.nextInt();
			System.out.printf("Does %d is prime %s %n",temp,isPrime(temp));
			
		}
		//int limit=scn.nextInt();
		/*for(int i=2;i<limit;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}*/
	}
	public static boolean isPrime(int number) 
	{
		if (number <= 0 ||number==1) {
			return false;
		}
		for (int i = 2; i < number/2; i ++) 
		{
			if (number % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

}
