package ex02.dataType;

public class MainEntry {

	// 클래스 변수(클래스 멤버) ; 전역 변수
	static int NUM;		// 초기화값 0
	static String str;	// 초기화값 NULL
	
	public static void main(String[] args) {
		boolean b = true;
		int x = 30;
		int y = 500; // 지역변수는 초기화 필수
		int su = 99;
		
		System.out.println(x+", "+y+", "+su);
		System.out.println(str);
		System.out.println(NUM);
		System.out.println(y);
		System.out.println(x); // 4byte
		System.out.println(b); // 1bit
		
		System.out.println(1000);
		System.out.println(1000L);
		
		double dd = 12.34;
		System.out.println(dd);
		System.out.println(345.6789);

		float ff = 12.34f;
		System.out.println(ff);
		
		System.out.println(5.5f);
		
		short sh = 32767; // -32,768 ~ 32,767
	
		System.out.println(sh);
		
		sh++; // 오버플로우
		
		System.out.println(sh);
		
		int i = 32769;
		System.out.println(i);
		
		sh = (short) i; // 오버플로우
		System.out.println(sh);
	}

}
