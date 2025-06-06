package curriculum_25.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	//コンソール入力を受け取るためのScanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください：");
        //ユーザーに名前の入力を促し、入力をnameに格納
        String name = scanner.nextLine();
        //入力された名前でHeroクラスのインスタンスを作成
        curriculum_25.character.Hero hero = new curriculum_25.character.Hero(name);
        hero.displayStatus();
        //リソースを解放
        scanner.close(); 
    }
}