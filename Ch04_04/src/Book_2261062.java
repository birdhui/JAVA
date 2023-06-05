// Ch04_04. 세 개의 생성자를 가진 클래스(지정 변환)
// this() 레퍼런스를 이용해 현재 클래스의 다른 생성자를 호출하는 방식을 이용했습니다.
// this()를 이용하면 제목만 입력받는 생성자에서 "작자미상"으로 설정하지 않아도
// 첫 번째 생성자에서 두 번째 생성자를 호출해 사용할 수 있습니다.

public class Book_2261062 {
	String title;
	String author;
	
	// 제목만 입력받는 생성자
	public Book_2261062(String title) {	// title을 매개변수로 입력받고 작가는 "작자미상"으로 하는 두 번째 생성자를 호출
		this.title = title;
		this.author = "작자미상";
	}
	
	// 제목과 작가를 입력받는 생성자
	public Book_2261062(String title, String author) {
		this.title = title;	// title을 객체 title 필드에 저장
		this.author = author;	// author를 객체 author 필드에 저장
	}
	
	public static void main(String[] args) {
		Book_2261062 littlePrince = new Book_2261062("어린왕자", "생떽쥐페리");	// 두 번째 생성자 호출
		Book_2261062 loveStory = new Book_2261062("춘향전");					// 첫 번째 생성자 호출
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
