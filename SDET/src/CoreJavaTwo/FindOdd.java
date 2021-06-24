package CoreJavaTwo;
class FindOdd {
	   public static void main(String args[]) {
		int n = 187;
		System.out.print("Odd Numbers from 79 to "+n+" are: ");
		for (int i = 79; i <= n; i++) {
		   if (i % 2 != 0) {
			System.out.print(i + " ");
		   }
		}
	   }
	}
