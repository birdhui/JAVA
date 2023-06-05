// Ch02_14. if문을 사용해 계절을 판단하는 프로그램 (지정 변환)
// 조건을 쓸 수 있는 if문의 장점을 이용해 보았습니다.
// 관계, 논리 연산자를 이용해 계절을 판단하는 조건을 작성했습니다.

import java.util.Scanner;

public class Season_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(1~12)을 입력하시오: ");				// 사용자로부터 월을 입력받음
		int month = sc.nextInt();
		
		if ((month >= 3) && (month < 6))						// month가 3과 같거나 크고 6보다 작다면
			System.out.println("현재 계절은 봄입니다.");				// 계절은 봄
		else if ((month >= 6) && (month < 9))					// month가 6과 같거나 크고 9보다 작다면
			System.out.println("현재 계절은 여름입니다.");			// 계절은 여름
		else if ((month >= 9) && (month < 12))					// month가 9와 같거나 크고 12보다 작다면
			System.out.println("현재 계절은 가을입니다.");			// 계절은 가을
		else if ((month >= 1) && (month < 3) || (month == 12))	// AND: (month가 1과 같거나 크고 3보다 작거나) OR: 12와 같다면
			System.out.println("현재 계절은 겨울입니다.");			// 계절은 겨울
		else													// 그 외의 입력값이라면
			System.out.println("잘못된 입력입니다.");
		
		sc.close();
	}
}
