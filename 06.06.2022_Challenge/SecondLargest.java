import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		for (int i = 0; i < N; i++) {
			String[] s = input.nextLine().split(" ");
			int nums[] = new int[s.length];
			for (int j = 0; j < s.length; j++) {
				nums[j] = Integer.parseInt(s[j]);
			}
			Arrays.sort(nums);
			System.out.println(nums[nums.length-2]);
		}
		input.close();
	}

}