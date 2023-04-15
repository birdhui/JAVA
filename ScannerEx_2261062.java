// Ch02_05. Scanner를 이용해 사용자로부터 값을 입력받아 화면에 출력하는 프로그램

import java.util.Scanner;		// Scanner 클래스 : 읽은 바이트를 다양한 타입으로 변환하여 리턴

public class ScannerEx_2261062 {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner scanner = new Scanner(System.in);					// 객체 생성
		String name = scanner.next();								// scanner를 통해 입력된 키 값을 공백으로 구분되는 토큰 단위로 읽음
		System.out.println("당신의 이름은 " + name + "입니다.");			// 사용자로부터 입력받은 name 출력
		String city = scanner.next();
		System.out.println("당신이 사는 도시는 " + city + "입니다.");		// 사용자로부터 입력받은 city 출력
		int age = scanner.nextInt();
		System.out.println("당신의 나이는 " + age + "살입니다.");			// 사용자로부터 입력받은 age 출력
		double weight = scanner.nextDouble();
		System.out.println("당신의 체중은 " + weight + "kg입니다.");		// 사용자로부터 입력받은 weight 출력
		boolean single = scanner.nextBoolean();
		System.out.println("당신의 독신 여부는 " + single + "입니다.");		// 사용자로부터 입력받은 single 출력
		
		scanner.close();
	}
}
