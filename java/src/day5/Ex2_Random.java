package day5;

public class Ex2_Random {

	public static void main(String[] args) {
		/*
		 * 0<=math.random() <1 실수
		 * 0* (max-min+1) <= math.random()*(max-min+1)<1*(max-min+1)
		 * 0<= Math
		 * 0<Math.random()*(max-min+1)+min<(max-min+1)+min
		 * min<= 
		 * 
		 * 
		 */
		int min = 1, max = 10;
		int r;
		for(int i = 1; i<=10; i++) {
			r = (int)(Math.random()*(max-min+1)+min); //랜덤 써야할 때 공식처럼 쓰임 암기할 것
			System.out.print(r + " ");
			
		}

	}

}
