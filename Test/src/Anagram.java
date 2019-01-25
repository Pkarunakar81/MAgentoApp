import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string1");
		String temp=scn.nextLine();
		temp=temp.toUpperCase();
		temp=temp.replaceAll(" ", "");
		char[] array1 = temp.toCharArray();
		Arrays.sort(array1);
		
		System.out.println("enter the string2");
		String temp1=scn.nextLine();
		temp1=temp1.toUpperCase();
		temp1=temp1.replaceAll(" ", "");
		char[] array2 = temp1.toCharArray();
		Arrays.sort(array2);
		if(array1.length!=array2.length)
		{
			System.out.println("not anagram");
		}
		else
		{
			check(array1,array2);	
		}
	}
	private static void check(char[] arr1, char[] arr2) 
	{
		for(int i=0;i<arr1.length;i++)
		{
				if(arr1[i]!=arr2[i])
				{
					System.out.println(arr1[i]);
					System.out.println(arr2[i]);
					System.out.println("not anagram");
				}
		}
		System.out.println("anagram");
	}
}