package com.kh.operator;

public class Arithmetic {

	public static void main(String[] args) {
		/*
		 * 산술연산자 (이항연산자) => + - * / %
		 * 
		 * 우선 순위 : * / % > + -
		 */

//		method1();
		method2();
	}

	public static void method2() {
		int a = 5;
		int b = 10;

		int c = (++a) + b; // c=> 16 a=6
		int d = c / a; // d=> 2
		int e = c % a; // e=> 4
		int f = e++; // f=> 4 e = 5
		int g = (--b) + (d--); // g=> 11 b=9 d=1
		int h = 2; // => 2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // i => 7
		// 6 6
		// a=7 b=9 c=15 d=1 e=6 f=4 g=10  h=2 i = 12
		System.out.printf("%d %d %d %d %d %d %d %d %d ", a, b, c, d, e, f, g, h, i);
	}

	public static void method1() {
		int n1 = 10;
		int n2 = 3;

		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));

		// 나머지 연산자 (%) -> 짝수/홀수 판별
		// ( 변수 % 2 == 0 ) --> 짝수
		// ( 변수 % 2 != 0 ) --> 홀수
		System.out.printf("n1의 값은 짝수인가? %b\n", (n1 % 2 == 0));
		System.out.printf("n2의 값은 짝수인가? %b\n", (n2 % 2 == 0));

	}
}
