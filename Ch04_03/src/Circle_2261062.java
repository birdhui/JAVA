// Ch04_03. 세 개의 생성자를 가진 클래스(지정 변환)
// 객체 자신에 대한 this 레퍼런스를 사용해 같은 클래스의 두 번째 생성자를 세 번째 생성자에서 호출했습니다.

public class Circle_2261062 {
	int radius;	// 반지름을 저장하는 멤버 변수
	String name;	// 이름을 저장하는 멤버 변수
	
	public Circle_2261062() {	// 매개 변수 없는 생성자
		this(1, "");	// 반지름을 1로, 이름을 빈 문자열로 초기화한 후 다른 생성자 호출
	}
	
	public Circle_2261062(int r, String n) {	// 반지름과 이름을 입력받는 생성자
		this.radius = r;
		this.name = n;
	}
	
	public Circle_2261062(int r) {	// 반지름만 입력받는 생성자
		this(r, "이름없음");	// 반지름은 사용자로부터 입력받고, 이름은 "이름없음"으로 초기화한 후 두 번째 생성자를 호출
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle_2261062 pizza = new Circle_2261062(10, "자바피자");	// 두 번째 생성자 호출
		double area = pizza.getArea();	// 원의 면적 계산
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle_2261062 donut = new Circle_2261062();	// 기본 생성자로 Circle_2261062 객체 생성
		donut.name = "도넛피자";	// 객체의 이름 설정
		area = donut.getArea();	// 원의 면적 계산
		System.out.println(donut.name + "의 면적은 " + area);
		
		Circle_2261062 bread = new Circle_2261062(11);	// 세 번째 생성자 호출
		area = bread.getArea();	// 원의 면적 계산
		System.out.println(bread.name + "의 면적은 " + area);
	}
}
