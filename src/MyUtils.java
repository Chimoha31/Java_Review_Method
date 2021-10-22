
public class MyUtils {
	public static void printSomeJunk(String args) {
		System.out.println("This is " + args);
		
		int x = addSum(2, 4);
		System.out.println(x);
		
//		System.out.println(addSum(2, 4));
	}
	
//	returnしたいところにはvoidを付けない。
//  voidがあるところでreturnは出来ない。
	private static int addSum(int x, int y) {
		return x + y;
	}

}
