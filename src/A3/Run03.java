package A3;
// �������̽� ���� - �������̽��� �߻� �޼���(��ü�� ����)�� �����̴�.
interface Animal {
    void sound(); // �߻� �޼���
    void move();  // �߻� �޼���
    void move1();
}

// �������̽� ����
class Dog implements Animal {
    @Override	//������ ǥ��
    public void sound() {
        System.out.println("�۸�");
    }

    @Override
    public void move() {
        System.out.println("�ȱ�");
    }
    public void move1() {
        System.out.println("�ٱ�");
    }
}

class Bird implements Animal {
    @Override
    public void sound() {
        System.out.println("±±");
    }

    @Override
    public void move() {
        System.out.println("����");
    }
    public void move1() {
        System.out.println("������");
    }
}

// ���� Ŭ����
public class Run03 {
    public static void main(String[] args) {
        Animal dog = new Dog();		//��������ȯ
        dog.sound(); // �۸�
        dog.move();  // �ȱ�
        dog.move1();

        Animal bird = new Bird();	//��������ȯ
        bird.sound(); // ±±
        bird.move();  // ����
    }
}
