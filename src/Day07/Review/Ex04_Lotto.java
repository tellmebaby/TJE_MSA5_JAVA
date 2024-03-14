package Day07.Review;

public class Ex04_Lotto {

	public static int getLotto() {
		int result = 0;
		return result;
	}
	
	public static void main(String[] args) {
		// Math.random() : 0.XXXXX ~ 0.9XXXXX 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);
		
		// 1~6 사이의 정수 : 주사위
		// Math.random() 					: 0.XXXXX ~ 0.9XXXXX
		// Math.random() * 10				: X.XXXXX ~ 9.XXXXX
		// (int) (Math.random() * 10) 		: 0 ~ 9 (10개)
		// (int) (Math.random() * 6) 		: 0 ~ 5 (5개)
		// (int) (Math.random() * 6) + 1 	: 1 ~ 6 (6개)
		
		int dice = (int) (Math.random() * 6) + 1 ;
		System.out.println("주사위 : " + dice);
		
		
		// 1~45 사이의 정수 : 로또
		int lotto = (int) (Math.random() * 45) + 1 ;
		System.out.println("로또 랜덤 번호: " + lotto);
		
		// (공식) : (int) (Math.random() * [개수]) + [시작숫자]
		// 1~20 사이의 랜덤수
		int RN = (int) (Math.random() * 20) + 1 ;
		System.out.println("1~20 사이의 랜덤수: " + RN);
		
		// -20 ~ 20 사이의 랜덤수
		int RN2 = (int) (Math.random() * 41) - 20 ;
		System.out.println("-20~20 사이의 랜덤수: " + RN2);

		// 1~45 사이의 랜덤수 6개를 배열에 중복없이 오름차순으로 저장하시오.
		// (과제) : 중복제거, 오름차순 정렬
		int arr[] = new int[6];
		boolean sw = true; 				// 중복알림 변수 생성
		
		//중복알림 없어질 때까지 반복되는 반복문
		int ss1 = 0;
		int rss = 0;
		while( sw ) {
			for (int i = 0; i < arr.length; i++) {
				int r = (int) (Math.random() * 45 + 1);
				arr[i] = r;
			}
			
			for (int i = 1; i < arr.length; i++) {
				for (int j = i; j < arr.length; j++) {
//						System.out.print(arr[i-1]+"와" + arr[j] + "의 비교  ");
						if(arr[i-1] == arr[j]) {
							System.out.println("중복숫자 발견!!" + arr[j]);
							//중복된다는 표시 넘김
							sw = true;
							//켜고 다시만들어
							for (int k = 0; k < arr.length; k++) {
								int r = (int) (Math.random() * 45 + 1);
								arr[k] = r;
							}
						}else {
//							System.out.println("중복없음");
							sw = false;
							//없어서 그냥진행
						}
				}
//				System.out.println();
			}
		}
		
		// 내 순위 검사기
		int ran[] = new int [6];
		int countRan = 0;
		for (int i = 1; i < arr.length; i++) {
			countRan = 0;
			for (int j = 0; j < arr.length; j++) {
			//	System.out.println(arr[i-1]+"와" + arr[j] + "의 비교  ");
				if(arr[i-1] < arr[j]) {
					countRan++ ;
			// System.out.print("작아서 랭킹?" + countRan);
				}else {
					continue;
				}
			}
			
			// 없는 랭킹은 따로 넣어줘라
			// System.out.println(arr[i-1] + "랭킹?" + countRan);
			ran[countRan] = arr[i-1];
			ss1 += countRan;
		}
		ss1 = 15 - ss1;
		rss = arr[5];
		
		ran[ss1] = rss;
		
		// 거꾸로 넣자
		int ss2 = 5;
		for (int i = 0; i < ran.length; i++) {
			arr[ss2] = ran[i];
			ss2--;
		}
		
		// 출력
		System.out.print("중복없고 오름차순의 로또 랜덤 번호 : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}





