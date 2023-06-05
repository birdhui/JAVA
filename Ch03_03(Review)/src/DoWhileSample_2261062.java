// Ch03_03. do_while문을 이용해 한글 자음 원문자를 역순으로 출력하는 예제 (지정 변환)
// ㅎ 원문자 유니코드를 1씩 증감시키면서 ㄱ 원문자가 될 때까지 반복하는
// 조건을 만들어 역순으로 출력할 수 있도록 코드를 짜봤습니다.
// for문을 이용해 do-while보다 효율성이 좋은 코드도 만들어보았습니다.

public class DoWhileSample_2261062 {
	public static void main(String[] args) {
		
		// do-while을 이용해 한글 자음 원문자 출력
		System.out.println("[do-while문]");
		char k_consonants =  0x326D;				// ㅎ 원문자 유니코드
		do {
			System.out.print(k_consonants + " ");	// 원문자 출력
			k_consonants--;							// 유니코드에서 1씩 증감
		} while(k_consonants >= 0x3260);			// ㄱ 원문자 16진수 값이 될 때까지
		System.out.print("\n\n");
		

		// for문을 이용해 한글 자음 원문자를 역순으로 출력
		System.out.println("[for문]");
		for(char i=0x326D; i>=0x3260; i--) {		// ㅎ 원문자부터 ㄱ 원문자 값과 같을 때까지
			System.out.print(i + " ");
		}
	}
}
