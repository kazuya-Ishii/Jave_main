
package curriculum_B;

public class Qes5 {
    public static void main(String[] args) {
    	//外側のループ：1 から 9 までの段（掛ける数）を繰り返します。
        for (int i = 1; i <= 9; i++) {
        	//掛けられる数を 1 から 19 まで繰り返します
            for (int j = 1; j <= 19; j++) {
            	//％ｄは整数を出力し０は桁数が足りない１桁のみの場合0を入れる2の部分は２桁にそろえるため％02dは02と表記する。
                System.out.printf("%02d * %02d = %03d", i, j, i * j);
                //1行の最後の要素（j == 19）以外には " || " を挿入　表示結果で最後には|| でない
                if (j != 19) {
                    System.out.print(" || ");
                }
            //区切り文字として " || " を出力
            System.out.println();
        }
    }
    }
    }
