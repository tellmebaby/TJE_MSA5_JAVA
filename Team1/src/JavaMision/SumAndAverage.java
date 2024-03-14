package JavaMision;

import java.util.Scanner;

/**
 * 학생의 영어, 수학, 자바 성적을 각각 정수형 변수 eng, math, 
 * java 로 선언하고, 순서대로 점수를 입력 받아 성적의 총 합
	계와 평균을 계산하여 출력하는 프로그램을 작성하시오.
 */
public class SumAndAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("자바점수 : ");
		int java = sc.nextInt();
		
		int sum = eng + math + java ;
		double aver = (double) sum / 3;
		
		
		System.out.println("총점 : " + sum + "점");
		System.out.printf("평균 : " + "%.1f" ,aver);
		System.out.print("점");
	}
}
