// Ch03_12. 예외로 인한 강제 종료 예제

import java.util.Scanner;

public class DivideByZero_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend;	// 나뉨수
		int divisor;	// 나눗수
		
		System.out.print("나뉨수를 입력하시오: ");
		dividend = sc.nextInt();
		System.out.print("나눗수를 입력하시오: ");
		divisor = sc.nextInt();
		
		System.out.print(dividend+ "을 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		
		sc.close();		
	}
}
