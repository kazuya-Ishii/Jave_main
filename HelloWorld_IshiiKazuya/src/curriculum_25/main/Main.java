package curriculum_25.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("名前を入力してください：");
        String name = scanner.nextLine();
        curriculum_25.character.Hero hero = new curriculum_25.character.Hero(name);
        hero.displayStatus();
        scanner.close(); 
    }
}
