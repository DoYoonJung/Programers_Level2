package Progamers_Level_2;

import java.util.HashSet;

public class ΐΤ½Η_Επ½Η {

	static HashSet<Integer> set;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enter = { 1, 4, 2, 3 };
		int[] leave = { 2, 1, 3, 4 };
		int[] arr = new int[enter.length];
		set = new HashSet<>();

		int n = -1;
		int m = 0;

		while (m < leave.length) {

			if (set.contains(leave[m])) {
				set.remove(leave[m]);
				arr[leave[m] - 1] += set.size();
				for (int s : set)
					arr[s - 1]++;
				m++;
			} else {
				while (++n < enter.length) {
					set.add(enter[n]);
					if (enter[n] == leave[m]) {
						break;
					}
				}

			}

		}

	}

}
