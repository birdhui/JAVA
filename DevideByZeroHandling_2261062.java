// Ch03_13. try-catch문을 이용해 0으로 나누려 할 때 경고 메시지를 출력하도록 하는 프로그램 (지정 변환)
// 정수를 0으로 나눌 때 발생하는 예외 클래스 ArithmeticException과
// 정수가 아닌 문자를 입력했을 때 사용하는 InputMismatchException을 사용
// try문 안에 예외 클래스를 2개 사용하기 위해 2개의 catch문을 사용했습니다.

import java.util.Scanner;
import java.util.InputMismatchException;

public class DevideByZeroHandling_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend;	// 나뉨수
		int divisor;	// 나눗수
		
		try {
			System.out.print("나뉨수를 입력하시오: ");	// 정수가 아닌 수를 입력할 수도 있기에 try문에 포함
			dividend = sc.nextInt();
			System.out.print("나눗수를 입력하시오: ");
			divisor = sc.nextInt();
			
			System.out.print(dividend + "을 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		} catch (InputMismatchException e) {					// 정수가 아닌 문자를 입력했을 때
			System.out.println("정수가 아닙니다. 다시 입력해주세요.");	// 경고 메시지 출력
		} catch (ArithmeticException e) {						// 정수를 0으로 나눌 때
			System.out.println("0으로 나눌 수 없습니다.");			// 경고 메시지 출력
		}
		finally {
			sc.close();
		}
	}
}
