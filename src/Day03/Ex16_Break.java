package Day03;

import java.util.Scanner;

public class Ex16_Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 무한루프
		// : 반드시 종료조건을 추가해 주어야 한다. (break)
		while(true) {
			System.out.print("입력 : ");
			String str = sc.nextLine(); 	// 문자열 한 줄 입력
			
			// 문자열.equals("비교문자열")
			// : 문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드(true/false)
			
			if ( str.equals("stop")) {
				break;
			}
			if ( str.equals("따라하지 말라긔")) {
				System.out.println("stop이라고 해봐");
			}else {
				System.out.println(">> " + str);
			}
		}
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
	}
	
}
