package solo;

import java.util.*;

public class Alphabet {

	public static void main(String[] args) {

		// 단어를 입력받고
		// 대소문자 구분없이 가장 많이 사용된 알파벳을 찾아라
		// 2개 이상일시 ? 출력
		Scanner sc = new Scanner(System.in);

		char[] alphabet = new char[26];

		for (int i = 0; i < 26; i++) {
			alphabet[i] = (char) (65 + i);
		}

		System.out.print("단어 입력 : ");
		String word = sc.next();
		
		int []result = new int[26];
		for(int i =0;i<word.length();i++) {
			int wordNum = word.charAt(i);
			switch(wordNum) {
			case 65,97:
				
			}
		}
		
		
		

//		for (int i = 0; i < 26; i++) {
//			for (int k = 0; k < word.length(); k++) {
//				if (alphabet[i] == word.charAt(k)) {
//					System.out.println(word.charAt(k));
//				}
//			}
//		}

	}

}
