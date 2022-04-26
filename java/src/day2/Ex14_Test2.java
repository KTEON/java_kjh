package day2;

public class Ex14_Test2 {

	public static void main(String[] args) {
		/* 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * A : 90이상 100이하
		 * B : 80이상 90미만
		 * C : 70이상 80미만
		 * D : 60이상 70미만
		 * F : 0이상 60미만
		 * 0미만, 100초과인 경우 잘못된 성정이라고 출력하도록 수정하세요.
		 */

		int score = 105;
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("B");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("C");
		}
		else if(score >= 60 && score < 70) {
			System.out.println("D");
		}
		else if(score >= 0 && score < 60) {
			System.out.println("F");
		}
		else if(score > 100 || score < 0) {
			System.out.println("잘못된 성적");
		}

}
}
// 강사님의 경우

/*if (score < 0 || score > 100) {
 * 		sysout(score + "점은 잘못된 성적")
 * }
 * if(score >= 90) {
		System.out.println("A");
	}
	이런 식으로
	이러면 마지막에 else 쓰기 가능
	코드가 간결해진다.
	else{
		sysout(score + "점은 F학점");
	}
 * */
