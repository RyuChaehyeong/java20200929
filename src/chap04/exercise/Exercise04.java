package chap04.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int sum = 0;

		while (true) {
			
			a = (int)(Math.random()*6)+1;
			b = (int)(Math.random()*6)+1;
			sum = a+b;
			System.out.println("("+a+","+b+")");
			
			if(sum == 5) {
				break;
			} 
			
			
			
		}
		
	}
}
