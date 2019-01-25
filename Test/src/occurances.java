import java.util.Arrays;
import java.util.Scanner;

public class occurances {

	public static void main(String[] args) {
		int count = 0, len = 0;
		String temp1 = "";
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string");
		String temp = scn.nextLine();
		
		
		do
		{
		char[] name = temp.toCharArray();
		len=name.length;
		count=0;
		for(int i=0;i<len;i++)
		{
			if((name[0]==name[i])&&((name[0]>=65&&name[0]<=90)||(name[0]>=97&&name[0]<=122)))
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println(name[0]+" "+count+" times");
		}
		temp=temp.replace(""+name[0],"");
		}
		while(len!=1);
	}
}