package A3;

import java.util.Scanner;

public class Run06 {
    public static void main(String[] args) {
        
    	Scanner key = new Scanner(System.in);
        System.out.println("팩토리얼을 계산할 숫자를 입력하세요: ");
        int N = key.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        
        System.out.println(N + "의 팩토리얼: " + factorial);
    }
}

