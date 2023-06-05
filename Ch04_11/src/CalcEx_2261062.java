// Ch04_11. 전역함수로 작성하고자 하는 abs, max, min의 3개 함수를 static메소드를 작성하고 다른 클래스에서 메소드를 호출하는 프로그램 (자율 변환)
// 제곱근을 반환하는 static 메소드와 두 개의 매개 변수 중 큰 소수에서 작은 소수를 뺄셈하는 static 메소드를 추가했습니다.

class Calc {
	public static int abs(int a) { return a > 0 ? a: -a; }		// 정수의 절댓값을 반환하는 메소드, a가 양수인 경우 그대로 반환하고 음수인 경우 음수 값을 양수로 바꾼 후 반환
	public static int max(int a, int b) { return (a>b)?a:b; }	// 두 정수 중 큰 값을 반환하는 메소드, a와 b 중 큰 값을 반환
	public static int min(int a, int b) { return (a>b)?b:a; }	// 두 정수 중 작은 값을 반환하는 메소드, a와 b 중 작은 값을 반환
	public static double sqrt(double a) { return a*a; }			// 실수의 제곱 값을 반환하는 메소드, a의 제곱 값을 반환
	public static double minus(double a, double b) { return (a>b)?a-b:b-a; }	// 두 실수의 차이를 반환하는 메소드, a와 b 중 크다면 a에서 b를 뺄셈하고 아니라면 b에서 a를 뺄셈해 그 값을 반환 
}

public class CalcEx_2261062 {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));		// abs() 메소드를 호출해 -5의 절댓값을 출력
		System.out.println(Calc.max(10, 8));	// max() 메소드를 호출해 10과 8 중 큰 값을 출력
		System.out.println(Calc.min(-3, -8));	// min() 메소드를 호출해 -3과 -8 중 작은 값을 출력
		System.out.println(Calc.sqrt(2.2));		// sqrt() 메소드를 호출해 2.2의 제곱 값을 출력
		System.out.println(Calc.minus(1.2, 3.4));	// minus() 메소드를 호출해 1.2와 3.4 중 큰 값에서 작은 값을 뺀 값을 출력
	}
}
