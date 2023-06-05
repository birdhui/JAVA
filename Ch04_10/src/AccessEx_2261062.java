// Ch04_10. 멤버의 접근 지정자 (지정 변환)
// 에러가 발생하지 않도록 Sample 클래스에 setB() 메소드를 추가해 필드 b의 값을 설정할 수 있는 프로그램
// private 접근 지정자를 가진 멤버 변수는 클래스 내에서만 사용가능하기 때문에
// setB() 메소드 내에서 인자로 받은 매개 변수를 b에 저장해 출력하도록 만들었습니다.

class Sample {
	public int a;	// public 접근 지정자를 가진 멤버 변수 a 선언
	private int b;	// private 접근 지정자를 가진 멤버 변수 b 선언
	int c;			// 접근 지정자를 명시하지 않은 멤버 변수 c 선언
	
	// 필드 b의 값을 설정하기 위한 setB() 메소드 정의
	public void setB(int n) {
		b = n;		// setB의 인자인 매개 변수 n을 private 접근 지정자를 가진 b에 저장
		System.out.println("b는 " + b);	// b 출력
	}
}

public class AccessEx_2261062 {
	public static void main(String[] args) {
		Sample aClass = new Sample();	// Sample 클래스의 인스턴스 생성
		aClass.a = 10;					// aClass의 a를 10으로 설정
		System.out.println("a는 " + aClass.a);
		aClass.setB(20);				// b의 값을 설정하기 위해 setB메소드에 값 전달 후 출력
		aClass.c = 10;					// aClass의 c의 값을 10으로 설정
		System.out.println("c는 " + aClass.c);
	}
}
