package day4;

public class Ex10_While2_Sum {

	public static void main(String[] args) {
		/*
		 * 1부터 5까지의 합을 구하는 코드를 while문을 이용하여 작성.
		 */
		int i=1, sum=0;
		
		while(i<=5) {
			sum += i;
			i++;
			
		}
		System.out.println(sum);
		
	}

}
