// Ch02_09. 삼항 연산자를 이용한 예제 (자율 변환)

import java.util.Scanner;

public class TernaryOperator_2261062 {
	public static void main(String args[]) {
		System.out.println("두 가지 정수를 빈칸으로 분리하여 입력하세요: ");
		
		Scanner num = new Scanner(System.in);		// Scanner 객체 생성
		int a = num.nextInt();
		int b = num.nextInt();
		
		// 삼항 연산자를 이용해 a가 b보다 크다면 a를 b로 나눈 나머지 값을 출력하고 아니라면 b를 a로 나눈 나머지 값을 출력 
		System.out.println("두 수를 나눈 나머지는 " + ((a > b)?(a % b):(b % a)));
		
		num.close();
	}
}
