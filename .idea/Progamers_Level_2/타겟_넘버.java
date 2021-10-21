package Progamers_Level_2;

public class Å¸°Ù_³Ñ¹ö {
	static int count, goal, n, num[], cache[];

	public static void dfs(int x) {
		if (x == n) {
			int sum = 0;
			for (int a : cache)
				sum += a;
			if (sum == goal)
				count++;
			return;
		}

		cache[x] = -num[x];
		dfs(x + 1);
		cache[x] = num[x];
		dfs(x + 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;

		n = numbers.length;
		goal = target;
		num = numbers;
		cache = new int[n];

		dfs(0);

		int answer = count;

	}

}
