package day6;

public class Ex2_Break {

	public static void main(String[] args) {
		/*
		 * 
		 */
		int i, j;
		for(i =1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.println(i + ", " + j);
				if(j==3) {
					break;
				}
			}
			//브레이크를 만나면 이 위치로 이동
		}
		System.out.println("---------------------------------------");
		out:for(i =1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.println(i + ", " + j);
				if(j==3) {
					break out;
				}
			}
		}
		//브레이크를 만나면 이 위치로 이동
	}

}
