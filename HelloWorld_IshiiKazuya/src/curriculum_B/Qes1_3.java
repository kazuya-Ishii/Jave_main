package curriculum_B;
//ランダムな数を生成するためのクラス文を使えるようにするためのインポート文
import java.util.Random;
import java.util.Scanner;

public class Qes1_3{
    public static void main(String[] args) {
    	//入力を受け取るためのクラス。
        Scanner scanner = new Scanner(System.in);
       // ランダムな数を生成するための Random オブジェクトを作成
        Random random = new Random();
        System.out.println("半角英数字のみで名前を入力してください");
        //ユーザーに名前の入力し、入力された内容を name 変数に格納
        String name = scanner.nextLine();
        //10文字以内の半角英数字
        if (name.length() > 10 || !name.matches("[a-zA-Z0-9]+")) {
 //条件に当てはまる↑名前が入力された場合
//エラーメッセージを表示し、scanner を閉じて、return; で main メソッドを終了します。
            System.out.println("名前は10文字以内の半角英数字にしてください");
            scanner.close();
            return;
        }
        System.out.println("ユーザー名「" + name + "」を登録しました");
        //じゃんけん回数を数える変数count
        int count = 0;
        //数値 0, 1, 2 を日本語の手に変換するための配列
        String[] hands = {"グー", "チョキ", "パー"};

        while (true) {
            System.out.println("0: グー, 1: チョキ, 2: パー から選んでください");
            //数値を入力
            int playerHand = scanner.nextInt();
            //0～2以外はエラーメッセージ
            if (playerHand < 0 || playerHand > 2) {
                System.out.println("0か1か2で入力してください");
                //条件以外は再入力するために先頭に戻る
                continue;
            }
            //0～2 の乱数で相手の手をランダムに決定。
            int opponentHand = random.nextInt(3);
           // 数値を hands 配列で日本語に変換し、表示します。
            System.out.println(name + "の手は「" + hands[playerHand] + "」");
            System.out.println("相手の手は「" + hands[opponentHand] + "」");
           // 回数カウントのため一回増やす
            count++;
            //同じ数値なら引き分け。continueでループ
            if (playerHand == opponentHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
                continue;
            }
            //プレイヤーが勝った場合のメッセージ　 break でループ終了。
            if ((playerHand == 0 && opponentHand == 1) ||
                (playerHand == 1 && opponentHand == 2) ||
                (playerHand == 2 && opponentHand == 0)) {
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                break;
            } else {
            	//もしくはプレイヤーが負けた場合のメッセージ文
                System.out.println("俺の勝ち！");
                if (opponentHand == 0) {
                	//グーで負けた場合
                    System.out.println("負けは次につながるチャンスです！");
                    System.out.println("ネバーギブアップ！");
                } else if (opponentHand == 1) {
                	//チョキで負けた場合
                    System.out.println("たかがじゃんけん、そう思ってないですか？");
                    System.out.println("それやったら次も、俺が勝ちますよ");
                } else {
                	//パーで負けた場合
                    System.out.println("なんで負けたか、明日まで考えといてください。");
                    System.out.println("そしたら何かが見えてくるはずです");
                }
            }
        }
//勝つまでに試行した回数をメッセージで表記
        System.out.println("勝つまでにかかった合計回数は" + count + "回です");
//スキャナー閉じる,メモリ開放
        scanner.close();
    }
}
