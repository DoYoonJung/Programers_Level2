package Progamers_Level_2;

import java.util.Stack;

public class 괄호_전하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "[)(]";

		Stack<String> st = new Stack<>();

		int result = 0;
		for (int k = 0; k < s.length(); k++) {
			boolean flag = true;
			if (k != 0) {
				String a = s.substring(0, 1);
				String b = s.substring(1, s.length());
				s = b + a;
			}
			for (int i = 0; i < s.length(); i++) {
				String an = s.substring(i, i + 1);

				if (i == 0) {
					if (!(an.equals("{") || an.equals("[") || an.equals("("))) {
						flag = false;
						break;
					} else {
						st.push(an);
					}
				} else {
					if (st.isEmpty()) {
						st.push(an);
					} else {
						String pk = st.peek();
						if (pk.equals("{") && an.equals("}")) {
							st.pop();
						} else if (pk.equals("[") && an.equals("]")) {
							st.pop();
						} else if (pk.equals("(") && an.equals(")")) {
							st.pop();
						} else {
							st.push(an);
						}
					}

				}

			}
			if (st.isEmpty() && flag == true) {

				result++;
			}

			else {
				st.clear();
			}

		}

		System.out.println(result);
	}

}
