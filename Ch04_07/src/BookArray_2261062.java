// Ch04_07. 매개변수가 String title 하나인 생성자를 추가하여 title="춘향전", author="작자미상"인 객체 생성자 가능하도록 하는 프로그램 (지정 변환)
// 자기 자신을 가리키는 this()레퍼런스를 이용해 제목만 입력받는 두 번째 생성자에서
// 첫 번째 생성자를 호출해 출력하도록 코드를 짜봤습니다.
// chun 배열 크기는 한 번만 입력받도록 하고 for문을 이용해 입력받은 제목을 배열에 저장 후
// 출력이 정상적으로 나오게 됩니다.

import java.util.Scanner;

class Book {
	String title, author;	// 제목과 작가를 저장하는 멤버 변수
	
	// 제목과 작가를 입력받는 생성자
	public Book(String title, String author) {
		this.title = title;	// title을 매개 변수 title에 저장
		this.author = author;	// author를 매개 변수 author에 저장
	}
	
	public Book(String title) {
		this(title, "작자미상");
	}
}

public class BookArray_2261062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book [] book = new Book[2];
		
		for(int i=0; i<book.length; i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();	// 책의 제목을 문자열로 입력받은 후 title에 저장
			
			System.out.print("저자 >> ");
			String author = sc.nextLine();	// 책의 작가를 문자열로 입력받은 후 author에 저장
			
			book[i] = new Book(title, author);	// 배열 book[i]에 사용자로부터 입력받은 제목과 작가를 Book객체 생성 후 저장
		}
		
		for (int i=0; i<book.length; i++)	// 0부터 책의 길이만큼
			System.out.println("("+ book[i].title + ", " + book[i].author + ")");	// Book에 저장된 제목과 작가 출력
		
		Book [] chun = new Book[1];	// 사용자로부터 제목만 입력받는 생성자 호출
		for(int i=0; i<chun.length; i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();	// 책의 제목을 문자열로 입력받은 후 title에 저장
			
			chun[i] = new Book(title);	// 제목만 입력받는 두 번째 생성자 호출
		}
		
		for (int i=0; i<chun.length; i++)	// 0부터 책의 길이만큼
			System.out.println("("+ chun[i].title + ", " + chun[i].author + ")");	// chun 배열에 저장된 제목과 작가 출력

		
		sc.close();
	}
}
