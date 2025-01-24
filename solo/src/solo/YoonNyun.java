package solo;

import java.util.*;

public class YoonNyun {

	public static void main(String[] args) {

		// 윤년 구하기
		Scanner sc = new Scanner(System.in);

		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();

		// 1방법 삼항연산자로 한번에
		String result = year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? "1" : "0") : "1") : "0";
		System.out.println(result);

		// 2방법 else if문
		if (year % 4 == 0 && year % 400 == 0) {
			System.out.println(1);
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
