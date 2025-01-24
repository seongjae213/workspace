package solo;

import java.util.*;

public class ThreeDice {

	public static void main(String[] args) {
		// 주사위 3개 던져서 3개같은값이면 10000+값*1000 / 2개같으면 1000+값*100 / 다 다르면 가장큰값*100
		Scanner sc = new Scanner(System.in);

		System.out.print("값 3개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		/* 랜덤게임
		int ran1 = (int)(Math.random()*6)+1;
		System.out.println(ran1);
		int ran2 = (int)(Math.random()*6)+1;
		System.out.println(ran2);
		int ran3 = (int)(Math.random()*6)+1;
		System.out.println(ran3);
		num1 = ran1;
		num2 = ran2;
		num3 = ran3;*/
		

		if (num1 == num2 && num2 == num3 && num1 == num3) {
			System.out.println(num1 * 1000 + 10000);
		} else if (num1 == num2) {
			System.out.println(num1 * 100 + 1000);
		} else if (num1 == num3) {
			System.out.println(num1 * 100 + 1000);
		} else if (num2 == num3) {
			System.out.println(num2 * 100 + 1000);
		} else {
			int biggest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
			System.out.println(biggest*100);
		}

	}

}
