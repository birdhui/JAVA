// Ch03_01. for문을 이용해 1~10까지 더한 수식과 값을 출력하는 예제

public class ForSample_2261062 {
	public static void main(String[] args) {
		int i, sum = 0;
		
		for(i=1; i<=10; i++) {			// i가 1부터 10이 될 때까지
			sum += i;					// sum에 i값을 더한다.
			System.out.print(i);		// i값을 출력
			
			if(i<=9)					// i가 9보다 작거나 같다면
				System.out.print(" + ");	// '+' 덧셈 연산자 출력
			else {						// 아니라면
				System.out.print(" = ");	// '=' 같음 연산자 출력
				System.out.print(sum);	// 1~10까지 더한 값 출력
			}
		}
	}
}
