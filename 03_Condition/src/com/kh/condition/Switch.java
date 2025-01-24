package com.kh.condition;

import java.util.*;

public class Switch {

	/*
	 * switch 동등비교를 통해 흐름 제어 : 실행할 코드만 실행 후 자동종료X => 직접 종료되게 설정 (break;)
	 * 
	 */
	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
		method4();

	}
	
	public static void method4() {
		/*
		 * 
		 */
		
	}

	public static void method3() {
		/*
		 * 월 을 입력받아 해당 월의 말일이 며칠까지인지 출력
		 * 
		 * 월을 입력하세요 : xx xx월은 xx일까지 입니다.
		 * 
		 * 1,3,5,7,8,10,12 => 31 4,6,9,11 => 30 2 => 28
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.printf("%d월은 31일까지 입니다.\n", month);
			break;
		case 4, 6, 9, 11:
			System.out.printf("%d월은 30일까지 입니다.\n", month);
			break;
		case 2:
			System.out.printf("%d월은 28일까지 입니다.\n", month);
			break;
		default:
			System.out.println("존재하지 않는 월 입니다.");
		}

	}

	public static void method2() {
		/*
		 * 과일 구매 프로그램 : 구매하고자 하는 과일 입력시 해당 가격 출력
		 * 
		 * : 출력: "{과일이름}의 가격은 {과일가격}원 입니다." ---------------------------------- 사과 :
		 * 15000원 포도 : 30000원 귤 : 8000원 --------------
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("사과, 포도, 귤 중 선택 : ");
		String fruit = sc.next();
		int fruitPrice;
		switch (fruit) {
		case "사과":
			fruitPrice = 15000;
			System.out.printf("%s의 가격은 %d원 입니다.", fruit, fruitPrice);
			break;
		case "포도":
			fruitPrice = 30000;
			System.out.printf("%s의 가격은 %d원 입니다.", fruit, fruitPrice);
			break;
		case "귤":
			fruitPrice = 8000;
			System.out.printf("%s의 가격은 %d원 입니다.", fruit, fruitPrice);
			break;
		default:
			System.out.println("과일이 존재하지 않습니다.");
		}

	}

	public static void method1() {
		/*
		 * 정수 입력받아
		 * 
		 * 1:"빨간색" 2:"파란색" 3:"초록색" 그외:"잘못 입력하셨습니다."
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력(1~3) : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("빨간색");
			break;
		case 2:
			System.out.println("파란색");
			break;
		case 3:
			System.out.println("초록색");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}

		if (num == 1) {
			System.out.println("빨간색");
		} else if (num == 2) {
			System.out.println("파란색");
		} else if (num == 3) {
			System.out.println("초록색");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
