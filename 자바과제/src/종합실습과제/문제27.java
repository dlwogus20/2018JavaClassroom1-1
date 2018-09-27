package 종합실습과제;

public class 문제27 {

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			
			String s = Integer.toString(i);
			if (s.contains("3")) {
				System.out.printf("%d: 짝\n", i);
			} else if (s.contains("6")) {
				System.out.printf("%d: 짝\n", i);
			} else if (s.contains("9")) {
				System.out.printf("%d: 짝\n", i);
			}
			else System.out.println(i);

		}
	}
}
