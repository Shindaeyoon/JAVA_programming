package chapter_4;

public class 문제1_1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		num1 = num2 = num3;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
	}

}

/*해설
 * '='은 진행방향이 오른쪽에서 왼쪽이므로 num2에 30이 들어가고 num1에 num2(30)이 들어오므로 각 변수 전부 30의 값을 가진다.
 */