// Ch03_08. 사용자로부터 정수를 입력받아 배열의 length 필드를 이용해 평균을 구하는 프로그램

import java.util.Scanner;

public class ArrayLength_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요.\n>> ");
		int intArray[] = new int[5];			// 배열 선언과 동시에 생성
		double sum = 0.0;						// 정수의 합을 담을 변수 선언
		
		for(int i=0; i<5; i++)					// 배열의 원소 크기만큼
			intArray[i] = sc.nextInt();			// 사용자로부터 받은 정수를 인덱스에 저장
		
		for(int i=0; i<intArray.length; i++)	// 배열 원소 크기만큼
			sum += intArray[i];					// sum에 인덱스 값 저장
		
		System.out.print("평균은 " + sum/intArray.length + "입니다.");	// 합한 값 나누기 배열 원소크기를 나눠 평균을 구함
		sc.close();
	}
}
