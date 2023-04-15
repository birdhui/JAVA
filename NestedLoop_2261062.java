// Ch03_04. 2중 중첩 for문을 이용하여 구구단을 출력하는 프로그램 (지정 변환)
// for문을 이용하여 세로 방향으로 구구단을 출력하기 위해서
// j*i의 조건을 이용했습니다.
// 단은 변하지만 곱해야 하는 값은 일정하기 때문입니다.
// 1~9까지 반복되는 단수 j에 i값을 곱하게 되면 세로 방향의 구구단이 출력됩니다. 

public class NestedLoop_2261062 {
	public static void main(String[] args) {
		
		// 몇 단인지 출력
		for(int i=1; i<10; i++) {
			System.out.print("[" + i + "단]\t");
		}
		System.out.println();
		
		for(int i=1; i<10; i++) {		// i가 1일 때
			for(int j=1; j<10; j++) {	// j는 1~9까지 반복
				System.out.print(j + "*" + i + "=" + j*i + "\t");	// 1~9까지 반복되는 단수 j와
			}														// j의 반복이 끝날 때까지 일정한 값인 i를 곱한 값 출력
			System.out.println();
		}
	}
}
