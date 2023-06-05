import java.util.Scanner;

public class programming_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("옵션 입력 >> ");
		int option = sc.nextInt();
		
		switch(option){
			case 1:
				System.out.println("옵션 1");
			case 2:
				System.out.println("옵션 2");
			case 3:
				System.out.println("옵션 3");
				break;
			default:
				System.out.println("해당 없음");
		}
		sc.close();
	}
}
