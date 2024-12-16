package homework_day_5;

public class q19 {

	public static void main(String[] args) {
		int sumEven = 0,sumOdd = 0;
		for(int i = 0; i<=30; i++) {
			if(i%2==0) {
				sumEven += i;
			}else {
				sumOdd += i;
			}
		}
		System.out.println("sum of even no from 1 to 30 is : "+sumEven+" and sum of odd no is "+sumOdd);

	}

}
