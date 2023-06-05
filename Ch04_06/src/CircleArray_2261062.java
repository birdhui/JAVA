// Ch04_06. Circle 배열 만들기

class Circle{
	int radius;	// 반지름을 저장하는 멤버 변수
	
	// 반지름을 인자로 받아 멤버 변수 radius에 저장하는 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 원의 면적을 계산 후 리턴(반환)하는 메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray_2261062 {
	public static void main(String[] args) {
		Circle [] c;		// Circle 객체의 배열 c 선언
		c = new Circle[5];	// 크기가 5인 배열 c 생성
		
		for (int i=0; i<c.length; i++)	// i가 0부터 c배열의 길이까지 반복
			c[i] = new Circle(i);		// 배열[i]에 반지름 i를 인자로 받아 Circle 객체 생성 후 저장
		
		// Circle 객체 배열 c의 모든 원소에 접근해 해당 요소의 면적을 출력하는 반복문
		for (int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " ");	// getArea()메소드가 반환한 면적 값을 정수형으로 출력 후 공백 추가
	}
}
