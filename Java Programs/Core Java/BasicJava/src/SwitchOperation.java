import java.util.Scanner;
public class SwitchOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("1:Add 2: Sub");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		int x, y,sum,sub;
		switch (choice) {
		case 1:System.out.println("Add Block");
		      System.out.println("Enter the value of x");
		      x = sc.nextInt();
		      System.out.println("Enter the value of y");
		      y = sc.nextInt();
		      sum = x+y;
		      System.out.println("Sum of two number is "+sum);
		      break;
		case 2:System.out.println("Sub Block");
	      		System.out.println("Enter the value of x");
	      		x = sc.nextInt();
	      		System.out.println("Enter the value of y");
	      		y = sc.nextInt();
	      		sub = x-y;
	      		System.out.println("Sub of two number is "+sub);	
	      		break;
		default:System.out.println("Wrong choice");
			break;
		}
		System.out.println("Thank you!");
		sc.close();
	}

}
