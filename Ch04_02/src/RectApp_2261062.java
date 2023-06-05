// Ch04_02. 너비와 높이 필드, 면적 값을 제공하는 getArea()메소드를 가진 Rectangle 클래스 만들기

import java.util.Scanner;

// Rectangle 클래스 정의
class Rectangle {
	int width;	// 너비를 저장하는 멤버 변수
	int height;	// 높이를 저장하는 멤버 변수
	int getArea() {	// 사각형의 면적을 계산하는 메소드
		return width*height;
	}
}

public class RectApp_2261062 {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();	// Rectangle 객체 생성
		Scanner sc = new Scanner(System.in);	// Scanner 객체 생성
		System.out.print(">> ");
		
		rect.width = sc.nextInt();	// 사용자로부터 너비 입력 받기
		rect.height = sc.nextInt();	// 사용자로부터 높이 입력 받기
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		sc.close();	// Scanner 객체 닫기
	}
}
