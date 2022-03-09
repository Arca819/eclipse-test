package extend.practice;

public class Slime extends Monster {
	// 攻撃方法
	private String attackMethod = "体当たり";

	// コンストラクター
	public Slime() {
		this.name = "スライム";
		this.hp = Rand.get(900) + 100 ;
		this.offensive = Rand.get(10) + 1;
	}

	// attackメソッド
	@Override
	void attack(Living target) {
		int damage = offensive * Rand.get(10); // ダメージの算出
		System.out.println(name + "が" + attackMethod + "で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		target.hp -= damage; // 敵HPを減算
	}
}
