import java.util.Scanner;

public class Program {
	private static final int TESTS_PER_WEEK = 5;
	private static final int MIN_GRADE = 1;
	private static final int MAX_GRADE = 9;
	private static final int WEEKS = 18;
	private static final int EXIT = 42;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int week = 1;
		long analytics = 0;
		String line = scanner.nextLine();
		
		while(week < WEEKS && !line.equals("42")) {
			if (!line.equals("Week " + week)) {
				error();
			}
			analytics = analytics * 10;
			analytics = analytics + getMinGrade(scanner);
			line = scanner.nextLine();
			week++;
		}
		
		scanner.close();
		
		for(int i = 1; i < week; i++) {
			System.out.print("Week " + i + " ");
			drawGraph(getGrade(i, week, analytics));
		}
		
	}
	
	private static void drawGraph(int minGrade) {
		for(int i = 0; i < minGrade; i++) {
			System.out.print("=");
		}
		System.out.println(">");
		
	}
	
	private static int getGrade(int counter, int week, long analytics) {
		while(counter < week - 1) {
			analytics = analytics / 10;
			counter++;
		}
		
		return ((int)analytics % 10);
	}
	
	private static int getMinGrade(Scanner scanner) {
		int min = 9;
		int num = 0;
		int i = 0;
		while(i < TESTS_PER_WEEK) {
			num = scanner.nextInt();
			if(num < min) {
				min = num;
			} 
			i++;
		}
		scanner.nextLine();
		return min;
	}
	
	private static void error() {
		System.err.println("IllegalArgument");
		System.exit(-1);
	}
}