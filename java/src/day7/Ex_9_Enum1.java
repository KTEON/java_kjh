package day7;

import java.util.Calendar;
import java.util.Scanner;

public class Ex_9_Enum1 {

	public static void main(String[] args) {
		/*
		 * 오늘이 무슨 요일인지 확인하는 예제
		 */
		Calendar now = Calendar.getInstance();
		int week = now.get(Calendar.DAY_OF_WEEK);
		Week today = Week.MONDAY;
		switch(week) {
		case 1 : today = Week.SUNDAY; break;
		}
	}

}
enum Week{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
