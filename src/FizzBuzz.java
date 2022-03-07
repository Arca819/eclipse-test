
public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			// 3 で割った余りを a に代入
			int a = i % 3;
			// 5 で割った余りを b に代入
			int b = i % 5;
			// if文
			// i が 3 の倍数 かつ 5 の倍数のとき
			if ((a == 0) && (b == 0)) {
				// "FizzBuzz"を表示する
				System.out.println("FizzBuzz");
			// i が 3 の倍数 かつ 5 の倍数ではないとき
			} else if ((a == 0) && (b != 0)) {
				// "Fizz"を表示する
				System.out.println("Fizz");
			// i が 3 の倍数ではない かつ 5 の倍数のとき
			} else if ((a != 0) && (b == 0)) {
				// "Buzz"を表示する
				System.out.println("Buzz");
			// i が 3 の倍数 でも 5 の倍数でもないとき
			} else {
				// i を表示する
				System.out.println(i); 
			}
		}
	}
}
