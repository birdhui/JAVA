// Ch02_04. 자동 타입 변환과 강제 타입 변환의 이해를 위한 예제 (자율 변환)
// 치환문이나 수식 내에서 타입이 일치하지 않을 때 자동으로 타입이 변환되는 것과
// 괄호() 안에 명시적으로 타입을 지정해 강제 타입 변환하는 것을 이해하기 위해
// 여러 조건을 사용해봤습니다.

public class TypeConversion_2261062 {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b + i);					// b가 i타입으로 자동 변환
		System.out.println(b / i);					// b가 i타입으로 자동 변환되어 int b/i = 1이 됨  (나눗셈)
		System.out.println(b % i);					// b가 i타입으로 자동 변환되어 int b%i = 27이 됨 (나머지)
		System.out.println((double)b + i);			// b+i가 double타입으로 강제 변환
		System.out.println(6 / 8.2);				// 6이 6.0으로 자동 변환 
		System.out.println((int)4.0 + 8.2);			// 덧셈 연산자보다 괄호 연산자가 우선이기 때문에 double타입으로 출력됨
		System.out.println((int)(4.0 + 8.2));		// 괄호 연산 후 int타입으로 강제 변환
		System.out.println((double)2 + (double)8);	// 2와 8 모두 double 타입으로 강제 변환
	}
}
