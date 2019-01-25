import java.util.Scanner;

public class SumofDigits {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number ");
		int a = scn.nextInt();
		System.out.println(sumOfDigits(a));
	}

	private static int sumOfDigits(int a) 
	{
		int b=0,sum=0;
		while(a!=0)
		{
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		return sum;
	}
}