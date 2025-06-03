package question_1_23.animals;

	public class Animals {
		//動物の名前
	    private String name;
	    //動物の体長
	    private double length;
	    //動物の速度
	    private int speed;

	    // セッター　値を設定する　メソッドでしかアクセスできない
	    public void setName(String name) {
	        this.name = name; // thisでフィールドを区別
	    }
        //double 小数を含む実数
	    public void setLength(double length) {
	        this.length = length;
	    }
	    //整数（小数なし）
	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    // ゲッター　値を取得する
	    public String getName() {
	    	//メソッドから値を返す
	        return this.name;
	    }

	    public double getLength() {
	        return this.length;
	    }

	    public int getSpeed() {
	        return this.speed;
	    }
	}
