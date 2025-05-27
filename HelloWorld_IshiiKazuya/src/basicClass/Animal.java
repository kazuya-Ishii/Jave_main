package basicClass;
//1.19課題
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
    public static void main(String[] args) {
        // Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog dog1 = new Dog();
        System.out.println("動物の名前: " + dog1.name);

        // Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        Dog dog2 = new Dog(3);
        System.out.println("動物の数: " + dog2.number);

        // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        //現在の日時を取得。
        LocalDateTime now = LocalDateTime.now();
       //指定の形式 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); 
        //fomat()で整えた日時をformattedDateに代入
        String formattedDate = now.format(formatter);
       // 日付/時間オブジェクトの出力
        System.out.println("現在の日時: " + formattedDate);
    }
}
