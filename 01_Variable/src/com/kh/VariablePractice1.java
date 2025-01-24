package com.kh;

import java.util.*;

public class VariablePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.next();
		char gen = gender.charAt(0);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다. ^^\n", height, age, gen, name);
		System.out.println("키 " + height + "cm인 " + age + "살 " + gen + "자 " + name + "님 반갑습니다. ^^");

	}
	
}
