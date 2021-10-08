import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
			TacoBuilder machine = new RewardMachine();
		
			Scanner scanner = new Scanner( System.in );
			System.out.println("Enter 1 for Open Tacos Shop");
			System.out.println("Enter 2 for Ordering Tacos");
			System.out.println("Enter 3 for checking your progress Tacos");
			System.out.println("Enter 4 for checking your delivery status Tacos");
			System.out.println("Enter 5 for Closing Taco Shop");
			System.out.println("Enter 6 to check States");
			machine.build();
			
			
			int input = scanner.nextInt();
			if(input==1)
			{
				machine.operate(input);
			
			}
			else if(input ==2)
			{
				
				machine.operate(input);
			}else if(input ==3) {

		
				machine.operate(input);
			}
			else if(input ==4) {

				
				machine.operate(input);
			}
			else if(input ==5) {

				
				machine.operate(input);
			}
			
	else if(input ==6) {

			
				machine.operate(input);
			}
	
	}

}
