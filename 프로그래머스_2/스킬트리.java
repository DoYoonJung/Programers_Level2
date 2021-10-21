package Progamers_Level_2;

import java.util.ArrayList;

public class 스킬트리 {
	static boolean[] check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

		int count = 0;

		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < skill.length(); i++) {
			list.add(skill.charAt(i));
		}

		for (int i = 0; i < skill_trees.length; i++) {
			check = new boolean[list.size()];

			char[] result = skill_trees[i].toCharArray();
			boolean flag = true;

			for (int j = 0; j < result.length; j++) {
				int index = list.indexOf(result[j]);

				if (index == 0) {
					check[index] = true;
				} else if (index != -1) {
					if (check[index - 1] == false) {
						flag = false;
						break;
					} else {
						check[index] = true;
					}
				}

			}

			if (flag)
				count++;

		}

		System.out.println(count);

	}

}
