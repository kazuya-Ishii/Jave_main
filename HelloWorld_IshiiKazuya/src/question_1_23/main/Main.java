package question_1_23.main;

import question_1_23.animals.Animals;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Animals lion = new Animals();

	        // Setterを使って値を設定
	        lion.setName("ライオン");
	        lion.setLength(2.1);
	        lion.setSpeed(80);

	        // Getterで値を取得して出力
	        System.out.println("動物名：" + lion.getName());
	        System.out.println("体長：" + lion.getLength() + "m");
	        System.out.println("速度：" + lion.getSpeed() + "km/h");
	    }
}
