package Progamers_Level_2;

import java.util.PriorityQueue;

public class ´õ_¸Ê°Ô {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;

		PriorityQueue<Integer> q = new PriorityQueue<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			q.offer(scoville[i]);
		}
		int answer = 0;
		while (true) {
			if (q.peek() >= K)
				break;
			if (q.size() == 1) {

				answer = -1;
				break;
			}
			int a = q.poll();
			int b = q.poll() * 2;

			int sum = a + b;
			q.offer(sum);

			answer++;

		}

	}

}
