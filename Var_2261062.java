// Ch02_02. var 키워드를 사용해 변수 선언하는 예제

public class Var_2261062 {
	public static void main(String[] args) {
		var price = 200;		// price는 int타입
		var name = "kitae";		// name은 string타입
		var pi = 3.14;			// pi는 double타입
		
		System.out.println("price = " + (price + 1000));	// 괄호 연산자가 우선이기에 price에 1000을 더한 값 출력
		System.out.println("name = " + name);				// 문자열 타입의 변수 name 값 출력
		System.out.println("pi = " + pi);					// 실수 타입의 pi 값 출력
	}
}
