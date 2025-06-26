package curriculum_33;

public class Person {
	//フィールド
    public static int count = 0;
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    //コントラクタ
    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }
//名前と苗字をスペースでつないで返すメソッド
    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    // ゲッター
    public int getAge() {
        return age;
    }
    //セッター
    public void setAge(int age) {
        this.age = age;
    }

   
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

  
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // BMI計算　体重÷（身長×身長）　
    public double bmi() {
    	//身長が0だとエラーになるため0を返す
        if (this.height == 0) return 0;
        return this.weight / (this.height * this.height);
    }

    // Car購入
    public void buy(Car car) {
        car.setOwner(this.fullName());
        System.out.println(car.getOwner() + " が購入しました");
    }

    // Bicycle購入
    public void buy(Bicycle bicycle) {
        bicycle.setOwner(this.fullName());
        System.out.println(bicycle.getOwner() + " が購入しました");
    }

    // オブジェクトの情報を文字列として出力
    @Override
    public String toString() {
        return fullName() + "（年齢: " + age + "歳）";
    }
}