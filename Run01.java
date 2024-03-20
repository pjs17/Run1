package A3;
import java.util.ArrayList;

public class Run01 {
    public static void main(String[] args) {
        // 문자열을 저장할 배열리스트 생성
        ArrayList<String> arrayList = new ArrayList<>();

        // 배열리스트에 값 추가
        arrayList.add("사과");
        arrayList.add("바나나");
        arrayList.add("딸기");

        // 배열리스트의 크기 출력
        System.out.println("ArrayList의 크기: " + arrayList.size());

        // 배열리스트의 모든 요소 출력
        System.out.println("ArrayList의 요소들:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }// 삭제 메서드 추가하기
    }
}
