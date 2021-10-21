package Progamers_Level_2;

public class 모음_사전 {
	static int number = 0;
	static boolean flag = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "EIO";

		String[] arr = { "A", "E", "I", "O", "U" };

		getReturn(0, "", arr, word);
		System.out.println(number);

	}

	public static void getReturn(int cnt, String result, String[] arr, String word) {
		if (word.equals(result)) {
			flag = true;
			return;
		}

		if (cnt >= 5) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (flag == true)
				break;

			number++;
			getReturn(cnt + 1, result + arr[i], arr, word);

		}

	}

}
