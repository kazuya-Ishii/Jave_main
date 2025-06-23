package Curriculum_31;

public class Person_2 {
	 // インスタンスフィールド
    public String name;
    public int age;
    public double height;
    public double weight;

    // 問題1：クラスフィールド（人数カウント）
    public static int count = 0;

    // コンストラクタ（問題2）
    public Person_2(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

        count++; // 人数をカウント
    }

    // BMI計算メソッド
    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    // 自己紹介メソッド
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.printf("BMIは%.2fです\n", this.bmi());
    }

    // 問題4〜5：クラスメソッド（人数表示）
    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}

