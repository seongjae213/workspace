package com.kh.condition;

import java.util.*;

public class ControlPractice {

	public static void main(String[] args) {

//		practice1();
//		practice2();
//		practice3();
//		practice4();
//		practice5(); 
//		practice6();
//		practice7();
//		practice8();
//		practice9();
		practice10();
//		practice11();

	}

	public static void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~0000) : ");
		int password = sc.nextInt();
		int one = 0, ten = 0, hundred = 0, thousand = 0;
		thousand = password / 1000;
		hundred = (password - (thousand * 1000)) / 100;
		ten = (password - (thousand * 1000 + hundred * 100)) / 10;
		one = password - (thousand * 1000 + hundred * 100 + ten * 10);

		if (password > 9999 || password < 1000) {
			System.out.println("자리수 안맞음");
		} else if (thousand == hundred || thousand == ten || thousand == one || hundred == ten || hundred == one
				|| one == ten) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}

	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("존재하지 않는 메뉴입니다.");
		}

	}

	public static void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else if (num % 2 == 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
	}

	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();

		int sum = korean + math + english;
		double aver = sum / 3.0;
		if (aver < 60 || korean < 40 || math < 40 || english < 40) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("국어점수 : " + korean);
			System.out.println("수학점수 : " + math);
			System.out.println("영어점수 : " + english);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + aver);
			System.out.println("축하합니다. 합격입니다!");
		}
	}

	public static void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~12월 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season;
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "잘못 입력된 달";
		}
		System.out.printf("%d월은 %s입니다.", month, season);

	}

	public static void practice5() {
		Scanner sc = new Scanner(System.in);

		final String ID = "myID";
		final String PASSWD = "myPassword12";

		System.out.print("아이디 : ");
		String id = sc.next();

		System.out.print("비밀번호 : ");
		String password = sc.next();

		// 문자열 비교 메소드 : 문자열.equals(변수/"비교할문자열") => true/false
		if (id.equals(ID) && password.equals(PASSWD)) {
			System.out.println("로그인 성공");
		} else if (!id.equals(ID) && password.equals(PASSWD)) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (id.equals(ID) && !password.equals(PASSWD)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("가입된 정보가 없습니다.");
		}

	}

	public static void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급(관리자, 회원, 비회원) : ");
		String class1 = sc.next();
		switch (class1) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("존재하지 않는 등급입니다.");
		}

	}

	public static void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.printf("BMI 지수 : %.14f\n", bmi);
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}

	}

	public static void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		if (num1 <= 0 || num2 <= 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char arith = sc.next().charAt(0);

		switch (arith) {
		case '+':
			System.out.printf("%d %c %d = %f", num1, arith, num2, (float) num1 + num2);
			break;
		case '-':
			System.out.printf("%d %c %d = %f", num1, arith, num2, (float) num1 - num2);
			break;
		case '*':
			System.out.printf("%d %c %d = %f", num1, arith, num2, (float) num1 * num2);
			break;
		case '/':
			System.out.printf("%d %c %d = %f", num1, arith, num2, (float) num1 / num2);
			break;
		case '%':
			System.out.printf("%d %c %d = %f", num1, arith, num2, (float) num1 % num2);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}

	}

	public static void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		double midterm = sc.nextInt() * 0.2;
		System.out.print("기말 고사 점수 : ");
		double finalterm = sc.nextInt() * 0.3;
		System.out.print("과제 점수 : ");
		double assignment = sc.nextInt() * 0.3;
		System.out.print("출석 횟수 : ");
		double attend = sc.nextInt();

		double result = midterm + finalterm + assignment + attend;

		System.out.println("================= 결과 =================");
		if (attend <= 14) {
			System.out.printf("Fail [출석 횟수 부족 (%.0f/20)]", attend);
			System.exit(0);
		}

		System.out.println("중간 고사 점수(20) : " + midterm);
		System.out.println("기말 고사 점수(30) : " + finalterm);
		System.out.println("과제 점수(30) : " + assignment);
		System.out.println("출석 점수(20) : " + attend);
		System.out.println("총점 : " + result);
		if (result < 70) {
			System.out.println("Fail [점수 미달]");
		} else {
			System.out.println("Pass");
		}
	}

	public static void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("11. 비밀번호");
		System.out.print("선택 : ");
		int fnNum = sc.nextInt();

		switch (fnNum) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		case 11:
			practice11();
			break;
		}

	}

}
