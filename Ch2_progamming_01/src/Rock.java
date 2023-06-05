import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 'c' + 1;
		System.out.println(c);
		
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		String chul = sc.next();
		System.out.print("영희 >> ");
		String young = sc.next();
		
		if(chul.equals("가위") && young.equals("보"))
			System.out.print("철수가 이겼습니다.");
		else if (chul.equals("보") && young.equals("가위"))
			System.out.print("영희가 이겼습니다.");
		else if (chul.equals("가위") && young.equals("바위"))
			System.out.print("영희가 이겼습니다.");
		else if (chul.equals("바위") && young.equals("가위"))
			System.out.print("철수가 이겼습니다.");
		else if (chul.equals("바위") && young.equals("보"))
			System.out.print("영희가 이겼습니다.");
		else if (chul.equals("보") && young.equals("바위"))
			System.out.print("철수가 이겼습니다.");
		
		sc.close();
	}
}
