package 종합실습과제;

import java.util.Scanner;

public class 문제02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("두 정수:%d %d\n", a, b);
		System.out.printf("몫:%d\n", a / b);
		System.out.printf("나머지:%d", a % b);

	}

}
