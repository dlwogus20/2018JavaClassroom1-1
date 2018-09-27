package 제05차시;

public class Test2 {
	int a = 1, b = 2, c = 3; // 멤버변수
	int d = 5;

	{
		// 분석(1)
		int a = 4; // 지역변수
		System.out.println("a:" + a);
		// 분석(2)
		System.out.println("c:");
		for (int b = 1; b <= 5; b++) { // for 블록 지역변수
			int c = 5; // for 블록 지역변수
			System.out.print(c + " ");
			a = a + b;
		}
		System.out.println("a:" + a +", b:" + b);
		System.out.println("c:" + c); 
		// 분석(3)
		int b = 6;
		System.out.println("b:" + b);
		// 분석(4)
		if (c > 4) {
			int d = 7;
			System.out.println("d:" + d);

		}
		System.out.println("d:" + d);
		// 분석(5)
		method1(8);
		System.out.println("a:" + a + ",b:" + b + ",c:" + c);
	}

	void method1(int a) { // 지역변수
		int b = 9; // 지역변수
		System.out.println("a:" + a + ",b:" + b + ",c:" + c);
	}

}
