import java.util.Scanner;

public class Program {
	private static final int NEG_NUMS = 2;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i = 2;
		
		if(num < NEG_NUMS) {
			System.err.println("theIllegalArgument");
			scanner.close();
			System.exit(-1);
		}
		
		while((i * i) <= num) {
			if((num % i) == 0) {
				System.out.println("false " + (i - 1));
				scanner.close();
				System.exit(1);
			}
			
			i++;
		}
		System.out.println("true " + (i - 1));
		scanner.close();
	}
}