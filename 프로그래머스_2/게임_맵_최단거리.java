package Progamers_Level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {
	static int[] d1 = { -1, 1, 0, 0 };
	static int[] d2 = { 0, 0, -1, 1 };
	static boolean[][] visit;
	static int row;
	static int column;
	static int[][] map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 } };
		map = maps;
		row = maps.length;
		column = maps[0].length;
		visit = new boolean[row][column];

		visit[0][0] = true;
		int inx = BFS(new Pos(0, 0, 1));
		int check = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (map[i][j] == 1) {
					check = 1;
				}
			}
		}
		if (check == 1) {
			System.out.println(-1);
		} else {
			System.out.println(inx);
		}

	}

	public static int BFS(Pos pos) {
		Queue<Pos> q = new LinkedList<Pos>();
		q.offer(pos);
		int tt = 1000000;

		while (!q.isEmpty()) {
			Pos p = q.poll();
			map[p.x][p.y] = 0;
			for (int i = 0; i < 4; i++) {
				int xx = p.x + d1[i];
				int yy = p.y + d2[i];
				if (xx >= 0 && yy >= 0 && xx < row && yy < column) {
					if (map[xx][yy] == 1 && visit[xx][yy] == false) {
						visit[xx][yy] = true;
						q.offer(new Pos(xx, yy, p.cnt + 1));

						if (xx == row - 1 && yy == column - 1) {
							tt = Math.min(tt, p.cnt + 1);
						}
					}
				}
			}
		}
		return tt;
	}

}

class Pos {
	int x;
	int y;
	int cnt;

	public Pos(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}
