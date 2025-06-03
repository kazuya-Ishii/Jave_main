package curriculum20_22re.logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageLogic {
    // フィールド（変数）private によって、外部クラスから直接アクセスできない
    private String message1;
    private String message2;
    private String message3;
    private String dateTime;

    // コンストラクタ（thisを使用）
    public MessageLogic() {
        this.message1 = "こんにちは！ここは日本です！";
        this.message2 = "この寿司はうまい";
        this.message3 = "寿司は和食です";

        // 日時を取得（this使用）
        LocalDateTime now = LocalDateTime.now();
        //日時のフォーマットを指定
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //指定した形式で日時を文字列に変換
        this.dateTime = now.format(formatter);
    }

    // 出力メソッド
    public void printMessages() {
        System.out.println(this.message1);
        System.out.println(this.message2);
        System.out.println(this.message3);
        //this を使うことで、インスタンスのフィールドに明示的にアクセスしている。
        System.out.println("今の現在日時は" + this.dateTime + "です");
    }
}

