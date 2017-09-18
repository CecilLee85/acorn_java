package java0918.ch1;

public class HelloStatic {
	static int stInt=777;
	int generalInt=123;
	int a=stInt+generalInt;
	

	public static void main(String[] args) {
		
		System.out.println(stInt);
		HelloStatic hs = new  HelloStatic();//hellowstatic을 메모리에 올려줘! 그렇게 해서 generalInt에 접근해줄랭..
		//System.out.println(generalInt);<- 메모리에 올라와있지 않기때문에(non static) 출력되지 않는다
		System.out.println(hs.stInt);
		System.out.println(hs.generalInt);
		System.out.println(hs.a);
		int newgeneral =hs.generalInt;
		newgeneral= 1235;
		
	
	System.out.println(newgeneral);
		


	}

}
