import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int count=0,len=0;
		String temp1="";
		int temp = Integer.MAX_VALUE;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number upto which fibonasi seires print");
		int n=scn.nextInt();
		System.out.println("fibonasi upto "+n+"is");
		for(int i=1;i<n;i++)
		{
			System.out.print(fibonacci(i)+" ");
		}	
	}

	public static int fibonacci(int number) 
	{
		if(number==1||number==2)
		{
			return 1;
		}
		else
		{
			return fibonacci(number-1) +fibonacci(number-2);
		}

	}

}
