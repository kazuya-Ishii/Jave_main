package curriculum_B;

public class Qes4 {
    public static void main(String[] args) {
    	//今回は九九の結果を繰り返し表記するので2重にしiは掛ける数jは掛けれる数
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
            	//％ｄは整数を出力し０は桁数が足りない１桁のみの場合0を入れる2の部分は２桁にそろえるため％02dは02と表記する。
                System.out.printf("%02d * %02d = %02d", i, j, i * j);
                //1行の最後の要素（j == 9）以外には " || " を挿入　表示結果で最後には|| でない
                if (j != 9) {
                    System.out.print(" || ");
                }
            }
           // 各 i のループが終わるたびに改行して、次の掛け算の行へ移る。
            System.out.println();
        }
    }
}