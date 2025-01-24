package com.kh.operator;
import java.util.*;

public class Logical {

	public static void main(String[] args) {
		/*
		 * 논리 연산자 (이항 연산자)
		 * : 두 개의 논리값을 연산 (true/false)
		 * : 결과값도 논리값
		 * 
		 * *종류 : && ||
		 *  - A && B : A,B 모두 true여야 결과도 true
		 *  	false && true => 처음부터 false라서 true는 실행도 안됨   ㅡㅡㅡㅡㅡㄱ
		 *  															ㅣ_____ 
 		 *  - A || B : A 또는 B 하나라도 true면 결과도 true                	ㅣ      주의사항!!
		 *  	true || false => 처음부터 true라서 false는 실행도 안됨   ㅡㅡㅡㅡㅡ-
		 *  
		 *  ----------------------------------------------
		 *  
		 */
//		method1();
		method2();
	}
	
	public static void method2() {
		//입력받은 문자가 소문자인지확인
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = sc.next();
		int strNum = (int)str.charAt(0);
		boolean result = strNum >= 97 && strNum <= 122;
		System.out.println("소문자인가? " + result);
		
		
	}
	
	
	
	public static void method1() {
		//입력받은게 1~10사이인지
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("입력한 수가 1~10 범위입니까? " + ( num1 > 0 && num1 < 11 ));
	}
	

}
