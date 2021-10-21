package Progamers_Level_2;

import java.util.Stack;

public class 짝지어_제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cdcd";

		Stack<Character> stack = new Stack<>();
		char[] arr = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {

			if (stack.size() == 0) {
				stack.push(arr[i]);
			} else if (stack.peek() == arr[i]) {
				stack.pop();
			} else {
				stack.push(arr[i]);
			}

		}

		System.out.println(stack.isEmpty() ? 1 : 0);
	}

}
