
public class UnderrstandingMethod {

	public static void main(String[] args) {
		System.out.println("somethingsomething");
		
//		printSomeJunk();	
//		通常は、classを分けるのでclass名.methodが基本
		UnderrstandingMethod.printSomeJunk("test");
		
		int x = addSum(5, 5);
		System.out.println(x);
	}
	
	public static void printSomeJunk(String args) {
		System.out.println("This is " + args);
	}
	
	public static int addSum(int x, int y) {
		return x + y;
	}
}
