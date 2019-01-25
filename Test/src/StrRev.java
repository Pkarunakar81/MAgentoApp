import java.util.Scanner;

public class StrRev 
{
	public static void main(String[] args) 
	{
		int count=0;
		String temp1="";
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String temp=scn.nextLine();
		for(int i=temp.length()-1;i>=0;i--)
		{
			temp1+=temp.charAt(i);
		}
		temp1=temp1.replaceAll(" ", "");
		System.out.println(temp1);
		
		
		/*StringBuilder input=new StringBuilder();
		input.append(temp);
		input.reverse();
		System.out.println(input);*/
		
		
		/*char[] array = temp.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			temp1+=array[i];
		}
		System.out.println(temp1);*/
	}
}
