// Ch03_10. 2차원 배열에 학년별로 1,2학기 키를 저장하고, 4년 동안의 키 평균을 출력 (자율 변환)

public class ScoreAverage_2261062 {
	public static void main(String[] args) {
		int height[][] = { {150, 151},		// 1학년 1,2학기 키
						   {151, 153},		// 2학년 1,2학기 키
						   {156, 159},		// 3학년 1,2학기 키
						   {160, 162} };	// 4학년 1,2학기 키
		
		int sum = 0;
		
		for(int year=0; year<height.length; year++)				// 각 학년 별로 배열의 길이만큼 반복
			for(int term=0; term<height[year].length; term++)	// 각 학년의 학기 별로 반복
				sum += height[year][term];						// 전체 키 합
		
		int n = height.length;				// 배열의 행 개수, 4
		int m = height[0].length;			// 배열의 열 개수, 2
		
		System.out.println("4년 전체 키 평균은 " + sum/(n*m));
	}
}
