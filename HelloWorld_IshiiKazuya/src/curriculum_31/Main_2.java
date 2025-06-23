package Curriculum_31;

public class Main_2 {
	public static void main(String[] args) {
        // インスタンス作成と出力
		 Person_2 person1 = new Person_2("鈴木太郎", 20, 1.7, 60);
        person1.print();

        Person_2 person2 = new  Person_2("山田花子", 22, 1.5, 40);
        person2.print();

        // 問題6：クラスメソッドで合計人数を表示
        Person_2.printCount();
    }
}