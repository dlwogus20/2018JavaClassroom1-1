package 종합실습과제;

import java.util.Scanner;
public class 문제39 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("자연수 n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
