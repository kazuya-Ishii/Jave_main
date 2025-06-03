package question_1_23.animals;

	public class Animals {
	    private String name;
	    private double length;
	    private int speed;

	    // セッター
	    public void setName(String name) {
	        this.name = name; // thisでフィールドを区別
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    // ゲッター
	    public String getName() {
	        return this.name;
	    }

	    public double getLength() {
	        return this.length;
	    }

	    public int getSpeed() {
	        return this.speed;
	    }
	}
