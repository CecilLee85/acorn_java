package java0918.ch1;

public class HelloReturn {

	public static void main(String[] args) {
		int a=123;
		int b=456;
		int c=plus2(a,b);
		System.out.println(c);		
		System.out.println(plus2(a,b));

	}

	private static int plus2(int a, int b) {
		int d= a+b;
		System.out.println("d�� ����"+d);
		return d;//���� ȣ���� ��ҷ� ����������. 
	}



}
