package A3;
import java.util.LinkedList;

public class Run02 {
    public static void main(String[] args) {
        // 문자열을 저장할 연결리스트 생성
        LinkedList<String> linkedList = new LinkedList<>();

        // 연결리스트에 값 추가
        linkedList.add("사과");
        linkedList.add("바나나");
        linkedList.add("딸기");

        // 연결리스트의 크기 출력
        System.out.println("LinkedList의 크기: " + linkedList.size());

        // 연결리스트의 모든 요소 출력
        System.out.println("LinkedList의 요소들:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        } 
        //숙제 : remove 추가
    }
}
