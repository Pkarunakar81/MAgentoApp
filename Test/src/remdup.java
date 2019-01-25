import java.util.Arrays;
import java.util.Scanner;

public class remdup {

	public static void main(String[] args) {
		int count=0;
		String temp1="";
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String temp=scn.nextLine();
		temp=temp.replaceAll(" ", "");
		char[] array = temp.toCharArray();
		Arrays.sort(array);
		System.out.println(array);
		//String temp1=Arrays.toString(array);
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]!=array[i+1])
			{
				temp1+=array[i];
			}
			
		}
		temp1+=array[array.length-1];
		System.out.println(temp1);

	}

}
