
public class Exam02_Array {
    public static void main(String[] args) {
	
    	//�迭�� ���� /����
    	// crud  -> create read update delete
    	
    	int[] arr1 = {1, 2, 3, 4, 5};
    	System.out.println("arr1 ���� �� : " + arr1[0]);
    	arr1[0] = 10;
    	System.out.println("arr1 ���� �� : " + arr1[0]);
    	
    	//charArr�ȿ� ����ִ�  h e l l o �� '��' '��' '��' '��' '��' �� ����
    	char[] charArr = {'h', 'e', 'l', 'l', 'o'};
    	System.out.println("���� �� ");
    	for(char i : charArr) {
    		System.out.print(i + " ");
    	}
    	// �ε��� ��ȣ�� �̿��� ������ �ϳ��� �������ֱ�.
//    	charArr[0] = '��';
//    	charArr[1] = '��';
//    	charArr[2] = '��';
//    	charArr[3] = '��';
//    	charArr[4] = '��';
    	
    	char[] charArr2 = {'��','��', '��', '��', '��'};
    	for(int i = 0; i < charArr.length; i ++) {
    		charArr[i] = charArr2[i];
    	}
    	System.out.println("\n���� ��");
    	for(char i : charArr) {
    		System.out.print(i + " ");
    	}
    	
}
}
