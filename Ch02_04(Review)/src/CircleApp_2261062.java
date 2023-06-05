import java.util.Scanner;

// Circle 클래스 정의
class Circle {
    int radius; // 반지름
    String name; // 이름

    // 원의 면적을 계산하는 메서드
    public double getArea() {
        return 3.14 * radius * radius; // 원의 면적 = π * 반지름 * 반지름
    }
}

public class CircleApp_2261062 {
    public static void main(String[] args) {
        Circle pizza = new Circle(); // Circle 객체 생성
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        System.out.print("pizza의 radius >> ");
        pizza.radius = sc.nextInt(); // 사용자로부터 반지름 입력 받기
        System.out.print("pizza의 name >> ");
        pizza.name = sc.next(); // 사용자로부터 이름 입력 받기
        System.out.println(pizza.name + "의 면적은 " + pizza.getArea() + "\n"); // 원의 면적 출력

        Circle donut = new Circle(); // Circle 객체 생성
        System.out.print("donut의 radius >> ");
        donut.radius = sc.nextInt(); // 사용자로부터 반지름 입력 받기
        System.out.print("donut의 name >> ");
        donut.name = sc.next(); // 사용자로부터 이름 입력 받기
        System.out.println(pizza.name + "의 면적은 " + donut.getArea()); // 원의 면적 출력

        sc.close(); // Scanner 객체 닫기
    }
}
