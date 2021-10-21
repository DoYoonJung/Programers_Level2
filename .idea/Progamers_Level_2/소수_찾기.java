package Progamers_Level_2;

import java.util.HashMap;

public class 소수_찾기 {
	static int count = 0;
	static boolean[] check;
	static HashMap<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "011";
		String[] arr = new String[numbers.length()];
		String result = "";

		check = new boolean[numbers.length()];

		for (int i = 0; i < numbers.length(); i++) {
			arr[i] = numbers.substring(i, i + 1);
		}

		for (int i = 1; i <= numbers.length(); i++) {
			getReturn(0, arr, result, i);
		}
		System.out.println(count);

	}

	public static void getReturn(int x, String[] arr, String result, int target) {
		if (x >= target) {
			int cnt = 0;
			int num = Integer.parseInt(result);
			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0)
					cnt++;
				if (cnt == 2) {
					cnt = -1;
					break;
				}
			}

			if (cnt == 1 && map.get(num) == null) {
				count++;
				map.put(num, 1);

			}
			return;

		}

		for (int i = 0; i < arr.length; i++) {
			if (check[i] == false) {
				check[i] = true;
				getReturn(x + 1, arr, result + arr[i], target);
				check[i] = false;
			}
		}
	}

}
