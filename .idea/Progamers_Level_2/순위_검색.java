package Progamers_Level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 순위_검색 {
	static HashMap<String, ArrayList<Integer>> map = new HashMap<>();
	static ArrayList<Integer> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };

		String[] query = { "java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
				"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };

		int[] answer = new int[query.length];
		for (int i = 0; i < info.length; i++) {
			dfs("", 0, info[i].split(" "));
		}

		for (String k : map.keySet()) {
			ArrayList<Integer> arr = map.get(k);
			Collections.sort(arr);
		}

		for (int i = 0; i < query.length; i++) {
			query[i] = query[i].replaceAll(" and ", "");
			String[] str = query[i].split(" ");
			int score = Integer.parseInt(str[1]);

			answer[i] = search(str[0], score);
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}

	}

	public static void dfs(String str, int x, String[] info) {
		if (x >= 4) {
			if (!map.containsKey(str)) {
				list = new ArrayList<Integer>();
				list.add(Integer.parseInt(info[4]));
				map.put(str, list);
			} else {
				map.get(str).add(Integer.parseInt(info[4]));
			}
			return;
		}

		dfs(str + "-", x + 1, info);
		dfs(str + info[x], x + 1, info);

	}

	public static int search(String str, int score) {
		if (!map.containsKey(str))
			return 0;
		ArrayList<Integer> arr = map.get(str);

		int start = 0;
		int end = arr.size() - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr.get(mid) < score) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return arr.size() - start;

	}
}
