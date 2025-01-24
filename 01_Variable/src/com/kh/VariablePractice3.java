package com.kh;

import java.util.*;

public class VariablePractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();

		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + (width * 2 + height * 2));

	}

}
