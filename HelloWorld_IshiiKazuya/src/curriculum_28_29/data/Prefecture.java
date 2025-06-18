package curriculum_28_29.data;

public class Prefecture {
	//インスタンス変数
	// 都道府県の名前
    private String name;
    //県庁所在地
    private String capital;
    //都道府県の面積
    private double area;
    //コンストラクタ　オブジェクト生成時に値を受け取り、フィールドに代入する初期化するためのメソッド
    public Prefecture(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }
//ゲッター　各フィールドの値を外部から取得できるようにするメソッド
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }
//画面表示するためのメソッド
    public void printInfo() {
        System.out.println("都道府県名：" + name);
        System.out.println("県庁所在地：" + capital);
        System.out.println("面積：" + area + "km2\n");
    }
}