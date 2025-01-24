package com.kh.condition;

import java.util.*;

public class If {

	/*
	 * 조건문 if : 기본적으로 프로그램은 순차적으로 진행 순차적인 흐름을 바꿀때 제어문(조건문, 반복문, ...)을 사용하여 제어 가능 :
	 * 조건문 - 조건에 따라 선택적으로 실행할 때 : 반복문 - 반복적으로 실행할 때
	 * 
	 * : "조건식"을 통해 참인지, 거짓인지 판단하여 그에 해당하는 코드를 실행 => 조건식의 결과 : true, false => 연산자 :
	 * 비교연산자(> < ==), 논리연산자(|| &&)
	 * 
	 * : 조건문의 종류 - if, switch *if [1] 단독 if문 if (조건식) { // 조건식이 참일때 실행할 코드 }
	 * 
	 * : [2] if ~ else 문 if(조건식){}else{조건식이 거짓일때 실행}
	 * 
	 * : [3} if~else if~else if(조건식){}else if(조건식){}else{조건식 1,2 모두 거짓일경우 실행}
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();

	}

	public static void method3() {
		/*
		 * 주민번호 입력받아 남자인지 여자인지 -포함해서 입력받은 값의 길이가 14가 아닌경우 "잘못 입력하였습니다."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력(-포함) : ");
		String admin = sc.next();
		
		String str1 = admin.substring(0, 6);
		for(int i = 0;i<str1.length();i++) {
			if(str1.charAt(i)>'9'||str1.charAt(i)<'0') {
				System.exit(0);
			}
		}
		str1 = admin.substring(7, 14);
		for(int i = 0;i<str1.length();i++) {
			if(str1.charAt(i)>'9'||str1.charAt(i)<'0') {
				System.exit(0);
			}
		}
		
		char gender = admin.charAt(7);
		if (admin.length() != 14) {
			System.out.println("잘못 입력되었습니다.");
		}else if (gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못 입력되었습니다.");
		}
		
	}

	public static void method2() {
		/*
		 * 문자를 입력받아 소문자인 경우 "{입력받은 값}은 소문자입니다." 대문자인 경우 "{입력받은값}은 대문자입니다." 그렇지 않으면
		 * "알파벳이 아닙니다."
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char str = sc.next().charAt(0);
		if (str >= 97 && str <= 122) {
			System.out.println(str + "은 소문자입니다.");
		} else if (str >= 65 && str <= 90) {
			System.out.println(str + "은 대문자입니다.");
		} else {
			System.out.println("알파벳이 아닙니다.");
		}

	}

	public static void method1() {
		/*
		 * 사용자의 입력 값이 1~10인지 확인하여 범위를 벗어나면 "범위를 벗어났습니다." 범위내에 있으면 입력값 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		if (num >= 1 && num <= 10) {
			System.out.println(num);
		} else {
			System.out.println("범위를 벗어났습니다.");
		}

	}

}
