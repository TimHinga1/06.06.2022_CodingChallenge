import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		for (int i = 0; i < N; i++) {
			String s = input.nextLine();
			int sum = 0;
			for (int j = 0; j < s.length(); j++) {
				if (Character.isDigit(s.charAt(j))) {
					sum += Character.digit(s.charAt(j),10);
				}
			}
			System.out.println(sum);
		}
		input.close();
	}
}
