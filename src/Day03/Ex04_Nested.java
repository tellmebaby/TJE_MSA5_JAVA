package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 자격증 합격기준
		// (조건) 4학년, 60점 이상 - 합격
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		String message = "응시자격 요건에 해당되지 않습니다.";
		// 4학년
		
		if ( year == 4 && score >= 60) {
			System.out.println("합격!");
			message = "";
		}else if (year == 4 ) {
			System.out.println("아쉽게도 저희와 함께 가지 못하게 되었네요. "
					+ "다음 기회엔 함께 할 수 있기를 희망합니다. "
					+ "댁네두루평안하시고 안빈 하시고 낙도 하세요.");
			message = "";
		}
		System.out.println(message);
		
//		if ( year == 4) {
//			// 60점 이상
//			if ( score >= 60 ) {
//				System.out.println("합격!");
//			}else {
//				System.out.println("불합격!");
//			}
//		}
//		else {
//			System.out.println("응시자격 요건에 해당되지 않습니다.");
//		}
		
		sc.close();
	}
	
}
