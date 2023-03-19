public class Program {
	public static void main(String[] args) {
		int num = 479598;
		int res = 0;
		
		res = res + num % 10;
		num = num / 10;
		res = res + num % 10;
		num = num / 10;
		res = res + num % 10;
		num = num / 10;
		res = res + num % 10;
		num = num / 10;
		res = res + num % 10;
		num = num / 10;
		res = res + num % 10;
		System.out.println(res);
	}
}