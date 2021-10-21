package Progamers_Level_2;

import java.util.ArrayList;
import java.util.HashMap;

public class ÈÄº¸Å° {
	static int count = 0;
	static HashMap<String, Integer> map;
	static ArrayList<String[]> array = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] relation = { { "100", "ryan", "music", "2" }, { "200", "apeach", "math", "2" },
				{ "300", "tube", "computer", "3" }, { "400", "con", "computer", "4" }, { "500", "muzi", "music", "3" },
				{ "600", "apeach", "music", "2" } };

		int result = 0;
		for (int i = 0; i < relation[0].length; i++) {
			String[] temp = new String[relation.length];
			for (int j = 0; j < relation.length; j++) {
				temp[j] = relation[j][i];
			}
			if (result == 0) {
				result = getReturn(temp, true);
			} else {
				result = getReturn(temp, false);
			}

		}

		System.out.println(count);

	}

	public static int getReturn(String[] arr, boolean x) {
		map = new HashMap<>();
		int check = 0;
		String[] temp;
		if (!x) {
			temp = array.get(0);
			for (int i = 0; i < temp.length; i++) {
				temp[i] = temp[i] + arr[i];
			}
		} else {
			temp = arr;
		}

		for (int i = 0; i < temp.length; i++) {
			if (map.containsKey(temp[i])) {
				check = -1;
				break;
			} else {
				map.put(temp[i], 0);

			}

		}

		if (check == -1) {
			array.clear();
			array.add(temp);
			return -1;
		} else {
			count++;
			return 0;
		}

	}

}
