package day7;

public class Ex1_Array1 {

	public static void main(String[] args) {
		/*
		 * 5개 짜리 배열을 만들고, 0번지에 1, 1번지에 2, ... , 4번지에 5를 저장하고, 출력하는 코드를 작성
		 */
		int num[]= new int[5];
		
		for(int i = 0; i<num.length; i++) {
			num[i]=i+1;
			System.out.println(num[i]);
			
		}

	}

}
