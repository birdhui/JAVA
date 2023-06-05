// Ch02_10. 비트와 시프트 연산자를 사용한 예제

public class BitShiftOperator_2261062 {
	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		// 비트 연산
		System.out.println("[비트 연산 결과]");
		// printf("%04",...) 메소드 : 값을 4자리의 16진수로 출력하고 빈 곳에는 0을 삽입함
		System.out.printf("%04x\n", (short)a & b);		// 비트 AND
		System.out.printf("%04x\n", (short)a | b);		// 비트 OR	
		System.out.printf("%04x\n", (short)a ^ b);		// 비트 XOR	
		System.out.printf("%04x\n", (short)~a);			// 비트 NOT
		
		byte c = 20;		// 0x14
		byte d = -8;		// 0xf8
				
		// 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2);				// c를 2비트 왼쪽 시프트 (c에 4를 곱함)
		System.out.println(c >> 2);				// c를 2비트 오른쪽 시프트 (c를 4로 나눔)
		System.out.println(d >> 2);				// d를 2비트 오른쪽 시프트 (음수이므로 1 삽입)
		System.out.printf("%x\n", (d >>> 2));	// d를 2비트 오른쪽 시프트 (음수이어도 0 삽입)
	}
}
