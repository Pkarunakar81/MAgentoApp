import java.util.Arrays;
import java.util.Scanner;

public class GCD 
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number1");
		int n1=scn.nextInt();
		System.out.println("enter the number2");
		int n2=scn.nextInt();
		System.out.println(FindGD(n1,n2));
		
	}

	private static int FindGD(int n1, int n2) 
	{
		if(n2==0)
		{
			return n1;
		}
		return FindGD(n2,n1%n2);
	}
}