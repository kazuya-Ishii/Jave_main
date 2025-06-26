package curriculum_33;


public class Main {
    public static void main(String[] args) {
    	//personオブジェクトの生成　コントラクタにより基本情報氏名、年齢、身長、体重が設定される
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
       //インスタンス生成
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // 乗り物を購入（問題10）
        person1.buy(car);
        person2.buy(bicycle);
    }
}
