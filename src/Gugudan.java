public class Gugudan {
	public static int[] caculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		for(int i=2; i < 10; i++) {
			int[] result = caculate(i);
			print(result);
		}
	}
}






// 반복문을 통한 2단부터 9단까지 한번에 출력하는 코
//		int[] result = new int[9];
//		for(int j = 2; j < 10; j++) {
//			for(int i = 0; i < result.length; i++) {
//					result[i] = j * (i+1);				
//					System.out.println(result[i]);
//			}
//		}
//	}