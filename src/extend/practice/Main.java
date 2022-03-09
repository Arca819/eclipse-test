package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 変数の宣言
		int humansCounter;          // 人間キャラクター数
		int monstersCounter;        // モンスターキャラクター数
		int attackCounter;          // 戦闘回数
		boolean decision = true;    // 判定 (true:戦闘続行, false:決着)
		
		// 各キャラクターのインスタンスを作成
		// 個々の属性は各キャラクタークラスで定義
		Human[] humans = new Human[] {
			new Brave(),
			new Fighter(),
			new Wizerd(),
		};
		
		Monster[] monsters = new Monster[] {
			new Slime(),
			new Oak(),
			new Dragon(),
		};
		
		
		// humansListの作成
		List<Living> humansList = new ArrayList<>();
		for (Human human : humans) {
			humansList.add(human);
		}
		// 現在のキャラクター数を取得
		humansCounter = humansList.size();
		
		
		// monstersListの作成
		List<Living> monstersList = new ArrayList<>();
		for (Monster monster : monsters) {
			monstersList.add(monster);
		}
		// 現在のキャラクター数を取得
		monstersCounter = monstersList.size();
		
		// 先攻判定
		attackCounter = Rand.get(2); // 0 か 1 の乱数により、先攻者を決定（0:人間, 1:モンスター）
		
		// 交戦
		while (decision) {
			
			// 戦闘者を選定
			Living h = humansList.get(Rand.get(humansCounter));      // 人間側
			Living m = monstersList.get(Rand.get(monstersCounter));  // モンスター側

			switch (attackCounter % 2) {
			case 0: // 人間からの攻撃
				System.out.println("人間のターン！");
				h.attack(m);
				// 攻撃結果
				if (m.hp <= 0) {
					System.out.println(m.name + "は倒れた");
					// 倒れたメンバーを削除
					monstersList.remove(m);
					monstersCounter = monstersList.size();
				}
				break;
			case 1: // モンスターからの攻撃
				System.out.println("モンスターのターン！");
				m.attack(h);
				// 攻撃結果
				if (h.hp <= 0) {
					System.out.println(h.name + "は倒れた");
					// 倒れたメンバーを削除
					humansList.remove(h);
					humansCounter = humansList.size();
				}
				break;
			}
			
			// 勝利判定
			if (humansCounter == 0) {
				System.out.println("勇者たちは敗北した！");
				decision = false;
			} else if (monstersCounter == 0) {
				System.out.println("勇者たちは勝利した！");
				decision = false;
			}
			
			attackCounter++;
			
		}
	}
}
