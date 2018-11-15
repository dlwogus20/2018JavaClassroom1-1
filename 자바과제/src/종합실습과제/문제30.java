package 종합실습과제; 
  
 
  import java.util.*; 
  
 
  public class 문제30 { 
 
 
  	public static void main(String[] args) { 
  		Scanner sc = new Scanner(System.in); 
  		System.out.print("점수 10개: "); 
  		sc.useDelimiter("\r|\n"); 
  		int a[]=new int[10]; 
 		for(int i=0;i<10;i++) 
  			a[i] = sc.nextInt(); 
  		int max=0; 
  		int min=101; 
  		for(int i=0;i<10;i++) 
 			if(max<a[i]) 
  				max=a[i];   		for(int i=0;i<10;i++) 
  			if(min>a[i]) 
  				min=a[i]; 
  		System.out.println("최고점: " + max); 
  		System.out.println("최하점: " + min); 
  		sc.close(); 
  	} 
 
 
  } 
