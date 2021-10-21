package Progamers_Level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class »ïÂ÷¾ÐÃà {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "ABABABABABABABAB";

		Queue<String> q = new LinkedList<>();

		Map<String, Integer> map = new HashMap<>();

		int count = 1;

		for (int i = 0; i < msg.length(); i++) {
			q.add(msg.substring(i, i + 1));
		}

		for (int i = 0; i < 26; i++) {
			map.put((char) ('A' + i) + "", count++);
		}

		String wait = "";

		ArrayList<Integer> list = new ArrayList<>();

		while (!q.isEmpty()) {
			String pos = q.poll();
			wait += pos;
			if (map.containsKey(wait + q.peek())) {
				continue;
			} else {
				map.put(wait + q.peek(), count++);
			}

			list.add(map.get(wait));
			wait = "";

		}

	}

}
