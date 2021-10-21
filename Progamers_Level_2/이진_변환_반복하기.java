package Progamers_Level_2;

public class 이진_변환_반복하기 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1111111";

		int Zero = 0;
		int count = 0;
		while (true) {
			count++;
			char[] arr = s.toCharArray();
			String size = "";
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == '1') {
					size += arr[i] + "";
				} else {
					Zero++;
				}
			}

			int length = size.length();
			if (length <= 1) {
				break;
			}
			s = Integer.toBinaryString(length);

		}

	}

}
