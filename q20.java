package homework_day_5;
import java.util.*;
public class q20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n!=0) {
			sum += n % 10;
			n/=10;
		}
		System.out.println("sum of digit is : "+sum);
	}
}
