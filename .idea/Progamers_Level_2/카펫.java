package Progamers_Level_2;

public class Ä«Æê {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brown = 24;
		int yellow = 24;

		int total = brown / 2 + 2;

		int column = 3;
		int row = total - column;

		int row1 = row;
		for (int i = row; i >= 3; i--) {
			if ((i - 2) * (column - 2) == yellow) {
				break;

			} else {
				row1--;
				column++;
			}
		}

	}

}
