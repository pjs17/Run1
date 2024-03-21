package A3;
//피보나치 수열
import java.util.Scanner;

public class Run05 {
    public static void main(String[] args) {
    	
        Scanner key = new Scanner(System.in);
        System.out.println("피보나치 수열의 항 개수를 입력하세요: ");
        int N = key.nextInt();
        
        int[] fibonacci = new int[N];
        
        for (int i = 0; i < N; i++) {
            if (i < 2) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        
        System.out.println("피보나치 수열의 첫 " + N + "개의 항:");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        
    }
}

