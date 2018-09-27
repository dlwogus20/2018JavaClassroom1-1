package 종합실습과제;

import java.util.Scanner;
public class 문제17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int i;
		System.out.printf("두 정수: %d %d\n",m,n);
		for(i=n;i>=m;i--)
			System.out.printf("%d ",i);

	}

}
