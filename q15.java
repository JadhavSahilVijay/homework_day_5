package homework_day_5;

public class q15 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		do {
			if(i%2!=0) {
				sum += i;
			}
			i++;
		}while(i<=10);
		System.out.println("Sum of odd no from 1 to 10 : "+sum);

	}

}
