package Day03;

import java.util.Scanner;

public class Ex05_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("채널을 선택하세요.");
		int channel = sc.nextInt();
		
		// switch : ctrl + space
		
		switch (channel) {
		case 11:
			System.out.println("MBC - 나혼자 안가");
			break;
		case 7:
			System.out.println("KBS - 무박2일");
			break;
		case 5:
			System.out.println("SBS - 런닝맨");
			break;
		case 100:
			System.out.println("TVING - 화상연애");
			break;

		default:
			System.out.println("요청하신 채널이 없습니다.");
			break;
		}
	}
}
