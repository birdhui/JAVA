// Ch04_09. 가비지의 발생 (자율 변환)
// Stringnull : 가비지 컬렉션을 명시적으로 요청하는 메소드인 System.gc()를 호출해 가비지 컬렉션을 명시적으로 요청하게 됩니다.
// StringTrue : 두 개의 문자열을 비교해 문자열이 같은지의 여부를 확인하는 메소드입니다. 
// 문자열을 비교하는 equals() 메소드를 이용해 문자열 비교 결과를 isEqual에 저장하게 됩니다.
// 그 후 메인메소드에서 객체를 생성 후 문자열을 저장하고 메소드를 호출해 출력하게 됩니다.

public class GarbageEx_2261062 {
	static void Stringnull(String s) {
		System.gc();		// System.gc() : 가비지 컬렉션을 명시적으로 요청하는 메소드
		if(s == null)
			System.out.println("가비지 컬렉션입니다.");
		else
			System.out.println("가비지 컬렉션이 아닙니다.");
	}
	
	static void StringTrue(String s, String str) {
		boolean isEqual = s.equals(str);	// 문자열을 비교하기 위해 equals() 메소드를 이용해 두 문자열 비교
		if(isEqual)							// isEqual이 true라면
			System.out.println("문자열이 같습니다.");
		else
			System.out.println("문자열이 같지 않습니다.");
	}
	
	public static void main(String[] args) {
		String a = new String("Good");		// String 객체의 a에 문자열 저장
		String b = new String("Bad");		// String 객체의 b에 문자열 저장
		String c = new String("Normal");	// String 객체의 c에 문자열 저장
		String d;			// 참조 변수 d 선언
		String e = null;	// 참조 변수 e 선언 후 null로 초기화
		String f = new String("Bad");		// String 객체의 c에 문자열 저장
		
		a = null;	// a 참조 변수에 null을 저장 후 참조를 해제함
		d = c;		// 참조 d에 c 참조값을 저장
		c = null;	// c 참조 변수에 null을 저장 후 참조를 해제함
		
		Stringnull(a);		// Stringnull 메소드 호출 후 가비지 컬렉션 여부 출력
		Stringnull(c);
		Stringnull(d);
		Stringnull(e);
		StringTrue(b, f);	// StringTrue 메소드를 호출 후 문자열 비교 결과 출력
	}
}
