package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1 文字列と数値を連結して表示 printmessageからメッソド呼び出し
	public static void printMessage(String text, int number) {
		System.out.println("Hello " + text + " " + number);
	}

	// Q2　mutiplyからメソッド呼び出して　3 × 4 の結果を出力　
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	// Q3　メッソドに格納されている配列 {1,2,3,4,5} を1行ずつ出力。
	public static void printArray(int[] array) {
		for (int value : array) {
			System.out.println(value);
		}
	}

	// Q4　3.5 + 2.5 を計算して出力。　double は 小数を扱うためのデータ型 
	public static void add(double a, double b) {
		System.out.println(a + b);
	}

	// Q5　1〜100のランダムな整数5つを生成して出力。　
	public static int[] generateRandomNumbers(int count) {
		 // ランダムな数を生成するための Random オブジェクトを作成
		Random rand = new Random();
		
		int[] numbers = new int[count];
		
		for (int i = 0; i < count; i++) {
			int num;
			do {
				num = rand.nextInt(100) + 1; // 1〜100の乱数生成
			} while (num == 0);
			numbers[i] = num;
			System.out.println(num);// 生成した数を表示
		}
		return numbers;// 数値の配列を返す
	}

	// Q6　そのランダムな5つの整数の平均を出力
	public static double calculateAverage(int[] numbers) {
		//合計値を保持する変数。初期値は 0。
		double sum = 0;
		//配列 numbers の各要素を1つずつ取り出して、num に代入します。
		for (int num : numbers) {
			//各要素の値を sum に加算。
			sum += num;
		}
		//合計 sum を、要素数 numbers.length で割って平均値を求めます。
		double average = sum / numbers.length;
		//System.out.println(average);
		System.out.println(average);
		//求めた平均値をメソッドの呼び出し元に返す
		return average;
	}

	// Q7 平均が50点以上かどうかで true または false を表示・返却します。
	public static boolean isAbove50(double average) {
		//平均が50以上かを判定し、結果を表示・返却
		boolean result = average >= 50;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// Q1
		printMessage("JavaSE", 11);

		// Q2
		multiply(3, 4);

		// Q3
		int[] sampleArray = {1, 2, 3, 4, 5};
		printArray(sampleArray);

		// Q4
		add(3.5, 2.5);

		// Q5　	指定した回数分　generateRandonNumber(回数) ランダムな1〜100の整数を生成し、それらを配列に格納して返す。
		int[] randomNumbers = generateRandomNumbers(5);

		// Q6
		double avg = calculateAverage(randomNumbers);

		// Q7　 平均が50以上かの判定
		isAbove50(avg);
	}
}