package Day04;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N 입력받고,
		// 둘째 줄에 N 개의 정수를 공백을 두고 입력 받으시오.
		// N 개의 정수 중, 최댓값을 출력하시오.
		// (입력예시)
		// 5
		// 90 60 70 100 55
		// (출력예시)
		// 최댓값 : 100
		
		/*
		 * (순서도)
		 * 1. 정수 하나를 입력받는다.
		 * 2. 입력받은 정수를 변수 N에 대입한다.
		 * 3. N번 반복하여 N개의 정수를 입력받는다.
		 * 4. 입력받은 N개의 정수를 배열 arr 에 저장한다.
		 * 5. 배열 arr을 반복하여, 최댓값 변수 max 와 i번째 배열요소를 비교한다.
		 * 6. 두 요소 중 더 큰 요소를 max에 대입한다.
		 * 7. 반복이 끝나고, 변수 max를 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int N = sc.nextInt();
		System.out.println(N + "번의 정수 입력을 해주세요");
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print(i+1 + "번째 정수를 입력 해주세요 : ");
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE ;  // int 타입의 최소값 : -21억
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("최댓값 : " + max);
		sc.close();
		
		
	}
}
