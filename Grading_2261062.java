// Ch02_12. switch문을 이용해 입력 받은 성적에 대해 학점을 부여하는 프로그램 작성 (지정 변환)
// if문은 관계, 산술 연산자를 사용해 조건을 작성할 수 있지만,
// switch문은 조건식을 쓸 수 없습니다.
// 그렇기에 사용자로부터 받은 점수를 10으로 나눠 정수로 떨어진 몫을
// case문에 적어 학점을 계산해봤습니다.

import java.util.Scanner;

public class Grading_2261062 {
	public static void main(String[] args) {
		Scanner bravo = new Scanner(System.in);
		
		// 사용자로부터 점수를 입력받음
		System.out.print("올해 3월 모의고사 국어 점수를 입력하세요(0~100): ");
		int score = bravo.nextInt();

		char grade = 0;			// 학점을 저장할 문자 타입 변수 선언
		switch(score / 10) {	// switch문은 수식을 사용할 수 없음 -> 점수를 10으로 나눈 몫만을 이용해 학점을 구함
		case 10:				// 점수를 10으로 나눈 몫이 10일 때
		case 9:					// 점수를 10으로 나눈 몫이 9일 때
			grade = 'A';		// grade에 'A'를 저장
			break;				// break를 만나면 switch문을 벗어남
		case 8:					// 점수를 10으로 나눈 몫이 8일 때 
			grade = 'B';		// grade에 'B'를 저장
			break;
		case 7:					// 점수를 10으로 나눈 몫이 7일 때
			grade = 'C';		// grade에 'C'를 저장
			break;
		case 6:					// 점수를 10으로 나눈 몫이 6일 때
			grade = 'D';		// grade에 'D'를 저장
			break;
		default:				// case의 비교 값과 일치하지 않다면
			grade = 'F';		// grade에 'F'를 저장
		}
			
		System.out.print("학생의 3월 모의고사 국어 학점은 " + grade + "입니다.");
		bravo.close();
	}
}
