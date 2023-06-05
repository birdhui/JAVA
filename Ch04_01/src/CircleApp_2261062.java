// Ch04_01. 클래스의 객체 생성 및 활용 (지정 변환)
// Circle과 CircleApp 두 개의 클래스로 나누어 변환
// 반지름과 이름 필드, 원의 면적 값을 계산해주는 getArea() 메소드를 가진 Circle 클래스와
// 메인 메소드를 실행시킬 CircleApp 클래스로 나누었습니다.
// 예제 4-2를 참고해 반지름과 입력값을 사용자로부터 입력받을 수 있도록 변환해봤습니다.

import java.util.Scanner;
// Circle 클래스 정의
class Circle {
    int radius; // 원의 반지름을 저장하는 멤버 변수
    String name; // 원의 이름을 저장하는 멤버 변수

    // 원의 면적을 계산하는 멤버 메소드
    public double getArea() {
        return 3.14 * radius * radius; // 원의 면적 공식
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