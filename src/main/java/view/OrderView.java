package view;

import java.util.Scanner;

import serviceimpl.OrderServise;

public class OrderView {

	private Scanner sc;
	private OrderServise os;

	public OrderView() {
		os = new OrderServise();
		sc = new Scanner(System.in);
	}

	public void minu() {
		System.out.println("菜单模式：");
		System.out.println("------------");
		System.out.println("1-我要订餐");
		System.out.println("2-查看餐袋");
		System.out.println("3-删除订单");
		System.out.println("4-签收订单");
		System.out.println("5-点赞");
		System.out.println("0-退出程序");
	}

	// 删除订单
	public void delete() {
		System.out.println("请输入要删除的订单");
		int del = sc.nextInt();
		os.remove(del);
	}

	// 签收订单
	public void take() {
		System.out.println("请选择要签收的订单");
		int take = sc.nextInt();
		os.take(take);
	}

	// 点赞
	public void dianzan() {
		os.cSearch();
		System.out.println("请输入你要点赞的菜品编号");
		int diz = sc.nextInt();
		os.dianZan(diz);
	}

	public void takeOrder() {

		System.out.println("请输入你的选择：");

		int num = sc.nextInt();
		while (num >= 0) {
			if (num == 1) {
				os.reservations();

			} else if (num == 2) {
				os.view();
			} else if (num == 3) {
				delete();
			} else if (num == 4) {
				take();
			} else if (num == 5) {
				dianzan();
			} else if (num == 0) {
				break;
			}
			System.out.println("请输入你的选择：");
			num = sc.nextInt();
		}
		System.out.println("程序退出！！");
	}

	public static void main(String[] args) {
		OrderView ov = new OrderView();
		ov.minu();
		ov.takeOrder();}}