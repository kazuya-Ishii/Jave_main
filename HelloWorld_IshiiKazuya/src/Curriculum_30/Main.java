package Curriculum_30;

public class Main {
    public static void main(String[] args) {
        // 体重を57.8にしてBMIを20.0に調整
        Person p1 = new Person("鈴木太郎", 20, 1.7, 57.8);

        // 入力データの表示
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.height);

        // 自己紹介とBMI出力
        p1.print();
        Person.printCount();
    }
}