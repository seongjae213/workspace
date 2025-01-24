package com.kh;

import java.util.*;

public class VariablePractice2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int firstNum = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int secNum = sc.nextInt();
		System.out.println("더하기 결과 : " + (firstNum + secNum));

		System.out.println("빼기 결과 : " + (firstNum - secNum));

		System.out.println("곱하기 결과 : " + (firstNum * secNum));

		System.out.println("나누기 결과 : " + (firstNum / secNum));

	}
}
