import java.util.Scanner;

public class Quiz02_UserArray {
    public static void main(String[] args) {
	
    	// ����ڿ��� �Է¹��� ������ŭ int�� �迭�� ũ�⸦ �Ҵ�
    	// �׸��� 1���� ���������� ���� ����
    	
    	// NumberFormatException (����ó��)
    	Scanner sc = new Scanner(System.in);
    	
    	// try ~ catch : ����(����) ó��
    	int size = 0;
    	try {
    		// ������ �߻��� �� �ִ� ������ �ִ� �ڵ带 �� ���ʿ� �־���.
        	System.out.print("�迭�� ����� ������ �ּ��� >> ");
        	size = Integer.parseInt(sc.nextLine());	
        	System.out.println("size : " + size);
    		
    	}catch(NumberFormatException e) {
    		// NumberFormatException -> ���� ���� ���ܸ� ��� ��.
    		// ���� try �� ������ �ڵ忡�� ������ �߻��ߴٸ�
    		// �������ְ� ���� �ڵ峪 �۾��� �� ���ʿ��� ����
    		System.out.println("�Է��� ���� ���ڰ� �ƴմϴ�.");
    	}
    	
    	int[] arr = new int[size]; //
    	System.out.println("arr size : " + arr.length);
    	
    	try {
    	System.out.println( arr[10] ); 
    	}catch(Exception e) {
    		//Exception : ��� ������ ������ �� ��� ��
    		System.out.println("���� �ε��� ��ȣ�Դϴ�.");
    	}
    	// ����� 5 ��� �ߴµ� �������� �ʴ� ������ �̸��� �θ��� ��Ȳ -> ������
    	// ���� �޼����� ������� ó���ؾ� �ϴ���
    	
    	
//    	for(int i = 0; i < arr.length; i++ ) {
//    		arr[i] = i+1;
//    		System.out.print(arr[i] + " ");
//    	}
    	
    	
    	
}
}
