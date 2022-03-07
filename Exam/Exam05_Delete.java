import java.util.Scanner;

public class Exam05_Delete {
	public static void main(String[] args) {
		// 배열 삭제 (진짜 삭제는 아님)
		// 배열은 처음 만들 때 사이즈 고정 (내가 중간에 사이즈를 줄일 수 없다 -> 우회하는 작업)

//		int[] arr = { 1, 2, 3 };
//		// int의 초기값인 0을 이용해 의미없는 값으로 만들어 버리기.
//		arr[1] = 0;
//		for (int i : arr) {
//			System.out.println(i);
//		}
//
//		String[] temp = { "abc", "가나다", "50" };
//		temp[0] = null; // string 형의 초기값은 " " 또는 null
//		for (String s : temp) {
//			if (s != null) {
//				System.out.println(s);
//			}
//		}

		// int형 배열 안에서 사용자가 입력한 값만 삭제
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 사용자가 입력한 값이 들어있는 인덱스를 0으로 바꾸시오.
		Scanner sc = new Scanner(System.in);

		int input = 0;
		try {
			System.out.print("1~10 까지 숫자중 하나를 입력하세요 >> ");
			input = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}
		System.out.println("사용자 입력값 : " + input);

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == input) {
				intArr[i] = 0;
			}
			System.out.print(intArr[i] + " ");
		}

	}
}
