// Ch02_11. if-else문을 사용해 나이를 입력받아 20대인지 판별하는 프로그램

import java.util.Scanner;

public class Twenties_2261062 {
	public static void main(String[] args) {
		Scanner human = new Scanner(System.in);		//  human 객체 생성
		
		System.out.print("나이를 입력하시오: ");			// 사용자로부터 나이를 입력받음
		int age = human.nextInt();
		
		// 나이가 20과 같거나 크고 30보다 작다면
		if((age >= 20) && (age < 30)) {
			System.out.println("당신은 20대입니다.\n20대를 즐기세요!");
		}
		// 아니라면 else문 출력
		else
			System.out.print("슬프게도 당신은 20대가 아닙니다.");
		
		human.close();
	}
}
