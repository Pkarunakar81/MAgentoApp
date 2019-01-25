import java.util.Arrays;
import java.util.Scanner;

public class Factorial 
{
	public static void main(String args[])
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the string");
	int temp = scn.nextInt(); 
	int temp2=factorial(temp);
	System.out.println(temp2);
	}

	private static int factorial(int n) 
	{
		if(n==0)
		{
			return 1;
		}
		return n*factorial(n-1);
	}		
}