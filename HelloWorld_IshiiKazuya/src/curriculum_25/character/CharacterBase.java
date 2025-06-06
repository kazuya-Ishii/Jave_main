package curriculum_25.character;

public class CharacterBase {
	//プライベートインスタンス変数　名前
    private String name; 
    //ヒットポイント
    private int hp;
    //マジックポイント
    private int mp;
    //攻撃力
    private int attack;
    //巣早さ
    private int speed;
    //防御
    private int defense;
//オブジェクトを生成する際に一度だけ実行される
    public CharacterBase(String name) {
    	//キャラクターの名前が引数に渡される
        this.name = name;
        //オブジェクト生成時に自動でステータス
        generateRandomStatus();
    }
    //キャラクターのステータスをランダムに生成するための範囲設定
    protected void generateRandomStatus() {
    	//500～1000の範囲
        this.hp = getRandomValue(500, 1000);
        //200～1000
        this.mp = getRandomValue(200, 1000);
        //100～500
        this.attack = getRandomValue(100, 500);
        //100～1000
        this.speed = getRandomValue(100, 1000);
        //10～100
        this.defense = getRandomValue(10, 100);
    }
    //指定した範囲内のランダムな整数
    private int getRandomValue(int min, int max) {
    	//int にキャストすることで 小数点以下を切り捨てて整数
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    // Getter & Setter
    //フィールドの値を取得
    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getMp() { return mp; }
    public int getAttack() { return attack; }
    public int getSpeed() { return speed; }
    public int getDefense() { return defense; }
    //フィールドに値を設定
    public void setName(String name) { this.name = name; }
    public void setHp(int hp) { this.hp = hp; }
    public void setMp(int mp) { this.mp = mp; }
    public void setAttack(int attack) { this.attack = attack; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setDefense(int defense) { this.defense = defense; }
}