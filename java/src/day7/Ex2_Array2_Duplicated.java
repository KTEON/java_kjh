package day7;

import java.util.Scanner;

public class Ex2_Array2_Duplicated {

	public static void main(String[] args) {
		int arr[] = {1,2,4};
		/*
		 * 정수 num을 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드를 작성하세요.
		 */
		Scanner scan = new Scanner(System.in);
		
		int num, count=0;
		//정수 입력
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
		//0번지와 num와 같은지 확인
		if(arr[0] == num) {
			count++;
		}
		//1번지와 num와 같은지 확인
		if(arr[1] == num) {
			count++;
		}
		
		//2번지와 num와 같은지 확인
		if(arr[2] == num) {
			count++;
		}
		if(count>=1) {
			System.out.println("배열 arr에는 " + num + "가 있습니다.");
		}else {
			System.out.println("배열 arr에는 " + num + "가 없습니다.");
		}
		//반복문 사용1 : 배열 전체를 탐색 =>
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println("배열 arr에는 " + num + "가 있습니다.");
		}else {
			System.out.println("배열 arr에는 " + num + "가 없습니다.");
		}
		//반복문 사용 2 : 첫번째 중복숫자가 나오면 확인 중단
		int i;
		for(i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				break;
			}
		}
		if(i<arr.length) {
			System.out.println("배열 arr에는 " + num + "가 있습니다.");
		}else {
			System.out.println("배열 arr에는 " + num + "가 없습니다.");
		}
		
		
	}

}
