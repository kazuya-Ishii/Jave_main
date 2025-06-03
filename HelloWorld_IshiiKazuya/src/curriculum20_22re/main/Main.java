package curriculum20_22re.main;

import curriculum20_22re.logic.MessageLogic;

public class Main {
    public static void main(String[] args) {
        MessageLogic logic = new MessageLogic();  // インスタンス生成
        logic.printMessages();                   // メッセージ表示
    }
}