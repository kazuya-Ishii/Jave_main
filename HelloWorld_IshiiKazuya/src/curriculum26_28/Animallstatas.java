package curriculum26_28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animallstatas {
    public static void main(String[] args) {
        // 学名のマップを用意
        Map<String, String> scientificNames = new HashMap<>();
        scientificNames.put("ライオン", "パンテラ レオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
        scientificNames.put("インコ", "不明");

        // コンソール入力の準備
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");

        // 入力された文字列を取得
        String input = scanner.nextLine();

        // 入力された内容を処理
        String[] animals = input.split(",");
        for (String animal : animals) {
            String[] parts = animal.split(":");
            String name = parts[0];
            String length = parts[1];
            String speed = parts[2];
            String sciName = scientificNames.getOrDefault(name, "不明");

            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + sciName);
            System.out.println(); // 空行で区切る
        }

        scanner.close();
    }
}
