package com.kh;

import java.util.*;

public class VariablePractice0 {

	public static void main(String[] args) {
		/*
		 * (1) 아래 코드를 변수를 사용하여 실행
		 */
		System.out.println("현재 2025년이고 올해 20살입니다.");
		// => 매년 출력한다면 어떤 부분을 변수로 사용할까?
		int year = 2025;
		int age = 20;
		// -println 메소드 사용
		System.out.println("현재 " + year + "년이고 올해 " + age + "살입니다.");
		// -printf 메소드 사용
		System.out.printf("현재 %d년이고 올해 %d살입니다.\n", year, age);

		System.out.println("몸무게가 80kg 이상인 경우 탑승하지 못합니다.");
		final double WEIGHT = 80;
		// -println 메소드 사용
		System.out.println("몸무게가 " + WEIGHT + "kg 이상인 경우 탑승하지 못합니다.");
		// printf 메소드 사용
		System.out.printf("몸무게가 %.1fkg 이상인 경우 탑승하지 못합니다.\n", WEIGHT);

		System.out.println("-------------------------------------------------------");
		/*
		 * 입력을 받기 위한 기능을 포함 클래스 : Scanner 1) 연결 : import 전체클래스명; // 패키지경로.클래스명 import
		 * java.util.Scanner; 2) 생성 : new 생성자; new Scanner(System.in);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		
		System.out.println(name + "반갑다.");
		//나이를 입력받아 출력 .nextInt()
		
		System.out.print("나이를 입력하세요 : ");
		int age1 = sc.nextInt();
		System.out.println("나이는 " + age1 + "살 입니다.");

		sc.nextLine();      // 버퍼 비우기
		System.out.print("하고픈말 : ");
		String temp = sc.nextLine();
		System.out.println(temp);
		
	}

}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
