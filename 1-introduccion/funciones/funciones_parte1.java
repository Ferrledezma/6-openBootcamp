
public class CodeJava {
	public static void main(String[] args) {
		int num1  = 10, num2 = 20, num3 = 30;
		int result = suma(num1, num2, num3);
		System.out.printf("%d + %d + %d = %d", num1, num2, num3, result);
	}
	static int suma(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}