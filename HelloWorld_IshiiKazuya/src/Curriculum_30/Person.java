package Curriculum_30;

public class Person {
	// 問題1：インスタンスフィールド
    String name;
    int age;
    double height;
    double weight;
    // 問題10：人数カウント用 static フィールド
    static int count = 0;
// 問題2・3・4：コンストラクタ（name, age, height, weight を初期化）
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;//// 人数カウント
    }
// 問題6・7：BMIを返すメソッド
    public double bmi() {
        return this.weight / (this.height * this.height);
    }
// 問題8・9：自己紹介を出力
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "才です");
        System.out.printf("BMIは%.1fです\n", this.bmi());
    }
 // 問題10：人数出力
    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}