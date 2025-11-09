import java.util.Scanner;

public class ClassWork{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		int count = 0,count1 = 0 ,count2 = 0;
		System.out.println("Enter 0 to terminate the loop");
		while(true){
			
			System.out.print("Enter number: ");
			num = input.nextInt();
			
			sum += num;
			if(num == -1){
				break;
			}
			
			else if (num < -1){
				count1++;
			}
			
			else if (num > 0){
				count2++;
			}
			
			else {
				count++;
			}	
		}
		System.out.printf("The total number is %d%n",count1,count2,count);
		
	}
}