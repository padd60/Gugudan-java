import java.util.Scanner;

public class Gugudan2Main {
	public static void main(String[] args) {
		System.out.println("원하는 구구단은 ? : ");
		Scanner scanner =new Scanner(System.in);
		int number = scanner.nextInt();		
		int[] result = new int[number];
		for(int i = 2; i <= number; i++) {
			for(int j = 0; j < result.length; j++) {
				result[j] = i * (j+1);
				System.out.println(result[j]);
			}
		}
		scanner.close();
	}
}