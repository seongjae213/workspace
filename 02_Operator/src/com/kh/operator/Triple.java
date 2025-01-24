package com.kh.operator;

import java.util.*;

public class Triple {

	/*
	 * 삼항연산자 (항이 3개지요!!)
	 * 
	 * 조건식? 참인경우 : 거짓인경우;
	 */
	public static void main(String[] args) {
//		method1();
		method2();
	}

	public static void method2() {
		/*
		 * 사용자에게 두 개의 정수와 + 또는 - 값을 입력받아 연산 결과를 출력
		 * 
		 * 입력 예) 입력하세요 : 10 20 +
		 * 
		 * 단, + 또는 -외의 문자가 입력되었을 경우 "입력이 잘못되었습니다." 출력
		 */
		Scanner sc = new Scanner(System.in);

		//nextLine으로 한줄 입력받고 사칙연산하기
		System.out.print("숫자 숫자 (+-)기호 : ");

		String str = sc.nextLine();
		int nu1 = 0, nu2 = 0;
		char ch = ' ';

		String str1 = "";
		int a = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ' && a == 0) {
				nu1 = Integer.parseInt(str1);
				str1 = "";
				a++;
				continue;
			} else if (str.charAt(i) == ' ' && a == 1) {
				nu2 = Integer.parseInt(str1);
				str1 = "";
				a++;
				continue;
			}
			str1 += str.charAt(i);
			ch = str.charAt(i);
		}

		switch (ch) {
		case '+':
			System.out.printf("%d + %d = %d입니다.\n", nu1, nu2, nu1+nu2);
			break;

		case '-':
			System.out.printf("%d - %d = %d입니다.\n", nu1, nu2, nu1-nu2);
			break;
		}
		
		
		//next로 한줄씩 입력받고 사칙연산
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();

		System.out.print("(+,-)기호를 입력하세요 : ");
		char arith = sc.next().charAt(0);

		int result = 0;

		if (arith == '+') {
			result = num1 + num2;
			System.out.printf("%d %c %d = %d입니다.", num1, arith, num2, result);
		} else if (arith == '-') {
			result = num1 - num2;
			System.out.printf("%d %c %d = %d입니다.", num1, arith, num2, result);

		} else {
			System.out.println("입력이 잘못되었습니다.");
		}

	}

	public static void method1() {
		// 입력한 값이 x인 경우 "종료합니다" 출력, 그렇지 않으면 "계속 진행합니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		String str = sc.next();
		char str1 = str.charAt(0);

		String result = (str1 == 'x' || str1 == 'X') ? "종료합니다." : "계속 진행합니다.";
		System.out.println(result);

	}

}
