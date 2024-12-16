package homework_day_5;
import java.util.*;
public class q22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 0;
		
		for(int i = n; i>0; i--) {
			fact *= i; 
		}
		System.out.println("factorial of : "+n+" is "+fact);
	}

}
