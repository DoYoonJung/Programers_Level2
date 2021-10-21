package Progamers_Level_2;

import java.util.Arrays;

public class 큰_수_만들기 {
	static int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "4177252841";
		int k = 4;
		int length = number.length() - k;
		String numbers = number.substring(0, k + 1);
		int[] arr = new int[numbers.length()];

		for (int i = 0; i < numbers.length(); i++) {
			arr[i] = Integer.parseInt(numbers.substring(i, i + 1));
		}
		Arrays.sort(arr);

	}

}
