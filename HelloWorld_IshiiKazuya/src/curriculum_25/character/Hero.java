package curriculum_25.character;
//CharacterBaseクラスを継承（extends)
public class Hero extends CharacterBase {
	//継承により、getName()やgetHp()などのメソッドを使える
    public Hero(String name) {
    	//super(name) は親クラス
        super(name);
    }

    public void displayStatus() {
        System.out.println("こんにちは 「" + getName() + "」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getHp());
        System.out.println("MP：" + getMp());
        System.out.println("攻撃力：" + getAttack());
        System.out.println("素早さ：" + getSpeed());
        System.out.println("防御力：" + getDefense());
        System.out.println();
        System.out.println("さあ冒険に出かけよう！");
    }
}