package Q1;

public class Program {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("AZ");
				
			} else if(i % 3 == 0) {
				System.out.println("A");
				
			} else if(i % 5 == 0) {
				System.out.println("Z");
				
			}else {
				System.out.println(i);
			}
		}

	}

}
