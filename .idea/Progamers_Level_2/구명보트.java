package Progamers_Level_2;

import java.util.ArrayList;
import java.util.Collections;

public class 구명보트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] people = { 10, 10, 10, 10, 10 };
		int limit = 100;

		int length = people.length - 1;
		ArrayList<Integer> list = new ArrayList<>(50005);
		for (int i = 0; i < people.length; i++) {
			list.add(people[i]);
		}
		Collections.sort(list);
		int sum = 0;

		int count = 0;
		while (list.size() != 0) {
			if (length <= 0) {
				count++;
				break;
			}
			int number1 = list.get(0);
			int number2 = list.get(length);
			if (number2 <= limit / 2) {
				count = count + (int) Math.ceil(list.size() / 2.0);
				break;
			}

			if (number1 + number2 <= limit) {
				list.remove(0);
				list.remove(length - 1);

				length -= 2;
				count++;

			} else {
				list.remove(length);
				length -= 1;
				count++;

			}
		}
		System.out.println(count);
	}

}
