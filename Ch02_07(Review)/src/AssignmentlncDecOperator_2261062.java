// Ch02_07. 대입, 증감 연산자를 사용한 예제

public class AssignmentlncDecOperator_2261062 {
	public static void main(String[] args) {
		int a = 3, b = 3, c = 3;
		
		// 대입 연산자
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		
		// 증감 연산자
		int d=3;
		a = d++;
		System.out.println("a=" + a + ", d=" + d);
		a = ++d;
		System.out.println("a=" + a + ", d=" + d);
		a = d--;
		System.out.println("a=" + a + ", d=" + d);
		a = --d;
		System.out.println("a=" + a + ", d=" + d);
	}
}
