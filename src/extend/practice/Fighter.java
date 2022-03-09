package extend.practice;

public class Fighter extends Human {
	// 攻撃方法
	private String attackMethod = "斧";

	// コンストラクター
	public Fighter() {
		this.name = "戦士";
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
