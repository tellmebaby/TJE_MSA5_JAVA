package Day02;

import java.util.Scanner;

public class Ex10_InputOperator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// (바로 엔터) : shift + enter
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		// 합계, 평균
		int sum = x + y + z;
		double avg = sum / 3;
		// (duble) = (int) / (int);
		// ✅ int 는 정수 자료형으로, 실수의 소수부분을 표현할 수 없다.
		
		// (큰 자료형) + (작은 자료형) = (큰 자료형)
		// - 서로 다른 자료형 연산 시, 결과는 큰 자료형으로 변화된다.
		
		// 강제 형변환 : (자료형) 변수
		double realAvg = (double) sum / 3;
		double realAvg2 = sum / 3.0;
		
		System.out.print("합계 : " + sum);
		System.out.print("평균 : " + avg);
		System.out.print("평균1 : " + realAvg);
		System.out.print("평균2 : " + realAvg2);
		
		sc.close();
	}
}
