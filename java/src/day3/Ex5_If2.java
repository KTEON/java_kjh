package day3;

public class Ex5_If2 {

	public static void main(String[] args) {
		/*num가 6의 배수인지 아닌지 판별하는 중첩 if문으로 작성
		 * num가 6의 배수이다 -> num을 6으로 나우었을 때 나머지가 0과 같다
		 * ->num%6 == 0
		 * 6의 배수 -> 2의 배수이면서 3의 배수
		 */
		int num = 12;
		
		if(num % 6 == 0) {
			System.out.println(num + "는 6의배수");
		}else {
			System.out.println(num + "는 6의 배수 아님");
		}
		if(num % 2 == 0) {
			
		}
	}

}
