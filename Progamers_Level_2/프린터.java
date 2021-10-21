package Progamers_Level_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class «¡∏∞≈Õ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;

		int check = location;

		int result = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++) {
			pq.offer(priorities[i]);
			q.offer(priorities[i]);
		}

		while (!q.isEmpty()) {
			int a = q.peek();

			if (a < pq.peek()) {
				q.poll();
				q.offer(a);
				if (check == 0) {
					check = q.size() - 1;
				} else {
					check--;
				}
			} else {
				q.poll();
				pq.poll();
				result++;
				if (check == 0) {
					break;
				} else {
					check--;
				}

			}

		}

		System.out.println(result);

	}

}
