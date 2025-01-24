package com.kh;

public class Cast {

	/*
	 * 형변환 : 값의 자료형을 바꾸는 것.
	 * 
	 * 컴퓨터에서 값 처리 규칙 (형변환이 필요한 시점)
	 * 1) 대입 연산자 : 왼쪽과 오른쪽이 같은 자료형이어야 함!
	 * 				=> 다른 자료형의 값을 대입하고자 할 때 형변환 필수!
	 * 
	 * 		자료형 변수명 = (자료형)값;	
	 * 
	 * 2) 같은 자료형끼리만 연산 가능!
	 * 
	 * 		결과 = 값1 + 값2;
	 * 		=> 값1, 값2 모두 같은 자료형이어야 함!
	 * 		   결과값도 같은 자료형이어야 함!
	 */
	public static void main(String[] args) {
//		autoCasting();
		forceCasting();
	}
	
	public static void forceCasting() {
		/*
		 * 강제 형변환
		 * : 자동 형변환이 되지 않는 경우 직접 형변환을 해주는 것
		 * 	큰 범위의 자료형에서 작은 범위의 자료형으로 변환이 필요할 때
		 * 
		 * 	(변환할자료형)변환할대상
		 * 	=> 변환대상 : 값, 변수, ...
		 */
		// 실수형 d1 변수에 4.0 이라는 값을 저장
		double d1 = 4.0;
		// 정수형 i1 변수에 50이란 값을 저장
		int i1 = 50;
		
		//d1 변수와 i1변수의 합을 정수형 result변수에 저장
		int result = (int)d1 + i1;
		//-------------------
		//강제 형변환시 데이터 손실 위험
		int i2 = 290;
		byte b1 = (byte)i2;
		System.out.println(b1);
	}
	
	public static void autoCasting() {
		/*
		 * 자동 형변환
		 * : 값의 범위가 작은자료형 -> 큰 자료형
		 * byte	-	short	-	int	-	long	- float	-	double
		 * 			char	-	
		 * 
		 */
		// 정수형 변수 i1 에 12라는 값을 저장
		int i1 = 12;
		// 실수형 변수 d1에 i1 값을 저장
		double d1 = i1;		//i1(int) => double
							//	12	=>	12.0
		System.out.println(d1);
		int i2 = 15;
		double d2 = 3.3;
		double result = i2+d2;
		System.out.println(result);
		
		
		
		
		
		
	}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
