
public class MethodOverLoading {

	public static void main(String[] args) {
		System.out.println("Rectangle of area is " + area(14.25d, 10.5d));
		
//		argsは2つで設定されているのに、1つしか渡していないとエラーになる。
//		JavaScriptと違って厳しい。なので1つしか渡さないMethodを作るしかない。
//		23行目を書くことによって以下実行可能。
		System.out.println("Square of area is " + area(5.0d));
		
//		doubleで設定したのにarea(5)が実行可能なのは、int < double だから。
		System.out.println("Square of area2 is " + area(5));
		
		printSomething("Yay", 15);
		
		
			 
			int num = 100;
			String str = "円";
			System.out.println(num + str);

	}

	public static double area(double length, double width) {
		return length * width;
	}
	
	public static double area(double side) {
		return side * side;
	}
	
	public static void printSomething(String s, int num) {
		System.out.printf("%s %d%n", s, num);
	}
	
}
