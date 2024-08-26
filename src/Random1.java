import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		
		int randomNumber = 0;
		
		for(int i = 0; i < 10; i++) {
			randomNumber = randomGenerator.nextInt(3) + 1;
			System.out.println(randomNumber);
		}
		
		

	}

}
