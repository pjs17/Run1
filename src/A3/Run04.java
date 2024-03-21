package A3;

//�߻� Ŭ���� ����
abstract class Shape {
 abstract void draw(); // �߻� �޼���
 void display() {
     System.out.println("������ �׸��ϴ�.");
 }
}

//�߻� Ŭ������ ��ӹ޾� �����ϴ� Ŭ����
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("���� �׸��ϴ�.");
 }
}

class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("�簢���� �׸��ϴ�.");
 }
}

//���� Ŭ����
public class Run04{
 public static void main(String[] args) {
     Shape circle = new Circle();
     circle.draw();    // ���� �׸��ϴ�.
     circle.display(); // ������ �׸��ϴ�.

     Shape rectangle = new Rectangle();
     rectangle.draw();    // �簢���� �׸��ϴ�.
     rectangle.display(); // ������ �׸��ϴ�.
 }
}

// 1. Ű����� ���ڸ� �Է¹޾� �ڱ� �Ұ����ϱ�
// 2. �迭 ���(��)�� 5�� ����� ������ �Է��ϰ� ����ϱ�

