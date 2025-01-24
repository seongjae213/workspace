package com.kh.operator;
import java.util.*;

public class OperatorPractice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1();
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
//		practice8();
//		practice9();
//		practice10();
//		practice11();
	}

	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		String result = a>0?"양수이다":"양수가 아니다.";
		System.out.println(result);
		
	}

	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		String result = a>0?"양수이다":a==0?"0이다":"음수다.";
		System.out.println(result);
		
	}

	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		String result = a%2==0?"짝수다":"홀수다";
		System.out.println(result);
		
	}

	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 입력하세요 : ");
		int per = sc.nextInt();
		System.out.print("사탕개수 입력하세요 : ");
		int candy = sc.nextInt();
		System.out.printf("1인당 사탕 개수 : %d\n남는 사탕 개수 : %d", candy/per, candy%per);
		
	}

	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		String gender1 = (gender=='m'||gender=='M')?"남학생":"여학생";
		System.out.print("성적(소수점 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점입니다.", grade, classNum, num, name, gender1, score);

	}

	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result = age>19?"성인":age>13?"청소년":"어린이";
		System.out.println(result);
		
	}

	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double aver = sum/3.0;
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n",aver);
		System.out.println((aver>=60 && korean>=40 && english>=40 && math>=40)?"합격":"불합격");
	}

	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char resident = sc.next().charAt(7);
		System.out.println(resident=='2'||resident=='4'?"여자":"남자");
		
	}

	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2(정수1보다 크게) : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3<=num1||num3>num2)?true:false;
		System.out.println(result);
		
		
		
	}

	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		System.out.println(num1==num2&&num2==num3&&num1==num3?true:false);
	}

	public static void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		double num1 = sc.nextDouble();
		System.out.print("B사원의 연봉 : ");
		double num2 = sc.nextDouble();
		System.out.print("C사원의 연봉 : ");
		double num3 = sc.nextDouble();
		
		double aIncen = num1*1.4;
		double bIncen = num2;
		double cIncen = num3*1.15;
		
		System.out.printf("A사원 연봉/연봉+a : %.0f/%.1f\n", num1, aIncen);
		System.out.println(aIncen>=3000?"3000이상":"3000미만");
		System.out.printf("B사원 연봉/연봉+a : %.0f/%.1f\n", num2, bIncen);
		System.out.println(bIncen>=3000?"3000이상":"3000미만");
		System.out.printf("C사원 연봉/연봉+a : %.0f/%.13f\n", num3, cIncen);
		System.out.println(cIncen>=3000?"3000이상":"3000미만");

		

	}
}
