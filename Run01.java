package A3;
import java.util.ArrayList;

public class Run01 {
    public static void main(String[] args) {
        // ���ڿ��� ������ �迭����Ʈ ����
        ArrayList<String> arrayList = new ArrayList<>();

        // �迭����Ʈ�� �� �߰�
        arrayList.add("���");
        arrayList.add("�ٳ���");
        arrayList.add("����");

        // �迭����Ʈ�� ũ�� ���
        System.out.println("ArrayList�� ũ��: " + arrayList.size());

        // �迭����Ʈ�� ��� ��� ���
        System.out.println("ArrayList�� ��ҵ�:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }// ���� �޼��� �߰��ϱ�
    }
}
