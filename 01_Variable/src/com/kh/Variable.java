package com.kh;

public class Variable {
	public static void main(String[] args) {
//		printVariable();
		declareVariable();

	}

	public static void declareVariable() {
		/*
		 * 변수 선언 : 값을 기록하기 위한 변수를 메모리 공간에 할당
		 * 
		 * [표현식]
		 * 
		 * 자료형 변수명; 자료형 : 변수의 크기 및 모양을 지정하는 부분 변수명 : 변수의 이름을 부여하는 부분(의미 부여)
		 * 
		 * 명명 규칙 [1] 카멜케이스 : 소문자로 시작해서 다른 단어가 붙을 땐 대문자로 시작 => 클래스명의 경우 "대문자"로 시작 [2] 영문은
		 * 대소문자를 구분함 [3] 숫자로 시작하면 안된다 [4] 예약어 사용불가 [5] 특수문자 _ 또는 $ 만 사용 가능
		 * 
		 * 주의 사항 - 같은 영역 안에서는 동일한 변수명으로 선언 불가 (중복 선언 불가) - 해당 영역 안에서 선언된 변수는 그 영역 안에서만
		 * 사용 가능. => 다른 영역에서는 사용 불가
		 */
		// 정수형 변수 num에 10을 대입
		int num = 10;
		int num2 = 20;

		// ------------------------------------------------------------
		// 1. 논리형 (boolean) : 논리값 (true/false) 1byte
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("isTrue 변수의 값 : " + isTrue);
		System.out.println("isFalse 변수의 값 : " + isFalse);

		isTrue = 1 + 1 > 1; // isTrue 값 : true!
		isFalse = 2 + 3 < 0;
		// --------------------------------------------------------------
		// 2. 숫자 (정수형/실수형)
		// 2-1) 정수형 : 딱 떨어지는 수. 소숫점 x
		// byte (1B) / short (2B) / int (4B)* / long (8B)

		byte bNum = -128; // byte : -128 ~ 127
		bNum--;
		System.out.println(bNum);

		// 2-2) 실수형 : 소숫점 O
		//		float (4B) / double (8B) *
		float fNum = 0.0f;	//0.0값을 저장
							//소숫점 7자리 표현가능
							//값 자체(리터럴)를 저장할 때 값 뒤에 f를 붙여줌
		double dNum = 0;	//소숫점 15자리 표현가능
							//실수형의 기본 자료형*
		//-----------------------------------------------------------
		// 3. 문자형 ( char / String )
		// 3-1) 문자 : char(2B)
		char ch = 'a';
		char kim = '김';
		
		//3-2) 문자열 : String (참조자료형)
		String str;
		str = "문자열입니다~~";
		System.out.println("str 변수의 길이 : " + str.length());
		//----------------------------------------------------------
		
		//상수 : 변하지 않는 값을 저장하는 공간
		//[표현식]
		//			final 자료형 변수명;
		//TODO : 나이를 저장하기 위한 상수 AGE 선언
		final int AGE;
		AGE = 26; // 한번 이후로는 재할당x
		
		System.out.println("Math.PI : " +  Math.PI);
		
		//[참고]
		int sample = 999_999_999; //가독성을 위해 3자리마다 _표시 가능
		System.out.println("sample : " + sample);
		
		
		
		
	}

	public static void printVariable() {

		/*
		 * 변수의 목적? - 데이터를 저장하기 위한 공간 - 가독성 증가 (변수의 이름을 의미있게 지어야함) - 재사용성 증가 (한번 값을 저장하면
		 * 필요할때마다 변수이름으로 가져가 사용) - 유지보수 용이 (한번 저장해놓으면 해당 위치의 값을 변경)
		 */

		// 월급 계산 = 시급 X 근무시간 X 근무일수
		// 출력형식 ㅇㅇㅇ : 0000원
		// 2025최저시급 : 10050
		System.out.println("유성재 : " + 10050 * 6 * 14 + "원 입니다.");
		System.out.println("백승민 : " + 10050 * 8 * 14 + "원 입니다.");
		System.out.println("정세용 : " + 10050 * 10 * 14 + "원 입니다.");
		System.out.println("이주언 : " + 10050 * 8 * 14 + "원 입니다.");

		// 변수를 사용한다면?
		int pay = 12000;
		int time = 8;
		int day = 14;

		System.out.println("-----------------------------------------------");
		System.out.println("백승민 : " + pay * (time - 2) * day + "원 입니다.");
		System.out.println("유성재 : " + pay * time * day + "원 입니다.");
		System.out.println("정세용 : " + pay * (time + 2) * day + "원 입니다.");
		System.out.println("이주언 : " + pay * time * day + "원 입니다.");
	}
}
