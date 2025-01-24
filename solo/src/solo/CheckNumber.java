package solo;

import java.util.*;

public class CheckNumber {

	public static void main(String[] args) {
		// 배열로 입력받아 없는 번호 찾아내서 죽이기
		Scanner sc = new Scanner(System.in);

		System.out.print("1~30 번호 입력 : ");
		int[] std = new int[31];
		
		for(int i =0; i<28;i++) {
			int num = sc.nextInt();
			std[num] = 1;
		}
		
		for(int i = 1; i<std.length; i++) {
			if(std[i] != 1) {
				System.out.println(i);
			}
		}

	}

}
