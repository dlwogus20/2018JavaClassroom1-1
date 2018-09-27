package 종합실습과제;

import java.util.Scanner;

public class 문제20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char pn[]=a.toCharArray();
		int s=0;
		for(int i=0;i<=11;i++) {
			pn[i]-='0';
			s+=pn[i]*(2+i%8);
		}
		int t=s%11;
		System.out.println("주민등록번호 12자리:"+a);
		System.out.printf("13번째 수:"+(11-t)%10);
		

	}

}
