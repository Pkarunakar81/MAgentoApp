import java.util.Scanner;
import java.util.StringTokenizer;

public class StrLen {

	public static void main(String[] args) {
		int count = 0;
		int i=0;
		String temp1 = "";
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string");
		String temp = scn.nextLine();
		String[] arr = temp.split(" ");
		for (i = arr.length-1;i>=0; i--) 
		{
			System.out.println(arr[i]+arr[i].length());			
		}
		
		/*for (i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]+arr[i+1].length());			
		}
		System.out.println(arr[arr.length-1]+arr[arr.length-arr.length].length());	*/
		
		/*StringTokenizer token = new StringTokenizer(temp," ");
		while(token.hasMoreElements()==true)
		{
			String token1=token.nextToken();
			System.out.println(token1);
		}*/
	
	
	}
}