package A3;
import java.util.Scanner;
// ��ٸ����� ����
public class Run08 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("��ٸ����� ���̸� ����մϴ�.");
        System.out.print("������ ���̸� �Է��ϼ���: ");
        double top = key.nextDouble();

        System.out.print("�غ��� ���̸� �Է��ϼ���: ");
        double bottom = key.nextDouble();

        System.out.print("���̸� �Է��ϼ���: ");
        double height = key.nextDouble();

        double area = calculateTrapezoidArea(top, bottom, height);
        System.out.println("��ٸ����� ���̴� " + area + "�Դϴ�.");

    }

    public static double calculateTrapezoidArea(double top, double bottom, double height) {
        return 0.5 * (top + bottom) * height;
    }
}
