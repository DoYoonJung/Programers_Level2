package Progamers_Level_2;

public class 문자열_압축 {

	public static int solution(String s) {
		int length = s.length();

		int answer = 0;

		for (int i = 1; i <= (length / 2) + 1; i++) {
			String abc = getReturn(s, i, 1);
			System.out.println(abc);
			int abb = abc.length();

			answer = i == 1 ? abb : (answer > abb ? abb : answer);
		}

		return answer;

	}

	public static String getReturn(String s, int n, int repeat) {
		if (s.length() < n)
			return s;

		String result = "";
		String First = s.substring(0, n);
		String Second = s.substring(n, s.length());

		if (!Second.startsWith(First)) {
			if (repeat == 1) {
				return result += First + getReturn(Second, n, 1);
			} else {
				return result += repeat + First + getReturn(Second, n, 1);
			}
		}

		return result += getReturn(Second, n, repeat + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("ababcdcdababcdcd"));
	}

}
