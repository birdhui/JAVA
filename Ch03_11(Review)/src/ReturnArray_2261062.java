// Ch03_11. 일차원 정수 배열을 생성해 리턴하는 makeArray()를 작성하고, 이 메소드로부터 배열을 전달받는 프로그램

public class ReturnArray_2261062 {
	static int[] makeArray() {					// 리턴 타입에 배열의 크기를 지정하지 않는다.
		int temp[] = new int[4];				// 리턴 받는 배열 선언
		
		for(int i=0; i<temp.length; i++)
			temp[i] = i;						// 배열 초기화 0~3
		return temp;							// 배열 리턴
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();					// 메소드가 리턴한 배열 참조 -> temp 치환
		
		for(int i=0; i<intArray.length; i++)	
			System.out.print(intArray[i] + " ");// intArray 인덱스 값 출력
	}
}