package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int amountBooks = 0;
		int selfFlag = 0;
		int booksPrice = 200;
		do {
			amountBooks++;
			System.out.println("売却する本の冊数を１つ増やしますか？\n"
					+ "はい：0、いいえ：1＞");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String num = reader.readLine();
			selfFlag = Integer.parseInt(num);

		} while (selfFlag == 0);
		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + (amountBooks * booksPrice) + "円です。");
	}

}
