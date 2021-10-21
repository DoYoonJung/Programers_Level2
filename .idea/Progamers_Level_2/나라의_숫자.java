package Progamers_Level_2;

public class 나라의_숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;

		int[] arr = { 4, 1, 2 };
		String answer = "";
		while (n > 0) {
			answer = arr[n % 3] + answer;
			n = (n - 1) / 3;
		}

		System.out.println(answer);

	}

}
