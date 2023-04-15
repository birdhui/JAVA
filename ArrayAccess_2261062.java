// Ch03_07. 양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램

import java.util.Scanner;

public class ArrayAccess_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[];			// 배열 레퍼런스 변수 intArray 선언
		intArray = new int[5];	// 배열 생성
//		int intArray[] = new int[5]; 와 같다.
		int max = 0;			// 가장 큰 수를 담을 max 변수 선언 및 초기화
		
		System.out.print("양수 5개를 입력하세요.\n>> ");
		
		for(int i=0; i<5; i++) {			// 배열 원소 크기에 맞춰 0~4까지
			intArray[i] = sc.nextInt();		// 배열 인덱스에 맞춰 저장
			
			if(intArray[i] > max)			// 인덱스 0~4가 max보다 크다면
				max = intArray[i];			// max에 배열 인덱스 값을 저장
		}									// 배열 원소 크기에 맞춰 모두 반복한 뒤
		System.out.print("가장 큰 수는 " + max + "입니다.");	// 가장 큰 수가 담긴 max 출력
		
		sc.close();		
	}
}
