package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {

	public static void main(String[] args) {
		// 메뉴판
		// 변수 선언 : 메뉴 번호, 메뉴 이름
		int menuNo = 0;
		int menuSum = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		// do~while문
		// : 무조건 1회는 실행 후, 조건을 검사하여 반복하는 문장
		do {
			System.out.println("========== 메뉴판 ==========");
			System.out.println("1. 제육볶음");
			System.out.println("2. 햄버거");
			System.out.println("3. 어린이 돈까스");
			System.out.println("4. 오향장육");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 : ");
			
			// 메뉴 번호 입	력
			menuNo = sc.nextInt();
			// break : 제어문을 탈출
			// 방법1
//			if ( menuNo == 0 ) break;
			
			// 방법2
			// return 값;
			// 1. 메소드를 종료
			// 2. 메모리 공간 해제
			// 3. (값) 메소드를 호출한 곳으로 반환
			if ( menuNo == 0 ) {
				System.out.println( menuSum + "개의 메뉴를 주문하였습니다. ");
				System.out.println("메뉴판을 종료합니다.");
				return;
			}
			switch (menuNo) {
			case 1: menuName = "제육볶음";		break;
			case 2: menuName = "햄버거";		break;
			case 3: menuName = "어린이 돈까스";	break;
			case 4: menuName = "오향장육";		break;
			default:	break;
			}
			
			// 메뉴번호 유효성 검사
			if (menuNo <= 4 && menuNo >= 1) {
				menuSum ++;
				System.out.println(menuName + "(을/를) 먹었습니다.");
			}else if( menuNo != 0) {
				System.out.println("유효하지 않은 번호 입니다. 다시눌러 주세요");
			}
		} while (menuNo != 0);
		System.out.println( menuSum + "개의 메뉴를 주문하였습니다. ");
		System.out.println("메뉴판을 종료합니다.");
		sc.close();
	}
}
