package curriculum_B;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
    	// 	//入力用のスキャナー
        Scanner scanner = new Scanner(System.in);

        int numStudents;
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            //生徒の人数を入力させ、2人未満なら再入力させるループ。
            numStudents = scanner.nextInt();
            //do-while 文により、必ず1回は実行される
        } while (numStudents < 2);
        //各教科に対応する点数を生徒ごとに格納
        int[] englishScores = new int[numStudents];
        int[] mathScores = new int[numStudents];
        int[] scienceScores = new int[numStudents];
        int[] socialScores = new int[numStudents];

        //ループで各生徒（i人目）に対し、英語・数学・理科・社会の点数を順に入力させて格納。
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "人目の『英語』の点数を入力してください :");
            englishScores[i] = scanner.nextInt();

            System.out.print((i + 1) + "人目の『数学』の点数を入力してください :");
            mathScores[i] = scanner.nextInt();

            System.out.print((i + 1) + "人目の『理科』の点数を入力してください :");
            scienceScores[i] = scanner.nextInt();

            System.out.print((i + 1) + "人目の『社会』の点数を入力してください :");
            socialScores[i] = scanner.nextInt();
        }

        double totalAverage = 0.0;
        for (int i = 0; i < numStudents; i++) {
        	//studentAverage は1人の4教科の平均点。
            double studentAverage = (englishScores[i] + mathScores[i] + scienceScores[i] + socialScores[i]) / 4.0;
            //totalAverage はあとで全体平均を求めるための合計。
            totalAverage += studentAverage;
            System.out.printf("%d人目の平均点は%.2f点です。%n", (i + 1), studentAverage);
        }

        double englishAverage = 0.0;
        double mathAverage = 0.0;
        double scienceAverage = 0.0;
        double socialAverage = 0.0;

        //各教科について、生徒全員の点数を加算。
        for (int i = 0; i < numStudents; i++) {
            englishAverage += englishScores[i];
            mathAverage += mathScores[i];
            scienceAverage += scienceScores[i];
            socialAverage += socialScores[i];
        }
        // それぞれの教科について平均を求め、表示
        englishAverage /= numStudents;
        mathAverage /= numStudents;
        scienceAverage /= numStudents;
        socialAverage /= numStudents;
       
        System.out.printf("英語の平均点は%.2f点です。%n", englishAverage);
        System.out.printf("数学の平均点は%.2f点です。%n", mathAverage);
        System.out.printf("理科の平均点は%.2f点です。%n", scienceAverage);
        System.out.printf("社会の平均点は%.2f点です。%n", socialAverage); 
        //生徒ごとの平均点の合計を人数で割ることで、全体の平均点を出力。
        System.out.printf("全体の平均点は%.2f点です。%n", totalAverage / numStudents);

        scanner.close();
    }
}