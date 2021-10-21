package Progamers_Level_2;

import java.util.HashMap;

public class ¿ß¿Â {
	static HashMap<String, Integer> map;
	static int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
				{ "green_turban", "headgear" } };

		map = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], 0);
		}
		String[] arr;
		for (int i = 1; i <= clothes.length; i++) {
			arr = new String[i];
			getReturn(i, 0, 0, clothes, arr);
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for (Integer k : map.values()) {
			System.out.println(k);
		}
	}

	public static void getReturn(int x, int cnt, int inx, String[][] clothes, String[] arr) {
		if (cnt >= x) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			if (x >= 2) {
				HashMap<String, Integer> hash = new HashMap<>(map);
				for (int i = 0; i < cnt; i++) {
					if (hash.containsKey(arr[i])) {
						if (hash.get(arr[i]) == 1) {
							hash.put(arr[i], 2);
						} else if (hash.get(arr[i]) == 0) {
							hash.put(arr[i], 1);
						}

					}
				}

				System.out.println();
				if (hash.containsValue(2)) {
					return;
				} else {
					result++;
					System.out.println(result);
					return;
				}
			} else {
				result++;
				System.out.println(result);

				return;
			}

		}

		for (int i = inx; i < clothes.length; i++) {

			arr[cnt] = clothes[i][1];
			getReturn(x, cnt + 1, i + 1, clothes, arr);
		}

	}

}
