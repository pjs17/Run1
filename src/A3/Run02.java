package A3;
import java.util.LinkedList;

public class Run02 {
    public static void main(String[] args) {
        // ���ڿ��� ������ ���Ḯ��Ʈ ����
        LinkedList<String> linkedList = new LinkedList<>();

        // ���Ḯ��Ʈ�� �� �߰�
        linkedList.add("���");
        linkedList.add("�ٳ���");
        linkedList.add("����");

        // ���Ḯ��Ʈ�� ũ�� ���
        System.out.println("LinkedList�� ũ��: " + linkedList.size());

        // ���Ḯ��Ʈ�� ��� ��� ���
        System.out.println("LinkedList�� ��ҵ�:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        } 
        //���� : remove �߰�
    }
}
