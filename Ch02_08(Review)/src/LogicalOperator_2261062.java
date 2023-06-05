// Ch02_08. 비교/논리 연산자를 이용한 예제 (자율 변환)
// 관계 연산자와 논리 연산자를 이해하기 위해
// 정수와 실수를 섞어 계산을 해보기도 하고 문자와 문자열을 비교/계산해보았습니다.

public class LogicalOperator_2261062 {
	public static void main(String[] args) {
		System.out.println('b' > 'a');				// 문자 b(아스키코드:98)가 a(아스키코드:97)보다 크다 => True
		System.out.println("abc" == "abc");			// 문자열 abc 모두 같다. => True
		System.out.println(3 <= 2);					// 2가 3보다 작거나 같다. => False
		System.out.println(4 > 1);					// 4가 1보다 크다. => True
		System.out.println(2.1 >= 1.9);				// 2.1이 1.9보다 크거나 같다. => True
		System.out.println(2 != 2);					// 2와 2는 같다 (부정) => True -> False
		System.out.println((2 < 1) && (4 > 3));		// 2가 1보다 작고 4가 3보다 크다 => and연산자기에 False
		System.out.println((-1 > -4) || (2 > 4));	// -1이 -4보다 크거나 4가 2보다 작다 => or연산자이기에 True
		System.out.println((-1 > -4) ^ (-1 > 0));	// -1이 -1보다 크거나 -1이 -보다 크다 (부정) => False -> True
	}
}
