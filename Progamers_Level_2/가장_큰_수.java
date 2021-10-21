package Progamers_Level_2;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class 가장_큰_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 303, 30 };
		String answer = "";
		PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
		HashMap<Integer, String> map = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			String temp = numbers[i] + "";
			for (int j = 0; j < 3; j++) {
				if (temp.length() < 3) {
					int num = Integer.parseInt(temp);
					num = num % 10;
					temp = temp + num;
				} else {
					break;
				}
			}

			map.put(numbers[i], temp);
			temp += " " + i;
			pq.offer(temp);

		}

		while (!pq.isEmpty()) {
			String[] sp = pq.peek().split(" ");
			if (answer.equals("0") && Integer.parseInt(sp[1]) == 0) {
				answer = "0";
			} else {
				answer += numbers[Integer.parseInt(sp[1])];
			}

			pq.poll();
		}

		System.out.println(answer);

	}

}
