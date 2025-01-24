package com.kh;

import java.util.*;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		double korean = sc.nextDouble();

		System.out.print("영어 : ");
		double english = sc.nextDouble();

		System.out.print("수학 : ");
		double math = sc.nextDouble();

		int result = (int) (korean + english + math);
		System.out.println("총점 : " + result);
		
		int aver = result/3;
		System.out.println("평균 : " + aver);

	}

}
