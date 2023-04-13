import java.util.Scanner;
public class AtmInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("WELOCME TO STATE BANK OF INDIA ATM MACHINE ");
		int balance=5000,withdraw,deposit;
		Scanner in=new Scanner(System.in);
		
		
		while(true) {
			System.out.println("CHOOSE 1 FOR WITHDRAW ");
			System.out.println("CHOOSE 2 FOR DEPOSIT ");
			System.out.println("CHOOSE 3 FOR TRANSER MONEY ");
			System.out.println("CHOOSE 4 FOR CHECK BALANCE ");
			System.out.println("CHOOSE 5 FOR EXIT ");
		
		
			int n=in.nextInt();
			switch(n) {
			case 1:
				System.out.println("ENTER MONEY TO BE WITHDRAW : ");
				withdraw=in.nextInt();
				if(balance>=withdraw) {
					balance = balance-withdraw;
					System.out.println("PLEASE COLLECT YOUR MONEY");
				}
				
				else {
					System.out.println("INSUFFICIENT BALANACE");

				}
				System.out.println("");
				break;
				
			case 2:
				System.out.println("ENTER MONEY TO BE DEPOSITED :");
				deposit=in.nextInt();
				balance=balance+deposit;
				System.out.println("YOUR MONEY HAS BEEN SUCCESSFULLY DEPOSITED ");
				System.out.println("");
              break;
              
			case 3:
				System.out.println("ENTER THE ACCOUNT NUMBER TO TRANSFER MONEY ");
			    long ac=in.nextLong();
				System.out.println("YOU ENTERED"+ac);
				System.out.println("PLEASE ENTER THE MONEY ");
				int money=in.nextInt();
				System.out.println("YOU ENTERD "+money);
				balance=balance-money;
				System.out.println("YOUR MONEY HAS BEEN SUCCESSFULLY TRANSFER IN "+ac);
				System.out.println("");
              break;
              
			case 4:
				System.out.println("BALANCE : "+balance);
				System.out.println("");
              break;
              
			case 5:
				System.exit(0);


			    

			}
			
		
			
		}
		 
		

	}

}
