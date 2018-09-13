package 종합실습과제;
import java.util.Scanner;

public class 문제05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.printf("시간(초): %d\n", a);
		System.out.printf("%02d시간%d분%d초",a/3600,a/60%60,a%60);
		

	}

}
