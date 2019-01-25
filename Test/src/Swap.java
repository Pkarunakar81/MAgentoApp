import java.util.Scanner;

public class Swap {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number ");
		int a = scn.nextInt();
		System.out.println("Enter a number ");
		int b = scn.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a+" ");
		System.out.println(b);

	}
}