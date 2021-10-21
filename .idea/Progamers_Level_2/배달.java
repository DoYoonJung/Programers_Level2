package Progamers_Level_2;

import java.util.ArrayList;

public class ¹è´Þ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 6;
		int[][] road = { { 1, 2, 1 }, { 1, 3, 2 }, { 2, 3, 2 }, { 3, 4, 3 }, { 3, 5, 2 }, { 3, 5, 3 }, { 5, 6, 1 } };
		int K = 4;

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<ArrayList<Integer>> cost = new ArrayList<>();

		int[] table = new int[N + 5];
		boolean[] check = new boolean[N + 5];

		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<Integer>());
			cost.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < road.length; i++) {
			list.get(road[i][0]).add(road[i][1]);
			list.get(road[i][1]).add(road[i][0]);

			cost.get(road[i][0]).add(road[i][2]);
			cost.get(road[i][1]).add(road[i][2]);

		}

		for (int i = 1; i <= N; i++) {
			table[i] = 987987987;
		}
		table[1] = 0;

		for (int i = 0; i < N; i++) {
			int mid = 987987989;
			int midIndex = -1;

			for (int j = 1; j <= N; j++) {
				if (!check[j] && table[j] < mid) {
					mid = table[j];

					midIndex = j;
				}
			}

			check[midIndex] = true;

			for (int j = 0; j < list.get(midIndex).size(); j++) {
				int node1 = list.get(midIndex).get(j);
				int cost1 = cost.get(midIndex).get(j);

				if (table[node1] > table[midIndex] + cost1) {
					table[node1] = table[midIndex] + cost1;
				}
			}
		}
		int result = 0;
		for (int i = 1; i <= N; i++) {
			if (table[i] <= K) {
				result++;
			}
		}
		System.out.println(result);

	}

}
