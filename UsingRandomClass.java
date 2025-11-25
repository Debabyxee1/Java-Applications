import java.util.Random;

public class UsingRandomClass{
	public static void main (String[] args){
		Random random = new Random();
		
		int num1 = random.nextInt();
		int num2 = random.nextInt(10);
		double num3 = random.nextDouble();
		System.out.println("Random->"+Math.abs(num1));
		System.out.println("Random->"+Math.abs(num2));
		System.out.println("Random->"+Math.abs(num3));
	}
}