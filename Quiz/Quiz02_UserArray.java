import java.util.Scanner;

public class Quiz02_UserArray {
    public static void main(String[] args) {
	
    	// 사용자에게 입력받은 정수만큼 int형 배열의 크기를 할당
    	// 그리고 1부터 순차적으로 값을 저장
    	
    	// NumberFormatException (예외처리)
    	Scanner sc = new Scanner(System.in);
    	
    	// try ~ catch : 예외(에러) 처리
    	int size = 0;
    	try {
    		// 에러가 발생할 수 있는 소지가 있는 코드를 이 안쪽에 넣어줌.
        	System.out.print("배열의 사이즈를 지정해 주세요 >> ");
        	size = Integer.parseInt(sc.nextLine());	
        	System.out.println("size : " + size);
    		
    	}catch(NumberFormatException e) {
    		// NumberFormatException -> 숫자 형식 예외만 잡아 줌.
    		// 만약 try 문 안쪽의 코드에서 에러가 발생했다면
    		// 실행해주고 싶은 코드나 작업을 이 안쪽에서 해줌
    		System.out.println("입력한 값은 숫자가 아닙니다.");
    	}
    	
    	int[] arr = new int[size]; //
    	System.out.println("arr size : " + arr.length);
    	
    	try {
    	System.out.println( arr[10] ); 
    	}catch(Exception e) {
    		//Exception : 모든 에러를 포함해 다 잡아 줌
    		System.out.println("없는 인덱스 번호입니다.");
    	}
    	// 사이즈를 5 라고 했는데 존재하지 않는 공간의 이름을 부르는 상황 -> 에러남
    	// 에러 메세지를 어떤식으로 처리해야 하는지
    	
    	
//    	for(int i = 0; i < arr.length; i++ ) {
//    		arr[i] = i+1;
//    		System.out.print(arr[i] + " ");
//    	}
    	
    	
    	
}
}
