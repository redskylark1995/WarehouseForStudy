package com.demo.works;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

/**
 * 名程序
 * @author Teacher
 * @createTime 2017年7月24日 上午10:40:17
 * @version 1.0.0
 */
public class RandomCallName {
	
	//定义人名数组
	private static String[] nameArr = {"黄成霞","邓    威","石    瑶","张    峰","蒋川浩",
					 "向    奎","骆成林","梁    真","王国明","贺亦舜",
			         "肖明威","胡    坤","刘东京","陈春赛","杨陵雄",
			         "布红亮","谭丽萍","陈玉佳","杨华玉","徐    晶",
			         "雷    薇","凌泽飞","冉发贵","王    瑜","唐    甜",
			         "郭    锐","洪美交","吕    航","邹    稷","刘晓亮",
			         "付    汉","熊林海","成建南","张    于","陈    科",
			         "杨文明","祝忠民","李    浩","张正泉","朱家井",
			         "陈    卓","游振君","杨正凯","张    鹏","付    妍","李思思"};
	private static Font font = new Font("宋体", Font.PLAIN, 12);

	public static void main(String[] args) {
		//获得数组中的人名
		/*System.out.println(index);
		System.out.println(nameArr[index]);*/
		//创建窗口对象
		JFrame jframe = new JFrame();
		//创建按钮对象
		JButton jbtn = new JButton("随机一下");
		//创建标签对象
		JLabel jlab = new JLabel("  姓名: ");
		//设置标题
		jframe.setTitle("随机点名器");
		//设置尺寸
		jframe.setSize(new Dimension(360, 200));
		//设置屏幕居中
		jframe.setLocationRelativeTo(null);
		//禁止更改窗口大小
		jframe.setResizable(false);
		//设置窗口的布局方式
		jframe.setLayout(null);
		//设置按钮与标签的方位、尺寸
		jlab.setBounds(100, 50, 170, 30);
		jbtn.setBounds(140, 100, 100, 26);
		//设置边框
		jlab.setBorder(new TitledBorder(""));
		//设置字体
		jlab.setFont(font);
		//窗口中添加组件
		jframe.add(jlab);
		jframe.add(jbtn);
		//给按钮注册事件
		jbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//随机获得数组下标
				int index = (int)(Math.random()*nameArr.length);
				//修改标签中文本
				jlab.setText("  姓名: "+nameArr[index]);
			}
		});
		//设置关闭模式，目的：结束进程
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示窗口
		jframe.setVisible(true);
	}

}
