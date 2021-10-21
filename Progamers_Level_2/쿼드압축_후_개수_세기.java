package Progamers_Level_2;

public class 쿼드압축_후_개수_세기 {
	static int one = 0;
	static int zero = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 1, 0, 0 }, { 1, 0, 0, 0 }, { 1, 0, 0, 1 }, { 1, 1, 1, 1 } };

		int length = arr.length;

		GetCount(0, length, 0, length, arr);

		System.out.println(one + " " + zero);

	}

	private static void GetCount(int xa, int xs, int ya, int ys, int[][] arr) {
		// TODO Auto-generated method stub
		int count = 0;
		int max = (int) Math.pow(xs - xa, 2);

		for (int i = xa; i < xs; i++) {
			for (int j = ya; j < ys; j++) {
				if (arr[i][j] == 1) {
					count++;
				}
			}

		}

		if (count == 0) {
			zero++;
		} else if (count == max) {
			one++;
		} else {
			int xm = (xa + xs) / 2;
			int ym = (ya + ys) / 2;

			GetCount(xa, xm, ya, ym, arr);
			GetCount(xm, xs, ya, ym, arr);
			GetCount(xa, xm, ym, ys, arr);
			GetCount(xm, xs, ym, ys, arr);
		}

	}

}
