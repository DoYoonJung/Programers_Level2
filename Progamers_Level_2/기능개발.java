package Progamers_Level_2;

import java.util.ArrayList;

public class 기능개발 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = { 95, 90, 99, 99, 80, 99 };
		int[] speeds = { 1, 1, 1, 1, 1, 1 };
		ArrayList<Integer> answer1 = new ArrayList<Integer>();
		int min = 1000;
		for (int i = 0; i < progresses.length; i++) {
			if (progresses[i] < min) {
				min = progresses[i];

			}
		}

		min = 100 - min;

		int count1 = 0;

		int result = 0;

		for (int i = 0; i < min; i++) {
			boolean check = false;
			int count2 = 0;
			if (result == -1)
				break;

			for (int j = 0; j < speeds.length; j++) {
				progresses[j] += speeds[j];
				if (progresses[count1] >= 100) {
					count2 = count2 + 1;
					count1++;
					if (count1 >= speeds.length) {
						result = -1;
						check = true;
						break;
					}

					check = true;
				}
			}

			if (check) {
				answer1.add(count2);
			}

		}
		int[] answer = new int[answer1.size()];
		for (int i = 0; i < answer1.size(); i++) {
			answer[i] = answer1.get(i);
		}

	}

}
