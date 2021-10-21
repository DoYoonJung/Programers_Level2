package Progamers_Level_2;

//실패 ㅠ 
public class 행렬_테두리_회전하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;

		int columns = 6;
		int[][] queries = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };

		int[][] map = new int[rows + 5][columns + 5];
		int mapCount = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				map[i][j] = mapCount++;
			}
		}

		for (int i = 0; i < queries.length; i++) {
			int rows1 = queries[i][2] - queries[i][0];
			int columns1 = queries[i][3] - queries[i][1];

			int start = map[queries[i][0]][queries[i][1]];
			int end = map[queries[i][2]][queries[i][3]];

			for (int j = 0; j <= columns1; j++) {

			}
		}
	}

}
