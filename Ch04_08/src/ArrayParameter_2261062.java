// Ch04_08. 매개변수가 String title 하나인 생성자를 추가하여 title="춘향전", author="작자미상"인 객체 생성자 가능하도록 하는 프로그램 (지정 변환)
// charAt() : 주어진 인덱스에 해당하는 문자를 반환하는 메소드 -> 문자열에서 특정 위치에 있는 문자를 가져올 때 사용
// printString : charAt() 메소드를 이용해 char c에 하나씩 문자열을 문자로 변환해 저장하고 저장할 때마다 줄바꿈없는 print로 출력하도록 만들었습니다.
// replaceSpace : if문으로 변환된 문자 c가 공백이라면 쉼표를 출력하고 공백이 아니라면 문자를 출력하도록 만들었습니다.

public class ArrayParameter_2261062 {
	static void printString(String s) {
		for(int i=0; i<s.length(); i++) {	// 문자열 s의 길이만큼 반복
			char c = s.charAt(i);	// 문자열이 저장된 s를 charAt() 메소드를 이용해 s의 모든 요소를 문자로 반환해 char c에 저장
			System.out.print(c);	// 문자열 c에 저장될 때마다 하나씩 출력
		}
		System.out.println();		// 줄바꿈
	}
	
	static void replaceSpace(String s) {
		for(int i=0; i<s.length(); i++) {	// 문자열 s의 길이만큼 반복
			char c = s.charAt(i);			// 문자열이 저장된 s를 charAt() 메소드를 이용해 s의 모든 요소를 문자로 반환해 char c에 저장
			if(c == ' ')					// 문자가 공백이라면
				System.out.print(",");		// "," 쉼표 출력
			else							// 문자가 공백이 아니라면
				System.out.print(c);		// 문자 출력
		}
		System.out.println();				// 줄바꿈
	}
	
	public static void main(String args[]) {
		String str = "This is a pencil.";	// 문자열을 str에 저장
		printString(str);					// printString 메소드 호출 후 문자열 출력
		replaceSpace(str);					// replaceSpace 메소드 호출 후 공백을 쉼표로 출력하는 문자열 출력 
	}
}
