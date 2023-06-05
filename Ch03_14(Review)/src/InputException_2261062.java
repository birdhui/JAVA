// Ch03_14. 사용자가 정수가 아닌 문자를 입력할 때 발생하는 예외를 처리하는 클래스 예제

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요: ");
		int sum = 0, num = 0;
		
		for(int i=0; i<3; i++) {
			System.out.print(i + " >> ");
			
			try {
				num = sc.nextInt();					// 사용자가 정수가 아닌 문자를 입력하면
			} catch(InputMismatchException e) {		// 예외를 처리하는 클래스 실행
				System.out.println("정수가 아닙니다. 다시 입력해주세요.");	// 경고 메시지 출력
				sc.next();		// 입력 스트림에 있는 정수가 아닌 토큰을 버림
				i--;			// 인덱스가 증가하지 않도록 미리 감소시킴
				continue;		// 다음 루프
			}
			sum += num;			// num 값을 더해가기
		}
		System.out.println("합은 " + sum);
		sc.close();
	}
}
