package homework_day_5;
import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int fact = 1;
		for(int i = a; i>0; i--) {
			fact *= i; 
		}
		System.out.println("factorial of "+a+" is "+fact);
	}

}
