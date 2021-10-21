package Progamers_Level_2;

import java.util.HashMap;

public class ¡∂¿ÃΩ∫∆Ω {
	static HashMap<Character, Integer> map = new HashMap<>();
	static HashMap<Character, Integer> hash = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JAN";
		int S_len = name.length();

		char[] One = new char[S_len];

		for (int i = 0; i < S_len; i++) {
			One[i] = name.charAt(i);

		}
		for (int i = 0; i <= 25; i++) {
			map.put((char) ('A' + i), i);

		}

		for (int i = 1; i <= 25; i++) {
			hash.put((char) ('Z' - (i - 1)), i);
		}
		hash.put('A', 0);
		int front = getFront(name, One, S_len);
		int back = getBack(name, One, S_len);

		int answer = Math.min(front, back);
		System.out.println(answer);
	}

	public static int getFront(String name, char[] One, int S_len) {
		int count = -1;

		for (int i = 0; i < S_len; i++) {
			count++;
			for (char j : map.keySet()) {

				if (j == One[i]) {
					int win = Math.min(map.get(j), hash.get(j));
					count = count + win;
					break;
				}
			}

		}
		return count;
	}

	public static int getBack(String name, char[] One, int S_len) {
		int count = -1;

		for (int i = S_len - 1; i >= 0; i--) {
			count++;
			for (char j : hash.keySet()) {

				if (j == One[i]) {
					int win = Math.min(map.get(j), hash.get(j));
					count = count + win;
					break;
				}
			}

		}

		if (One[1] == 'A')
			count--;
		return count;
	}

}
