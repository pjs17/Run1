package A3;

//추상 클래스 정의
abstract class Shape {
 abstract void draw(); // 추상 메서드
 void display() {
     System.out.println("도형을 그립니다.");
 }
}

//추상 클래스를 상속받아 구현하는 클래스
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("원을 그립니다.");
 }
}

class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("사각형을 그립니다.");
 }
}

//메인 클래스
public class Run04{
 public static void main(String[] args) {
     Shape circle = new Circle();
     circle.draw();    // 원을 그립니다.
     circle.display(); // 도형을 그립니다.

     Shape rectangle = new Rectangle();
     rectangle.draw();    // 사각형을 그립니다.
     rectangle.display(); // 도형을 그립니다.
 }
}

// 1. 키보드로 글자를 입력받아 자기 소개를하기
// 2. 배열 요소(방)를 5개 만들고 데이터 입력하고 출력하기

