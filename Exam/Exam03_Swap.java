
public class Exam03_Swap {
   public static void main(String[] args) {
	
//	   char[] arr = new char[] {'A', 'B'};
//	   System.out.println(arr[0] + " " + arr[1]);
//	   // A�� B�� ���� ������
//	   
//	   char temp; // <- �ӽ÷� �����ص� ���� �ϳ��� �ʿ���
//	   temp = arr[0];
//	   System.out.println(temp);
//	   arr[0] = arr[1];
//	   System.out.println(arr[0]);
//	   arr[1] = temp;
//	   System.out.println(arr[1]);
//	   System.out.println(arr[0] + " " + arr[1]);

	   // hello�� ��� char �迭 �����
	   char[] hello = {'h', 'e', 'l', 'l', 'o'};
	   //-> ����� olleh �� ��⵵�� ���� ������.
	   
	   char tmp;
	   for(int i = 0; i <hello.length/2; i++) { // hello.length = �迭�� ���̰� 
		   tmp = hello[i];
		   hello[i] = hello[hello.length-1-i]; 
		   // -i�ϴ� ���� hello.length-1�� 4��� �������̱⶧���� -i �� �Ⱥ����� �翷�� �ٲ�°� �ݺ��� �ȵ�
		   hello[hello.length-1-i] = tmp;
		   
	   }
	   System.out.print("hello ������ : ");
	   for(char i : hello) {
		   System.out.print(i + " ");
	   }
	   
}
}
