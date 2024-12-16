package homework_day_5;

public class q4 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=10) {
			if(i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("sum of 1 to 10 even no is : "+sum);

	}

}
