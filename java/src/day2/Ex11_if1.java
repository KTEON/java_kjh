package day2;

public class Ex11_if1 {

	public static void main(String[] args) {
		/*num가 짝수이면 짝수라고 출력하는 코드를 if문을 이용하여 작성하세요.
		 * ~하면 ...한다
		 * ~ : 조건식
		 * ... : 실행문
		 * if(조건식){
		 * 		실행문;
		 * }
		 * 
		 * if(num가 짝수이다){
		 * 		짝수라고 출력;
		 * }
		 * if(num%2 == 0){
		 * 		sysout
		 * 
		 */
		
		if(true) {
			System.out.println("참입니다.");
		}
		int num = 3;
		if(num  %2 == 0){
			 		System.out.println(num + "는 짝수");

	}
		// score가 90 이상이고 100점 이하라면 A학점이라고 출력하는 코드 if문 이용하여 작성
		// if(score가 90점 이상이고 score가 100점 이하다){
		// 		A학점이라고 출력;
		//}
		// if(score가 90점 보다 크거나 같다 && score점보다 작거나 같다){
		//		A학점이라고 출력;
		//}
		int score = 95;
		if ((score >= 90) && (score <= 100)); {
			System.out.println("A학점");
		}
}
}
