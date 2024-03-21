package A3;
import java.util.Scanner;
// 사다리꼴의 넓이
public class Run08 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("사다리꼴의 넓이를 계산합니다.");
        System.out.print("윗변의 길이를 입력하세요: ");
        double top = key.nextDouble();

        System.out.print("밑변의 길이를 입력하세요: ");
        double bottom = key.nextDouble();

        System.out.print("높이를 입력하세요: ");
        double height = key.nextDouble();

        double area = calculateTrapezoidArea(top, bottom, height);
        System.out.println("사다리꼴의 넓이는 " + area + "입니다.");

    }

    public static double calculateTrapezoidArea(double top, double bottom, double height) {
        return 0.5 * (top + bottom) * height;
    }
}
