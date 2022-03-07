
public class Exam03_Swap {
   public static void main(String[] args) {
	
//	   char[] arr = new char[] {'A', 'B'};
//	   System.out.println(arr[0] + " " + arr[1]);
//	   // A와 B의 순서 뒤집기
//	   
//	   char temp; // <- 임시로 저장해둘 공간 하나가 필요함
//	   temp = arr[0];
//	   System.out.println(temp);
//	   arr[0] = arr[1];
//	   System.out.println(arr[0]);
//	   arr[1] = temp;
//	   System.out.println(arr[1]);
//	   System.out.println(arr[0] + " " + arr[1]);

	   // hello가 담긴 char 배열 만들기
	   char[] hello = {'h', 'e', 'l', 'l', 'o'};
	   //-> 뒤집어서 olleh 가 담기도록 만들어서 보세요.
	   
	   char tmp;
	   for(int i = 0; i <hello.length/2; i++) { // hello.length = 배열의 길이값 
		   tmp = hello[i];
		   hello[i] = hello[hello.length-1-i]; 
		   // -i하는 이유 hello.length-1은 4라는 고정값이기때문에 -i 가 안붙으면 양옆이 바뀌는게 반복이 안됨
		   hello[hello.length-1-i] = tmp;
		   
	   }
	   System.out.print("hello 수정후 : ");
	   for(char i : hello) {
		   System.out.print(i + " ");
	   }
	   
}
}
