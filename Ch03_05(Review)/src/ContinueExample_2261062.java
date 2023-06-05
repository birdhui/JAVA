// Ch03_05. 5개의 정수를 입력 받고 양수 합을 구하여 출력하는 프로그램 (자율 변환)
// 반복 for문과 조건 if-else문을 활용해
// 사용자로부터 받은 3개의 음의 실수의 합을 구하는 코드입니다.

import java.util.Scanner;

public class ContinueExample_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음수를 3개 입력하세요: ");			// 음수 3개 입력받음
		double sum = 0;									// 합을 저장할 변수

		for(int i=0; i<3; i++) {						// 0~2까지 3개의 실수가
			double num = sc.nextDouble();
			
			if(num < 0)									// 0보다 작다면
				sum += num;								// sum에 num값을 더하라
			else										// 그 외에 num이 0이거나 양수인 경우 더하지 않고 다음 반복으로 진행
				continue;
		}
		System.out.print("음수의 합은 " + sum + "입니다.");
		
		sc.close();
	}
}
