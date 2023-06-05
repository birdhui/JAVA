// Ch03_09. for-each문을 활용해 double[]배열의 합을 구하고, char[]배열의 문자열을 출력하는 프로그램 (지정 변환)
// Scanner 클래스로 사용자로부터 실수와 문자를 입력받아 배열에 저장하고 출력까지 만든 코드입니다.
// 입력받은 5개의 실수를 for문과 length 필드를 이용해 인덱스에 저장,
// for-each문을 활용해 실수 배열의 합을 구했습니다.
// char형 또한 같은 방법으로 배열에 저장을 했지만,
// Scanner는 문자를 입력받는 기능이 존재하지 않아
// 먼저 문자열로 입력 받은 후 문자로 변환하는 charAt 메소드를 이용했습니다.
// charAt : 인덱스로 주어진 값에 해당하는 문자를 리턴하는 String Class의 메소드

import java.util.Scanner;

public class foreachEx_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 실수를 입력하세요.\n>> ");			// 5개의 실수 입력
		double d_num[] = new double[5];						// 배열 선언
		double sum = 0;
		
		for(int i=0; i<d_num.length; i++)					// 배열의 원소 크기만큼
			d_num[i] = sc.nextDouble();						// 입력받은 실수 저장
		
		for(double d_realnum : d_num) {						// 변수에 배열의 인덱스 값 치환?
			System.out.print(d_realnum + " ");
			sum += d_realnum;								// sum에 배열 저장			
		}
		System.out.println("합은 " + sum + "입니다.\n");
		
		System.out.print("생각나는 한글 자음 다섯 개를 입력하세요.\n>> ");	// 5개의 문자 입력
		char c_string[] = new char[5];						// 배열 선언
		
		for(int i=0; i<c_string.length; i++)				// 배열의 원소 크기만큼
			c_string[i] = sc.next().charAt(0);				// string으로 입력받은 뒤 charAt 메소드를 통해 char형으로 변환
		
		for(char stick : c_string)							// 변수에 배열의 인덱스 값 저장
			System.out.print(stick + " ");					// 입력받은 한글 자음 출력
		
		sc.close();
	}
}
