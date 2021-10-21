package Progamers_Level_2;

import java.util.Arrays;
import java.util.Comparator;

public class 파일명_정렬_3차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] files = { "img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG" };

		Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {

				String head1 = o1.split("[0-9]")[0];
				String head2 = o2.split("[0-9]")[0];

				int result = head1.toLowerCase().compareTo(head2.toLowerCase());

				if (result == 0) {
					result = chm(o1, head1) - chm(o2, head2);
				}

				return result;
			}
		});
		for (int i = 0; i < files.length; i++) {
			System.out.print(files[i] + " ");
		}

	}

	public static int chm(String a, String b) {
		a = a.substring(b.length());
		String result = "";
		for (char c : a.toCharArray()) {
			if (Character.isDigit(c) && result.length() < 5) {
				result += c;
			} else {
				break;
			}
		}

		return Integer.parseInt(result);
	}

}
