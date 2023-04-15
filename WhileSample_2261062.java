// Ch03_02. while문을 이용해 정수 여러 개를 입력 받고 평균을 출력하는 예제

import java.util.Scanner;

public class WhileSample_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// sc 객체 생성
		
		int count=0, n=0;	// 횟수를 입력한 count와 사용자로부터 입력받을 n변수 선언 및 초기화
		double sum=0;		// n값을 더해 저장할 변수 sum 선언
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요: ");
		
		while((n = sc.nextInt()) != 0) {	// n이 0이 아니라면
			sum += n;						// sum에 n값을 더해라
			count++;						// count 1씩 증가
		}
		System.out.print("입력하신 수의 개수는 " + count + "개이며 ");		// 수의 개수 출력
		System.out.println("평균은 " + sum/count + "입니다.");			// 평균 출력
		
		sc.close();
	}
}
