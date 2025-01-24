package com.kh;
import java.util.*;


public class CastingPractice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String code = sc.next();
		int codeTrans = (int)code.charAt(0);
		System.out.println(code + " unicode : " + codeTrans);

	}

}
