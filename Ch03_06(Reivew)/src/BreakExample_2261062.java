// Ch03_06. "exit"가 입력되면 while문을 벗어나도록 break문을 활용하는 프로그램

import java.util.Scanner;

public class BreakExample_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		
		while(true) {
			System.out.print(">> ");
			String text = sc.nextLine();
			
			// equals() : 객체끼리 내용을 비교할 수 있는 메소드 (내용 자체를 비교)
			// == : 비교를 위한 연산자 (주소값 비교)
			if(text.equals("exit"))					// 사용자가 "exit"를 입력하게 되면 
				break;								// break문 실행
		}
		System.out.println("프로그램이 종료되었습니다.");	// 프로그램 종료 메시지 출력
		sc.close();
	}
}
