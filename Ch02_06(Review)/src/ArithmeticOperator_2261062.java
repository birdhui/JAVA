// Ch02_06. 사용자로부터 세 자리 정수를 입력받아 백의 자리, 십의 자리, 일의 자리를 출력하는 프로그램 (자율 변환)
// 사용자로부터 입력받은 세 자리 정수를 산술 연산자를 이용해
// 백의 자리와 십의 자리, 일의 자리를 각각 계산해 변수에 저장한 후 출력하는 코드를 작성해봤습니다.

import java.util.Scanner;

public class ArithmeticOperator_2261062 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int integer = num.nextInt();			// 사용자로부터 세 자리 정수 입력받음
		int hundred = integer / 100;			// 백의 자리를 구하기 위해 interger를 100으로 나눔
		int ten = (integer % 100) / 10;			// 십의 자리를 구하기 위해 100으로 나눈 나머지를 10으로 나눔
		int one = (integer % 100) % 10;
		
		System.out.print("정수 " + integer + "의");	// 입력받은 정수 값 출력
		System.out.print(" 백의 자리는 " + hundred);	// 백의 자리 값 출력
		System.out.print(", 십의 자리는 " + ten);		// 십의 자리 값 출력
		System.out.print(", 일의 자리는 " + one);		// 일의 자리 값 출력
		
		num.close();	// scanner 종료
	}
}
