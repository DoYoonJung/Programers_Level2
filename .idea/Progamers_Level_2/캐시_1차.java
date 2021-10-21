package Progamers_Level_2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ä³½Ã_1Â÷ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cacheSize = 3;
		String[] cities = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
		Deque<String> dq = new ArrayDeque<>();
		int time = 0;
		for (int i = 0; i < cities.length; i++) {
			boolean arr = dq.removeFirstOccurrence(cities[i].toLowerCase());
			dq.addLast(cities[i].toLowerCase());
			time++;
			if (dq.size() > cacheSize) {
				dq.removeFirst();
			}
			if (!arr) {
				time += 4;

			}
		}

	}

}
