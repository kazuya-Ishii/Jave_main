package basicClass;

public class Dog {
    // Q1：フィールドに動物の名前の変数を定義してください。
	//動物の名前
    String name;

    // Q2：フィールドに動物の数の変数を定義してください。
    //動物の数
    int number;

    // Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
    //引数なしでインスタンス生成したときに、自動的に name には犬が設定されている
    public Dog() {
        this.name = "犬";
    }

    // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
    public Dog(int number) {
        this.name = "犬"; 
      //umber の値を外から受け取り、this.number に代入。
        this.number = number;
    }
}
