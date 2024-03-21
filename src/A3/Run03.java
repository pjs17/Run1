package A3;
// 인터페이스 정의 - 인터페이스는 추상 메서드(몸체가 없는)의 모음이다.
interface Animal {
    void sound(); // 추상 메서드
    void move();  // 추상 메서드
    void move1();
}

// 인터페이스 구현
class Dog implements Animal {
    @Override	//재정의 표시
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("걷기");
    }
    public void move1() {
        System.out.println("뛰기");
    }
}

class Bird implements Animal {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void move() {
        System.out.println("날기");
    }
    public void move1() {
        System.out.println("숨쉬기");
    }
}

// 메인 클래스
public class Run03 {
    public static void main(String[] args) {
        Animal dog = new Dog();		//상향형변환
        dog.sound(); // 멍멍
        dog.move();  // 걷기
        dog.move1();

        Animal bird = new Bird();	//상향형변환
        bird.sound(); // 짹짹
        bird.move();  // 날기
    }
}
