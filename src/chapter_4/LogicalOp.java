package chapter_4;

public class LogicalOp {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		// 변수 num1에 저장된 값이 1과 100사이 수인가?
		result = (1 < num1) && (num1 < 100);
		System.out.println("1초과 100미만인가? " + result);
		
		result = ((num2 % 2) == 0 || ((num2 % 3) == 0));
		System.out.println("2또는 3의 배수인가? " + result);
		
		//변수 num1이 0인가?
		result = !(num1 != 0);
		System.out.println("0 인가? " + result);
	}

}
