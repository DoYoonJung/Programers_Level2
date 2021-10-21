package Progamers_Level_2;

public class 주식가격 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price = { 1, 2, 3, 2, 3 };
		int[] result = new int[price.length];
		int count = 0;
		for (int i = 0; i < price.length; i++) {
			int check = 0;
			for (int j = i; j < price.length; j++) {
				if (price[i] > price[j] && i != j) {

					result[count]++;

					break;
				} else if (price[i] <= price[j] && i != j) {
					result[count] = ++check;
				}
			}
			count++;

		}

		for (int i = 0; i < price.length; i++) {
			System.out.println(result[i]);
		}

	}

}
