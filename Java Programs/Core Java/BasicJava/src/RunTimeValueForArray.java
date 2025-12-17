import java.util.Scanner;
public class RunTimeValueForArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many element do you want to store");
		int n = sc.nextInt();
		// int num[]=new int[5]; int num[10] invalid in java 
		int num[]=new int[n];		// dynamic memory created.
		System.out.println("Enter the number one by one");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		// apply logic. 
		
		System.out.println("all array element are ");
		for(int i=0;i<num.length;i++) {
			System.out.print(" "+num[i]);
		}
		sc.close();
	}

}
