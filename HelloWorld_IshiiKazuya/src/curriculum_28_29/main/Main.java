package curriculum_28_29.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import curriculum_28_29.data.Prefecture;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//都道府県のデータ
        String[] rawData = {
            "北海道:札幌市:83424",
            "青森県:青森市:9646",
            "岩手県:盛岡市:15275",
            "宮城県:仙台市:7282",
            "秋田県:秋田市:11638",
            "山形県:山形市:9323",
            "福島県:福島市:13784",
            "茨城県:水戸市:6097",
            "栃木県:宇都宮市:6408",
            "群馬県:前橋市:6362",
            "埼玉県:さいたま市:3798"
        };

        // 都道府県オブジェクトのリスト
        List<Prefecture> prefectures = new ArrayList<>();
        for (String entry : rawData) {
            String[] parts = entry.split(":");
            prefectures.add(new Prefecture(parts[0], parts[1], Double.parseDouble(parts[2])));
        }

        // 入力受け取り
        System.out.println("番号をカンマ区切りで入力してください（例: 8,5,9）：");
        String[] indices = scanner.nextLine().split(",");

        System.out.println("昇順 (asc) または 降順 (desc) を入力してください：");
        String order = scanner.nextLine().trim().toLowerCase();

        // 選択されたデータのみ抽出
        List<Prefecture> selected = new ArrayList<>();
        for (String indexStr : indices) {
            try {
                int index = Integer.parseInt(indexStr.trim());
                if (index >= 0 && index < prefectures.size()) {
                    selected.add(prefectures.get(index));
                }
            } catch (NumberFormatException e) {
                System.out.println("無効な番号: " + indexStr);
            }
        }

        // 並び替え
        selected.sort(Comparator.comparingDouble(Prefecture::getArea));
        if (order.equals("desc")) {
            Collections.reverse(selected);
        }

        // 出力
        for (Prefecture p : selected) {
            p.printInfo();
        }
    }
}


 