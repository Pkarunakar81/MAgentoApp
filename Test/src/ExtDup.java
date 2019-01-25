import java.util.Arrays;
import java.util.Scanner;

public class ExtDup 
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		while(scn.hasNext()==true)
		{
			String n1=scn.next();
			System.out.println("List of duplicate characters in String :");
			PrintSuplicates(n1);
		}
	}
	private static void PrintSuplicates(String temp) 
	{
		for(int i=0;i<temp.length()-1;i++)
		{
			for(int j=i+1;j<temp.length();j++)
			{
				if(temp.charAt(i)==temp.charAt(j))
				{
					System.out.println(temp.charAt(i));
					break;
				}
			}
		}
	}
}