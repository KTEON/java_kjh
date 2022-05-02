package day6;

public class Ex8_Array6_Divisor {

	public static void main(String[] args) {
		/*
		 * 정수 num의 약수를 배열에 저장한 후, 출력하는 코드를 작성하세요.
		 * 약수는 최대 10개만 저장 가능
		 * num=10
		 */
		int num = 144000;
		int max = 10;
		int index = 0; // 그저 변수명을 index로 한 거 뿐이지 복잡한 거 아니니 쫄지 마라
		int div[] = new int[max];
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				//System.out.println(i+"");
				//?번지가 10보다 작은지 확인하여 10보다 작으면 배역 ?번지에 i저장
				if(index < max) {
					div[index] = i;
					//?번지에 저장한 값을 출력
					System.out.println(div[index]+ "");
					//?을 1증가
					index++;
					
					
				}
			}
		}
		//출력
		for(int i=0; i<index; i++) {
			System.out.println(div[i]+"");
		}

	}

}
