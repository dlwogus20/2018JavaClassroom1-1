package 종합실습과제;

import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.printf("프로 점수: %d\n",a);
		switch(a) {
		case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
			System.out.println("등급: A"); break;
		case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89: 
			System.out.println("등급: B"); break;
		case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
			System.out.println("등급: C"); break;
		case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69:
			System.out.println("등급: D"); break;
			default: System.out.println("등급: E");
		
		}
		
		

	}

}
