
public class Exam04_Copy {
	public static void main(String[] args) {
		// �迭 ����
		// ���� ���� / ���� ����
		
        // ���� �ּҰ��� ������ ������ ����Ű�� �ȴٸ� ���� ����
		// �� ���� ������ ���� ���� �����ϸ� �ٸ� ���� ������ �ּҰ��� �����͵� �����ȴ�
		int[] arr = { 1, 2, 3 };
		System.out.println("arr �ּ� : " + arr);
		System.out.println("���� �� : " + arr[0]);
		
//		int[] arr2 = arr; // arr �������� �ȿ��� �ּҰ��� �������
//		//��������� arr2 �ȿ� arr�� �ּҰ��� ���Ե� �ּҰ��� �Ȱ��� ������ ����Ű�Ե�
//		arr2[0] = 10;
//		System.out.println("arr2 �ּ� : " + arr2);
//		System.out.println("���� �� : " + arr[0]); 
		
		// ���� ����
		// ���� �迭 �ȿ� ����ִ� ���� ���簡 �̷����� ��
		// ���� �����Ϳ� ������ ��ġ�� ����
		int[] arr3 = new int[3];
		for(int i = 0; i < 3; i++) {
			arr3[i] = arr[i]; 
		}
		arr3[0] = 10;
		System.out.println("arr3 �ּ� : " + arr3);
		System.out.println("���� �� : " + arr[0]);

	}
}
