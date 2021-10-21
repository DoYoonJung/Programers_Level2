package Progamers_Level_2;

import java.util.Arrays;

public class Hash_one {

	public static int[] solution(int[] lottos, int[] win_nums) {

		int count = 0;
		int zero = 0;
		Arrays.sort(lottos);

		for (int i = 5; i >= 0; i--) {

			if (lottos[i] == 0) {
				zero++;
			} else {
				for (int j = 0; j < 6; j++) {
					if (lottos[i] == win_nums[j]) {
						lottos[i] = -1;
						count++;
					}
				}
			}

		}

		int x = 6 - zero - count;

		int win = zero + count;
		int lose = 6 - zero - x;
		int[] answer = { win, lose };

		for (int i = 0; i < 2; i++) {
			if (answer[i] == 6) {
				answer[i] = 1;
			} else if (answer[i] == 5) {
				answer[i] = 2;
			} else if (answer[i] == 4) {
				answer[i] = 3;
			} else if (answer[i] == 3) {
				answer[i] = 4;
			} else if (answer[i] == 2) {
				answer[i] = 5;
			} else {
				answer[i] = 6;
			}
		}

		return answer;
	}

}
