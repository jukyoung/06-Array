import java.util.Scanner;

public class Exam05_Delete {
	public static void main(String[] args) {
		// �迭 ���� (��¥ ������ �ƴ�)
		// �迭�� ó�� ���� �� ������ ���� (���� �߰��� ����� ���� �� ���� -> ��ȸ�ϴ� �۾�)

//		int[] arr = { 1, 2, 3 };
//		// int�� �ʱⰪ�� 0�� �̿��� �ǹ̾��� ������ ����� ������.
//		arr[1] = 0;
//		for (int i : arr) {
//			System.out.println(i);
//		}
//
//		String[] temp = { "abc", "������", "50" };
//		temp[0] = null; // string ���� �ʱⰪ�� " " �Ǵ� null
//		for (String s : temp) {
//			if (s != null) {
//				System.out.println(s);
//			}
//		}

		// int�� �迭 �ȿ��� ����ڰ� �Է��� ���� ����
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// ����ڰ� �Է��� ���� ����ִ� �ε����� 0���� �ٲٽÿ�.
		Scanner sc = new Scanner(System.in);

		int input = 0;
		try {
			System.out.print("1~10 ���� ������ �ϳ��� �Է��ϼ��� >> ");
			input = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
		System.out.println("����� �Է°� : " + input);

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == input) {
				intArr[i] = 0;
			}
			System.out.print(intArr[i] + " ");
		}

	}
}
