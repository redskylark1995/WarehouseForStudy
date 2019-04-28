package com.demo.works;

/**
 * 商品类的使用者程序
 * @author Teacher
 * @createTime 2017年7月19日 上午10:08:45
 * @version 1.0.0
 */
public class GoodsClient {

	public static void main(String[] args) {
		//新建服装商品类
		Goods goods = new Clothing("T恤", 30, 200, "2017-05-05", "XL", "白色", 0.8);
		//输的基本信息
		goods.printInfo();
		//计算总价值
		goods.getSelfTotalAssets();
		
		//新建计算机商品类
		goods = new Computer("联想", 50, "2016-08-23", "3年", "T-7350",
				new Equipment("希捷Barracuda", "希捷Barracuda 500GB 7200转 16MB SATA3（ST500DM002）", 325),
				new Equipment("金士顿", "金士顿4GB DDR3 1333（KVR1333D3N9/4G-SP）", 260),
				new Equipment("AMD FX-8350", "AMD FX-8350", 1200),
				new Equipment("七彩虹iGame 750", "七彩虹iGame 750 烈焰战神U-Twin-1GD5", 800));
		//输出基本信息
		goods.printInfo();
		//计算总价值
		goods.getSelfTotalAssets();
	}

}
