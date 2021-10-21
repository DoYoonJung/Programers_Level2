package Progamers_Level_2;

public class 방문_길이 {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirs = "LULLLLLLU";

		int[][] map = new int[21][21];

		int x = 10;
		int y = 10;
		char[] result = dirs.toCharArray();
		for (int i = 0; i < result.length; i++) {
			int xx = x;
			int yy = y;

			if (result[i] == 'U' && y - 2 >= 0) {
				if (map[y - 1][x] != 2) {
					map[y - 1][x] = 2;
					y = y - 2;
					count++;
				} else {
					y = y - 2;
				}

			} else if (result[i] == 'D' && y + 2 <= 20) {
				if (map[y + 1][x] != 2) {
					map[y + 1][x] = 2;
					y = y + 2;
					count++;
				} else {
					y = y + 2;
				}

			} else if (result[i] == 'L' && x - 2 >= 0) {
				if (map[y][x - 1] != 2) {
					map[y][x - 1] = 2;
					x = x - 2;
					count++;
				} else {
					x = x - 2;
				}

			} else if (result[i] == 'R' && x + 2 <= 20) {
				if (map[y][x + 1] != 2) {
					map[y][x + 1] = 2;
					x = x + 2;
					count++;
				} else {
					x = x + 2;
				}

			}

		}

		System.out.println(count);
	}

}
