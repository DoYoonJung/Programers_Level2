package Progamers_Level_2;

public class 예상_대진표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int a = 4;
		int b = 5;
		int count = 1;

		int temp1 = Math.max(a, b);
		int temp2 = Math.min(a, b);

		a = temp1;
		b = temp2;

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (a - b == 1) {
					if (a % 2 == 0 && b % 2 == 1)
						break;
				}

			} else {
				if (a % 2 == 0) {
					a = a / 2;
					if (a == 0)
						a = 1;
				}

				else
					a = a / 2 + 1;

				if (b % 2 == 0) {
					b = b / 2;
					if (b == 0)
						b = 1;
				}

				else
					b = b / 2 + 1;
				count++;

				if (a - b == 1) {
					if (a % 2 == 0 && b % 2 == 1)
						break;

				}

			}

		}

		System.out.println(count);

	}

}
