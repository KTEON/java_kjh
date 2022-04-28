package day4;

import java.util.Scanner;

public class Ex2_For2_Score {

	public static void main(String[] args) {
		
		
		/* 3명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하세요. 반복문 이용
		 * 단 총점과 평균만 알면 됨.
		 * 
		 * 
		 * 반복횟수 : 3번
		 * 규칙성 : 성적을 입력받고 총점에 누적
		 * 		  Scanner를 이용하여 정수를 입력받아  num에 저장한 후,
		 * 		  sum에 num을 더해서 sum에 저장
		 * 반복문 종료 후 : 총점을 출력하고, 총점을 이용하여 평균을 계산 한 후, 총점을 출력
		 * 				 sum을 출력하고, sum을 3으로 나누어서 avg에 저장한 후, avg을 출력
		 * 
		 */
				
		Scanner scan = new Scanner(System.in);
		int i, sum=0;
		double avg;
		for(i=1;i<=3;i++) {
			//Scanner를 이용하여 정수를 입력받아  num에 저장한 후,
			//sum에 num을 더해서 sum에 저장

			
			System.out.print("학생" +i+"의 국어성적을 입력하세요 : ");
			int num = scan.nextInt();		
			
			
			sum=sum+num;// 1~5까지 누적합 예제 참조 sum+=num;일케도 쓸 수 잇음
		}
		System.out.println("3명의 학생의 국어 총점 : " + sum);
		avg = sum / 3.0; //실수 = 정수/정수;	정수=실수/정수 ->이 두 경우 안됨
		System.out.println("3명의 학생의 국어 평균 : " + avg);
		//총점을 출력하고, 총점을 이용하여 평균을 계산 한 후, 총점을 출력
		//sum을 출력하고, sum을 3으로 나누어서 avg에 저장한 후, avg을 출력
		scan.close();
	}

}
