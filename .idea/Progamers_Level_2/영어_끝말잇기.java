package Progamers_Level_2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class 영어_끝말잇기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };
		int result[] = new int[2];
		boolean check = false;

		Queue<Character> q = new LinkedList<>();

		HashMap<String, Integer> map = new HashMap<>();

		int round = 1;
		int count = 0;

		for (int i = 0; i < words.length; i++) {

			count++;
			if (count > n) {
				count = 1;
				round++;
			}
			if (i == 0) {
				map.put(words[i], count);
				q.add(words[i].charAt(words[i].length() - 1));
			} else {
				char word = q.poll();
				if (map.containsKey(words[i]) || word != words[i].charAt(0)) {
					result[0] = count;
					result[1] = round;
					check = true;
					break;
				}

				else {
					map.put(words[i], count);
					q.add(words[i].charAt(words[i].length() - 1));
				}

			}
		}
		if (check == true) {
			for (int i = 0; i < 2; i++) {
				System.out.println(result[i]);
			}
		} else {
			result[0] = 0;
			result[1] = 0;
		}

	}

}
