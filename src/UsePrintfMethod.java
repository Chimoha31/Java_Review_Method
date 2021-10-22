
public class UsePrintfMethod {

	public static void main(String[] args) {
//		通常＋演算子使用し、以下の出力結果を100円とするのが基本だが、
//		printfを使うことでも表現できる。
		int num = 100;
		String str = "円";
		System.out.println(num + str);
		
//		printfメソッドは第1引数に出力したい書式を、第2引数以降に使用する変数を。
//		第2引数以降は可変長引数で、必要なだけ引数を指定することが出来る。
		
		int num2 = 1000;
		String str2 = "円";
		System.out.printf("%,6d%s", num2, str2);
//　　　 d＝10進数、s＝文字列、c＝文字
		
//		Stringと違うので""と’’を混同しないように
		char letter = 'd';
		System.out.printf("%n%c%n", letter);
		
//		文字初めから6桁指定
		String str3 = "Something";
		System.out.printf("%.6s\n", str3);
		
		System.out.printf("Yellow%nRed\nBlue");
	}
	
		

}
