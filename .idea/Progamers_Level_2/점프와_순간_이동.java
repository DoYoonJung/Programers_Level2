package Progamers_Level_2;

public class 점프와_순간_이동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int distance = 5;
		while (distance != 0) {
			if (distance % 2 == 0) {
				distance = distance / 2;
			} else {
				distance = distance - 1;
				answer++;
			}

		}
		System.out.println(answer);
	}

}
