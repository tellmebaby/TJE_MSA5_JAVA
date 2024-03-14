package Day03;

import java.util.Scanner;

public class Ex13_Gugu {

	public static void main(String[] args) {
		// 구구단 (1~9단)
		// 원하는 단을 입력 받아 아래와 같이, 구구단 수식을 출력하시오.
		// 입력 : 3
		// 출력
		// 3*1=3
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(num + "X" + i + "=" + num*i);
			
		}
		System.out.println("구구단 끝");
		sc.close();
	}
}
