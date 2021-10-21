package Progamers_Level_2;

public class 두개_이하로_다른_비트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] numbers = { 2, 7 };
		String[] answer = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			String a = Long.toBinaryString(numbers[i]);
			while(a.length()<=15) {
				a = "0" + a;	
			}
		
			answer[i] = a;
		}
		
		for(int i=0; i<answer.length; i++) {
			long count = numbers[i]+1;
			for(long j=count; ;j++) {
				String b = Long.toBinaryString(j);
				while(b.length()<=15) {
					b="0"+b;
				}
				
				String arr = b&answer[i]
				
				
			}
		}
		

	}

}
