package 종합실습과제;

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("두 과목 점수: %d %d\n",a,b);
		if((a+b)/2>=60 && (a>=40 && b>=40)) {
			System.out.printf("결과:합격\n");
		}
		
		else  {
			System.out.printf("결과:불합격(과락)");
		}
			

	}

}
