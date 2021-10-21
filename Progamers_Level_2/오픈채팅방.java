package Progamers_Level_2;

public class ¿ÀÇÂÃ¤ÆÃ¹æ {

	public String[] solution(String[] record) {

		int length = record.length;
		String[] answer = new String[length + 5];

		String[] one = new String[length + 5];
		String[] two = new String[length + 5];
		String[] three = new String[length + 5];

		for (int i = 0; i < length; i++) {
			String[] temp = record[i].split(" ");
			int a = temp.length;
			if (a == 2) {
				one[i] = temp[0];
				two[i] = temp[1];
			} else {
				one[i] = temp[0];
				two[i] = temp[1];

				three[i] = temp[2];
			}

		}

		for (int i = 0; i < length; i++) {

			if (one[i].equals("Enter")) {
				if (i != 0) {
					for (int j = i - 1; j >= 0; j--) {
						if ((one[j].equals("Enter") || one[j].equals("Leave")) && two[j].equals(two[i])) {
							answer[j] = three[i];

						}
					}
					answer[i] = three[i];

				} else {
					answer[i] = three[i];
				}

			} else if (one[i].equals("Leave")) {
				int cout = -1;
				for (int j = i - 1; j >= 0; j--) {
					if (one[j].equals("Enter") && two[j].equals(two[i])) {
						cout = j;
						break;
					}
				}
				answer[i] = three[cout];

			} else {
				for (int j = i - 1; j >= 0; j--) {
					if ((one[j].equals("Enter") || one[j].equals("Leave")) && two[j].equals(two[i])) {
						answer[j] = three[i];
					}
				}

			}

		}

		for (int i = 0; i < length; i++) {
			if (one[i].equals("Enter")) {
				answer[i] = answer[i] + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
			} else if (one[i].equals("Leave")) {
				answer[i] = answer[i] + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
			} else {
				String[] temp = answer;
				answer = new String[--length];
				int count = 0;
				for (int j = 0; j < answer.length; j++) {

					if (count != i) {
						answer[count] = temp[j];
						count++;
					}

				}
				i--;

			}
		}

		return answer;
	}

}
