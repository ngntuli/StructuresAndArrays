import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int coffeCounter =  0;
		
		while(scanner.hasNextInt()) {
			int number =  scanner.nextInt();
			
			if (number < 2) {
				System.err.println("theIllegalArgument");
				System.exit(0);
			}
			
			if (number == 42) {
				System.out.println("Count of coffe-request - " + coffeCounter);
				break;
			}
			
			int sum = sumOfDigits(number);
			if (isPrime(sum)) {
				coffeCounter++;
			}
		}
		
	}
	
	private static int sumOfDigits(int number) {
		int res = 0;
		while(number != 0) {
			res = res + number % 10;
			number = number / 10;
		}
		return res;
	}
	
	private static boolean isPrime(int number) {
		int i = 2;
		while((i * i) <= number) {
			if(number % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}