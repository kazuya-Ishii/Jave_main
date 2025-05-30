package curriculum_B;

public class Qes5 {
    public static void main(String[] args) {
        // 1〜9段まで繰り返し
        for (int i = 1; i <= 9; i++) {
            // 掛けられる数は1〜20
            for (int j = 1; j <= 20; j++) {
                // 出力フォーマット：2桁・3桁そろえる
                System.out.printf("%02d * %02d = %03d", j, i, j* i);
                
                // 最後の要素以外には区切りをつける
                if (j != 20) {
                    System.out.print(" || ");
                }
            }
            // 改行
            System.out.println();
        }
    }
}
