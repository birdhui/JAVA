// Ch04_05. this()로 다른 생성자 호출

public class Book_2261062 {
	String title;	// 책의 제목을 저장하는 멤버 변수
	String author;	// 책을 쓴 작가를 저장하는 멤버 변수
	// 책의 제목과 작가를 출력하는 메소드
	void show() { System.out.println(title + "" + author); }
	
	public Book_2261062() {
		this("", "");	// 제목과 작가 모두 공백이라면 다른 생성자 호출
		System.out.println("생성자 호출됨");
	}
	
	public Book_2261062(String title) {
		this(title, "작자미상");	// 현재 클래스의 다른 생성자(세 번째 생성자)를 호출해 인자로 받은 title과 "작자미상"을 전달
	}
	
	// 제목과 작가를 매개 변수로 가지는 생성자
	public Book_2261062(String title, String author) {
		this.title = title;	// 입력받은 제목을 title 멤버 변수에 저장
		this.author = author;	// 입력받은 작가를 author 멤버 변수에 저장
	}
	
	public static void main(String[] args) {
		Book_2261062 javaBook = new Book_2261062("어린왕자", "생떽쥐페리");	// 제목과 작가 모두 인자로 받아 객체 생성 후 세 번째 생성자 호출
		Book_2261062 bible = new Book_2261062("춘향전");	// 제목만 인자로 받아 객체 생성 후 두 번째 생성자 호출
		Book_2261062 emptyBook = new Book_2261062();	// 매개 변수 없이 객체 생성 후 첫 번째 생성자 호출
		bible.show();
	}
}
