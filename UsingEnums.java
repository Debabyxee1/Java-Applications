import java.util.Scanner;

public class UsingEnums{
	public enum AccountType{
		SAVINGS,CURRENT,FIXED_DEPOSIT
	}
	public static void main (String[] args){
		Scanner read = new Scanner(System.in);
		
		System.out.print("\nEnter Account Type (SAVINGS,CURRENT,FIXED DEPOSIT): ");
		String userChoice = read.nextLine().toUpperCase();
		
		AccountType selectedType = null;
		
		if(userChoice.equals("SAVINGS")){
			selectedType = AccountType.SAVINGS;
			System.out.println(selectedType);
		}
		else if(userChoice.equals("CURRENT")){
			selectedType = AccountType.CURRENT;
			System.out.println(selectedType);
		}
		else if(userChoice.equals("FIXED DEPOSIT")){
			selectedType = AccountType.FIXED_DEPOSIT;
			System.out.println(selectedType);
		}
		if(userChoice !=null){
			System.out.println("Selected Account Type ->" + selectedType);
		}
		else{
			System.out.println("Invalid Acount Type");
		}
	}
}