package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println("0");
		System.out.println("1");
		
		for (int i = 1; i < 10; i++) {
			
			sum =  a + b ;
			a = b;
			b = sum;
	
			System.out.println(sum);
			
		}
	}

}
