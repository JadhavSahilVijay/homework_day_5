package homework_day_5;
import java.util.*;
public class q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int fact = 1;
		do {
			fact *= a;
			a--;
		}while(a>0);
		System.out.println("factorial is : "+fact);
	}

}
