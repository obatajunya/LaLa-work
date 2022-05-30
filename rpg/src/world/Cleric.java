package world;

import java.util.Random;

public class Cleric {
		String name;
		int hp = 50;
		final int HP_MAX = 50;
		int mp = 10;
		final int MP_MAX = 10;

		public void selfAid() {
			this.hp = HP_MAX;
			this.mp = this.mp -5;
			System.out.println("聖職者は「セルフエイドをつかった」");
		}
		
		/**
		 * 聖職者は祈ることで自分のMPを回復できる。
		 * 回復量は祈る秒数 + ランダム(3未満)
		 * ただし、最大MPを超えることはない。
		 * @param sec int 祈る秒数
		 * @return int 回復量
		 */
		public int pray(int sec) {
			System.out.println(this.name + "は" + "秒間祈った");
			int hosei = new Random().nextInt(3) + sec;
			int kaihuku = sec + hosei;
			if ((this.mp + kaihuku) > MP_MAX) {
				kaihuku = MP_MAX - this.mp;
			}
			this.mp = this.mp + kaihuku;
			System.out.println("聖職者は" + sec + "秒祈った");
			System.out.println("MPが" + kaihuku + "回復した。");
			return kaihuku;
		}
			
}
	