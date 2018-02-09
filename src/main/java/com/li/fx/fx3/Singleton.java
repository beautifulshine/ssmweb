package com.li.fx.fx3;
public class Singleton {
	// 枚举实现单例
	public enum Single {

		INSTANCE("nba", 1);
		private final int id;
		private final String name;

		Single(String n, int i) {
			id = i;
			name = n;
		}

		public void leaveTheBuilding() {
			System.out.println("name:" + name + " id:" + id);
		}

		public Single getInstance() {
			return INSTANCE;
		}
	}

	public static void main(String[] args) {
		Single s = Singleton.Single.INSTANCE;
		s.leaveTheBuilding();

//		String key = String.format("news_content%s", "qq");
//		String key2 = String.format("news_content%d", 22);
//		System.out.println(key);
	}

}
