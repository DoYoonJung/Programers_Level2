package Progamers_Level_2;

public class ¹æ±Ý±×°î {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "ABC";
		String[] musicinfos = { "12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF" };
		int result[] = new int[musicinfos.length];

		int count = -1;
		String answer = "";
		for (int i = 0; i < musicinfos.length; i++) {
			String temp[] = musicinfos[i].split(",");

			String arr1[] = temp[0].split(":");
			String arr2[] = temp[1].split(":");

			int one = (Integer.parseInt(arr2[0]) - Integer.parseInt(arr1[0])) * 60;
			int two = (Integer.parseInt(arr2[1]) + one) - Integer.parseInt(arr1[1]);

			char[] word = temp[3].toCharArray();
			String n = "";
			int k = 0;
			for (int j = 0; j < two; j++) {
				if (k == word.length) {
					k = 0;
				}
				if (word[k] == '#') {
					n = n + word[k];
					k++;
					j--;
				} else {
					n = n + word[k];
					k++;
				}

			}

			int a = n.indexOf(m);
			if (a != -1) {
				if (two == count) {
					count = count;
				} else if (two > count) {
					count = two;
					answer = temp[2];
				}
			}
		}

		System.out.println(answer);

	}

}
