package 종합실습과제;

public class 문제23 {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for(int i=1;i<=1000;i++) {
			if(i%3==0 || i%5==0) {
				count++;
				sum+=i;
			}
		}
		System.out.println("갯수: "+count);
		System.out.println("합계: "+sum);

	}

}
