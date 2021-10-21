package Progamers_Level_2;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citations = { 3, 0, 6, 1, 5 };
		Arrays.sort(citations);
		int max = -1;
		int k = BinarySearch(citations, max, 0, citations.length - 1);

		System.out.println(k);
	}

	public static int BinarySearch(int[] arr, int max, int start, int end) {
		if (start + 1 >= end) {
			return max;
		} else {
			int mid = (start + end) / 2;

			int a = arr[mid];
			int high = end - mid;
			int low = mid - start;

			if (high + 1 >= a && low + 1 <= a) {
				max = Math.max(max, a);
				return BinarySearch(arr, max, mid, end);
			} else {
				return BinarySearch(arr, max, start, mid);
			}
		}

	}

}
