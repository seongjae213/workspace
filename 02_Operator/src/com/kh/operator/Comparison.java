package com.kh.operator;

import java.util.*;

public class Comparison {

	/*
	 * 비교연산자 (이항 연산자) : 두 값을 비교하는 연산자 : 조건을 만족하면 연산 결과가 true, 그렇지 않으면 false
	 * 
	 * * 종류 - 대소 비교 연산자 : < > <= >= - 동등 비교 연산자 : == !=
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 : ");
		// 입력받은 두 정수의 값을 비교
		int n1 = sc.nextInt();
		System.out.print("정수2 : ");
		int n2 = sc.nextInt();
		System.out.println("정수1과 정수2는 같은 값인가? " + (n1 == n2));
		System.out.println("정수1이 정수2보다 큰가?" + (n1 > n2));
		System.out.println("정수2는 짝수인가?" + (n2 % 2 == 0));

		System.out.println("정수2는 'A'의 유니코드인가? " + (n2 == 'A'));

	}

}
