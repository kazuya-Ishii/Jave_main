package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
    	//入力用のスキャナー
        Scanner scanner = new Scanner(System.in);
        //在庫数をランダムにするためのクラス
        Random random = new Random();
        System.out.println("商品名を「、」区切りで入力してください：");
        String input = scanner.nextLine();
       //テレビ、パソコン、カメラで入力するとproducts 配列は ["テレビ", "パソコン", "カメラ"]
        String[] products = input.split("、");
       
        //入力された商品名を1つずつ取り出して処理
        for (String product : products) {
        	//各商品に対して 0〜11 の在庫数をランダムに設定します。
            int stock = random.nextInt(12); 
            //商品名の前後の空白を削除して正確に比較
            switch (product.trim()) {
                case "テレビ":
                case "ディスプレイ":
                	//11からランダムの数を引く
                    int remaining = 11 - stock;
                    System.out.println((product.equals("テレビ") ? "テレビ" : "ディスプレイ") + "の残り台数は" + remaining + "台です");
                    break;
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                	//指定された家電商品は、ランダムな在庫数（0～11）をそのまま表示します。
                    System.out.println(product + "の残り台数は" + stock + "台です");
                    break;
                default:
                	//リストに含まれていない商品 例：「カメラ」「掃除機」にはこのメッセージを表示
                    System.out.println("『 " + product + " 』は指定の商品ではありません");
                    break;
            }
        }

        scanner.close();
    }
}
