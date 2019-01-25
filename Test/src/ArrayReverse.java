import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse 
{
	public static void main(String args[])
	{
		/*Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String temp=scn.next();*/
		 String[] names = {"John", "Jammy", "Luke"};
		 ReverseArray(names);
		System.out.println("the reversed array is :"+Arrays.toString(names));	
	}
	private static void ReverseArray(String[] names) 
	{
		for(int i=0;i<names.length/2;i++)
		{
			String temp=names[i];
			names[i]=names[names.length-i-1];
			names[names.length-i-1]=temp;		
		}
	}
}