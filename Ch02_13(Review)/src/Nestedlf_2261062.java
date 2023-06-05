// Ch02_13. 중첩 if-else를 사용해 합격/불합격 출력하는 프로그램

import java.util.Scanner;

public class Nestedlf_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		// sc 객체 생성
		
		System.out.print("점수를 입력하세요(0~100): ");	// 사용자로부터 점수를 입력받음
		int score = sc.nextInt();
		
		System.out.print("학년을 입력하세요(1~4): ");		// 사용자로부터 학년을 입력받음
		int year = sc.nextInt();
		
		if(score >= 60) {							// 점수가 60점 이상이라면
			if(year != 4)							// 학년이 4학년이 아니라면 합격
				System.out.println("합격입니다.");
			else if(score >= 70)					// 4학년이 70점 이상이라면 합격
				System.out.println("합격입니다.");
			else									// 4학년이 70점 미만이라면 불합격
				System.out.println("불합격입니다.");
		}
		else	// 점수가 60점 미만이라면 불합격
			System.out.println("불합격입니다.");
		
		sc.close();
	}
}
