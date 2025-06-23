package curriculum_32;

class Person {
	//// 生成されたPersonの人数を記録する
    public static int count = 0;
    public String firstName;
     // 問題1：lastName フィールド追加
    public String lastName; 
    public int age;
    public double height, weight;

    // 問題2～3：lastName を含むコンストラクタを追加
    Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
         // 人数カウント
        Person.count++; 
    }

    public String fullName() {
        return this.lastName + this.firstName;
    }

    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "です");
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    public static void printCount() {
        System.out.println("合計" + Person.count + "人です");
    }
}