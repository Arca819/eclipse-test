
public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int a = i % 3; // 3 で割った余りを a に代入する。
			int b = i % 5; // 5 で割った余りを b に代入する。
			// if文
			if ((a == 0) && (b == 0)) { // i が 3 の倍数 かつ 5 の倍数のとき、
				System.out.println("FizzBuzz"); // "FizzBuzz"を表示する
			} else if ((a == 0) && (b != 0)) { // i が 3 の倍数 かつ 5 の倍数ではないとき、
				System.out.println("Fizz"); // "Fizz"を表示する
			} else if ((a != 0) && (b == 0)) { // i が 3 の倍数ではない かつ 5 の倍数のとき、
				System.out.println("Buzz"); // "Buzz"を表示する
			} else { // i が 3 の倍数 でも 5 の倍数でもないとき、
				System.out.println(i); // i を表示する
			}
		}
	}
}
