package Progamers_Level_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class 메뉴_리뉴얼 {
	static HashMap<String, Integer> hash;
	static int m = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] orders = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
		int[] course = { 2, 3, 4 };

		PriorityQueue<String> p = new PriorityQueue<>();

		for (int i = 0; i < course.length; i++) {
			hash = new HashMap<>();
			m = 0;
			for (int j = 0; j < orders.length; j++) {
				getReturn(0, "", course[i], orders[j], 0);
			}

			for (String k : hash.keySet()) {
				if (hash.get(k) == m && m > 1) {
					p.offer(k);
				}
			}
		}

		String[] answer = new String[p.size()];
		int t = 0;
		while (!p.isEmpty()) {
			answer[t++] = p.poll();
			System.out.println(answer[t - 1]);
		}

	}

	public static void getReturn(int inx, String basic, int target, String Me, int cnt) {

		if (cnt == target) {
			char[] arr = basic.toCharArray();
			Arrays.sort(arr);

			String temp = new String(arr);
			System.out.println(temp);
			hash.put(temp, hash.getOrDefault(temp, 0) + 1);
			m = Math.max(m, hash.get(temp));
		} else {
			for (int i = inx; i < Me.length(); i++) {

				char a = Me.charAt(i);

				getReturn(i + 1, basic + a, target, Me, cnt + 1);

			}
		}

	}

}
