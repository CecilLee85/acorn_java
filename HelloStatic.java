package java0918.ch1;

public class HelloStatic {
	static int stInt=777;
	int generalInt=123;
	int a=stInt+generalInt;
	

	public static void main(String[] args) {
		
		System.out.println(stInt);
		HelloStatic hs = new  HelloStatic();//hellowstatic�� �޸𸮿� �÷���! �׷��� �ؼ� generalInt�� �������ٷ�..
		//System.out.println(generalInt);<- �޸𸮿� �ö������ �ʱ⶧����(non static) ��µ��� �ʴ´�
		System.out.println(hs.stInt);
		System.out.println(hs.generalInt);
		System.out.println(hs.a);
		int newgeneral =hs.generalInt;
		newgeneral= 1235;
		
	
	System.out.println(newgeneral);
		


	}

}
