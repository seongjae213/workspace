package com.kh.operator;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		example01();
//		example02();
		example03();
	}

	public static void example03() {
		/*
		 * 산술연산자 활용 키, 몸무게 입력받아 BMI 계산하여 출력 
		 * *BMI : 몸무게 / (키(m) * 키(m));
		 * - 18.5 이하 : 저체중
		 * - 18.5 < BMI <= 22.9 : 정상 
		 * - 23.0 <= BMI <= 24.9 : 과체중 
		 * - 25 <= BMI : 비만
		 * 
		 * BMI 지수는 20.5로 정상입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력(cm) : ");
		int height = sc.nextInt();
		System.out.print("몸무게 입력(kg) : ");
		double weight = sc.nextDouble();

		double bmi = weight / ((height * height) / 10000.0);
		String result = (bmi<=18.5)?"저체중":((bmi<23)?"정상":((bmi<25)?"과체중":"비만"));
		System.out.printf("bmi : %.1f로 %s입니다.",bmi,result);

	}

	/*
	 * 비교연산자, 논리연산자 :결과값이 참 또는 거짓 :이항 연산자
	 */
	public static void example02() {
		/*
		 * 나이를 입력받아 초등학생, 중학생, 고등학생인지 구분하여 출력 (+ 그 외에는 "알수없음") - 초등학생 : 8살~13살 - 중학생 :
		 * 14살 ~ 16살 - 고등학생 : 17살 ~ 19살
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		String result = (age < 8 || age > 19) ? "알수없음"
				: (age >= 17 ? "고등학생입니다." : (age >= 14 ? "중학생입니다." : "초등학생입니다."));
		System.out.println(result);

		// SCE => && || 첫 조건으로 결과를 알 수 있을경우 뒷 조건을 실행하지 않음
		// && => 앞이 false면 뒤 실행 안함
		// || => 앞이 true면 뒤 실행 안함
		int num = 10;
		int i = 3;
		boolean result2;

		result2 = ((num += 15) < 0) && ((i *= 2) > 2);
		System.out.println("연산 결과");
		System.out.println(result2);
		System.out.println(i);
		System.out.println(num);
		result2 = ((num += 15) < 0) || ((i *= 2) > 2);
		System.out.println("연산 결과");
		System.out.println(result2);
		System.out.println(i);
		System.out.println(num);

	}

	/*
	 * 복합대입연산자 :대입 연산자 + 다른 연산자 조합
	 * 
	 * n1 += 10; => n1 = n1 + 10;
	 */

	public static void example01() {
		/*
		 * 사용자로부터 숫자를 입력받아 그 값에 7L을 더한 결과를 출력 => 숫자 입력받을때 short자료형 사용
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("값을 입력하세요 : ");
		short num1 = sc.nextShort();
		num1 = (short) (num1 + 7L);
		System.out.println("값은 " + num1 + "입니다.");
		System.out.println();

	}
}
