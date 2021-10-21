package Progamers_Level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		int length = truck_weights.length;
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < bridge_length; i++) {
			q.add(-1);
		}
		int sum = 0;
		int count = 0;
		int time = 0;

		int check = length;
		while (true) {
			int num = q.poll();
			if (num > 0) {
				check--;
				sum -= num;
			}

			if (count < length && weight >= sum + truck_weights[count]) {

				q.add(truck_weights[count]);
				sum += truck_weights[count];
				count++;
				time++;
			} else {
				q.add(-1);
				time++;
			}

			if (check == 0) {
				break;
			}
		}

		System.out.println(time);
	}

}
