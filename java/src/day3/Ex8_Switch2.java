package day3;

public class Ex8_Switch2 {

	public static void main(String[] args) {
		/*월이 주어졌을 떄 주어진 월의 마지막일을 출력하는 코드를 작성
		 * 
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 * 
		 */
		int month = 15;
		
		switch(month) {
		case 2:
			System.out.println(month+"월의 마지막 일은 28일 입니다.");
			break;
		case 4,6,9,11:
			System.out.println(month+"월의 마지막 일은 30일입니다.");
			break;
		case 1,3,5,7,8,10,12:
			System.out.println(month+"월의 마지막 일은 31일입니다.");
			break;
		default:
			System.out.println(month+"월은 잘못된 월입니다.");
		}
		
	}

}

/*강사님의 경우
 * 		int month = 15;
		
		switch(month) {
		case 2:
			System.out.println(month+"월의 마지막 일은 28일 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"월의 마지막 일은 30일입니다.");
			break;
		case 1: case 3: case 5: case 7: case 8: case 10:case 12:
			System.out.println(month+"월의 마지막 일은 31일입니다.");
			break;
		default:
			System.out.println(month+"월은 잘못된 월입니다.");
		}
	//콤마 써도 됨
 */
