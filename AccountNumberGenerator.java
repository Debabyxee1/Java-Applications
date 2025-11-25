import java.util.Random;

public class AccountNumberGenerator{
public static String generateAccountNumber(){
	Random random = new Random();
	
	String number = "";
	
	for (int i=0; i<10; i++){
		int digit = random.nextInt(10);
		number+=digit;
	}
	return number;
}
	public static void main (String[] args){
		System.out.println(generateAccountNumber());
	}
}