package Progamers_Level_2;

import java.util.ArrayList;

public class «¡∑ª¡Ó4∫Ì∑œ {
	static char[][] map;

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int n = 5;

		String[] board = { "CCBDE", "AAADE", "AAABF", "CCBBF" };
		map = new char[m][n];

		for (int i = 0; i < m; i++) {
			map[i] = board[i].toCharArray();
		}
		int tt = 0;
		while (true) {
			tt++;
			boolean[][] visit = new boolean[m][n];
			int cnt = 0;
			for (int i = 0; i < m - 1; i++) {
				for (int j = 0; j < n - 1; j++) {
					if (map[i][j] == '0') {
						continue;
					}

					if (map[i][j] == map[i][j + 1] && map[i][j] == map[i + 1][j] && map[i][j] == map[i + 1][j + 1]) {
						visit[i][j] = true;
						visit[i][j + 1] = true;
						visit[i + 1][j] = true;
						visit[i + 1][j + 1] = true;
						cnt++;
					}

				}
			}

			if (cnt == 0) {

				break;
			}

			for (int i = 0; i < n; i++) {
				ArrayList<Character> list = new ArrayList<>();
				for (int j = m - 1; j >= 0; j--) {
					if (visit[j][i] == true) {
						count++;
						continue;
					}
					list.add(map[j][i]);
				}
				int k = 0;
				for (int j = m - 1; j >= 0; j--) {
					if (k < list.size()) {
						map[j][i] = list.get(k);
						k++;
					} else {
						map[j][i] = '0';
					}

				}
			}

		}
		System.out.println(count);

	}

}
