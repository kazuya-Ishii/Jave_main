package curriculum_A;

		public class Qes1_13 {

			public static void main(String[] args) {
				
				// TODO 自動生成されたメソッド・スタブ
				 // 1. 変数の宣言
				byte byteVal;
		        short shortVal;
		        int intVal;
		        long longVal;
		        float floatVal;
		        double doubleVal;
		        char charVal;
		        String stringVal;
		        boolean booleanVal;
		    
		        // 2. 初期化
		        byteVal = 0;         // バイト型（初期値: 0）
		         shortVal = 0;       // 短整数型（初期値: 0）
		         intVal = 0;           // 整数型（初期値: 0）
		         longVal = 0L;        // 長整数型（初期値: 0L）
		         floatVal = 0.0f;    // 単精度浮動小数点数型（初期値: 0.0f）
		         doubleVal = 0.0;   // 倍精度浮動小数点数型（初期値: 0.0）
		         charVal = '\u0000';  // 文字型（初期値: 空文字 '\u0000'）
		         stringVal = "";    // 文字列型（初期値: 空文字列 ""）
		         booleanVal = false; // ブーリアン型（初期値: false）
		       
		         //3.初期値を代入した変数に問題の値を代入
		        byteVal = 10;
		        shortVal = 100;
		        intVal = 1000;
		        longVal = 10000L;
		        floatVal = 9.5f;
		        doubleVal = 10.5;
		        charVal = 'a';
		        stringVal = "ハロー";
		        booleanVal = true;
		       
		        // 4. コンソールに出力する
		        //整数の合計 11110
		        System.out.println((byteVal + shortVal + intVal + longVal) + "\t" + (byteVal + shortVal + intVal + longVal));
		        //整数の2倍 20
		        System.out.println((byteVal * 2) + "\t" + (byteVal * 2));
		        //文字型・文字列・真偽値の出力 aハロー　true aハロー　true
		        System.out.println(charVal + " " + stringVal + " " + booleanVal + "\t" + charVal + " " + stringVal + " " + booleanVal);
		        //すべての数字を足す 11130
		        // 整数を double にキャストして計算（小数保持）
		        double result = (double)byteVal + (double)shortVal + (double)intVal + (double)longVal + floatVal + doubleVal;
		        // タブ区切りで同じ結果を2回出力 11130.0　 小数点以下0桁で表示
		        System.out.printf("%.0f\t%.0f%n", result, result); 
		        //小数点以外の数字を掛ける　10000000000	10000000000
		        System.out.println((long) (byteVal * shortVal * intVal * longVal) + "\t" + (long) (byteVal * shortVal * intVal * longVal));
		        //10.5 を 100 で割る  0.105	0.105
		        System.out.println((doubleVal / 100) + "\t" + (doubleVal / 100));
		        //10 から 100 を引く  -90	-90
		        System.out.println((byteVal - shortVal) + "\t" + (byteVal - shortVal));
		        
		        // 5. 文字列連結の修正 Integer.parseInt(num) を使い、String 型の "20" を int 型の 20 に変換 ハローJAVA43
		        String num = "20";
		        int num1 = 23;
		        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
		        
		        // 6. 自己紹介
		        //文字列型（名前）
		        String name = "山田太郎";
		        //整数型（年齢）
		        int age = 18;
		        //小数を含む数値型（身長・体重）
		        double height = 170.5;
		        double weight = 62.2;
		        //文字列型
		        String favoriteFood = "寿司";
		        //文字列と変数を連結して出力
		        System.out.println("初めまして" + name + "です");
		        System.out.println("年齢は" + age + "歳です");
		        System.out.println("身長は" + height + "cmです");
		        System.out.println("体重は" + weight + "kgです");
		        System.out.println("好きな食べ物は" + favoriteFood + "です");
		      
		        // 7. BMI 計算
		        //BMI=体重÷身長
		        double bmi = weight / ((height / 100) * (height / 100));
		        //String.format("%.2f", bmi) を使って小数点2桁
		        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
		       
		        // 8. 再代入
		        //一度上記で宣言した変数に再代入して文字列と変数を出力
		        name = "鈴木一郎";
		        age = 24;
		        height = 168.5;
		        weight = 64.2;
		        favoriteFood = "オムライス";
		        bmi = weight / ((height / 100) * (height / 100));
		        System.out.println("初めまして" + name + "です");
		        System.out.println("年齢は" + age + "歳です");
		        System.out.println("身長は" + height + "cmです");
		        System.out.println("体重は" + weight + "kgです");
		        System.out.println("好きな食べ物は" + favoriteFood + "です");
		        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		        // 9. 自己代入
		        //値を2倍しBMIを再度計算した値を出力
		        age += age;
		        height += height;
		        weight += weight;
		        bmi = weight / ((height / 100) * (height / 100));
		        System.out.println("初めまして" + name + "です");
		        System.out.println("年齢は" + age + "歳です");
		        System.out.println("身長は" + height + "cmです");
		        System.out.println("体重は" + weight + "kgです");
		        System.out.println("好きな食べ物は" + favoriteFood + "です");
		        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
		        // 10. 年齢が25以上ならtrueを出力（if文を使わない）
		        System.out.println(age >= 25);
		        // 11. 文字列型に変換して連結
		        String ageStr = String.valueOf(age);
		        String heightStr = String.valueOf(height);
		        String weightStr = String.valueOf(weight);
		        System.out.println(ageStr + heightStr + weightStr);
		        // 12. 年齢・身長を整数型に変換
		        int ageInt = Integer.parseInt(ageStr);
		        int heightInt = (int) Double.parseDouble(heightStr);
		        System.out.println(ageInt);
		        System.out.println(heightInt);
		        // 13. 年齢が25もしくは身長が160以上ならtrueを出力（if文なし）
		        System.out.println((ageInt == 25) || (heightInt >= 160));
			}

		

}
