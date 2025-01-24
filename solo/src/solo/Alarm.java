package solo;

import java.util.*;

public class Alarm {

	public static void main(String[] args) {
		
		//45분 전 알람 맞추기
		Scanner sc = new Scanner(System.in);

		System.out.print("시 분 : ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();

		if (minute - 45 < 0) {
			if (hour - 1 < 0) {
				System.out.printf("23 %d", 15 + minute);
			} else {
				System.out.printf("%d %d", hour - 1, 15 + minute);
			}
		} else {
			System.out.printf("%d %d", hour, minute - 45);
		}
	}

}
