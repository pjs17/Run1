package A3;
//�Ǻ���ġ ����
import java.util.Scanner;

public class Run05 {
    public static void main(String[] args) {
    	
        Scanner key = new Scanner(System.in);
        System.out.println("�Ǻ���ġ ������ �� ������ �Է��ϼ���: ");
        int N = key.nextInt();
        
        int[] fibonacci = new int[N];
        
        for (int i = 0; i < N; i++) {
            if (i < 2) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        
        System.out.println("�Ǻ���ġ ������ ù " + N + "���� ��:");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        
    }
}

