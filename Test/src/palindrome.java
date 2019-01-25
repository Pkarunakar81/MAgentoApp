import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string");
		String temp = scn.nextLine();
		String reverse = Reverse(temp);
		if (temp.equals(reverse)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

	private static String Reverse(String temp) {
		String temp1 = "";
		for (int i = temp.length() - 1; i >= 0; i--) {

			temp1 += temp.charAt(i);
		}
		return temp1;

	}

}
