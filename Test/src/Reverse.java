import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scn.nextInt();
		int reverse = reverse(number);
		System.out.println(reverse);
	}
	public static int reverse(int number) {
		int reminder = 0;
		int reverse = 0;
		do {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		} while (number > 0);
		return reverse;
	}
}