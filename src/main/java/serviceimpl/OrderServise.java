package serviceimpl;

import java.util.Scanner;

import content.Order;
import entity.Ordercurse;
import service.Orderse;

public class OrderServise implements Orderse{
	private Order[] list;
	private Ordercurse[] cuis;
	Scanner sc;

	public Ordercurse getCuis(int id) {
		return cuis[id];
	}

	public void setCuis(Ordercurse[] cuis) {
		this.cuis = cuis;
	}

	public OrderServise() {
		sc = new Scanner(System.in);

		cuis = new Ordercurse[3];
		cuis[0] = new Ordercurse(1, "红烧带鱼", 38.0, 0);
		cuis[1] = new Ordercurse(2, "鱼香肉丝", 20.0, 0);
		cuis[2] = new Ordercurse(3, "时令蔬菜", 10.0, 0);
		list = new Order[5];

	}

	public Order[] getList() {
		return list;
	}

	public void setList(Order[] list) {
		this.list = list;
	}
    //菜品信息
	public void cSearch()
	{
		System.out.print("编号\t蔬菜名\t单价\t点赞数\n");

		for (Ordercurse cuisineView : cuis) {

			if (cuisineView != null) {
				System.out.print(cuisineView.getId() + "\t" + cuisineView.getCname() + "\t" + cuisineView.getCprice()
						+ "\t" + cuisineView.getDianzan());

				System.out.print("\n");
			}
		}
	}
	// 我要订餐
	public void reservations() {
		cSearch();
		System.out.println("请输入要选择的菜品的名称和份数：");
		String name = sc.next();
		Integer num = sc.nextInt();
		Order o = new Order();
		o.setName("张强");
		o.setTimes(3);
	
		o.setCuisine(name, num);
		for (int j = 0; j < cuis.length; j++) {
			if ((cuis[j].getCname().equals(name))) {
				o.setPrices(num * cuis[j].getCprice());
				break;
			}
		}
		for (int i = 0; i < list.length; i++) {

			if (list[i] == null) {
				list[i] = o;
				break;
			}

		}

	}

	// 查看餐袋
	public void view() {
		System.out.print("姓名\t菜品\t地址\t\t日期\t状态\t价格\n");
		for (Order order : list) {

			if (order != null) {
				String str=null;
				if(order.isStatues()==true)
				{
					str="已签收";
				}
				else
				{
					str="未签收";
				}
				System.out.println(order.getName() + "\t" + order.getCuisine().toString() + "\t" + order.getAddress()
						+ "\t" + order.getTimes() + "\t" + str + "\t" + order.getPrices());

			}
			if (list == null) {
				System.out.println("你还没有订单！！！");
				break;
			}
		}
	}
	//签收订单
	public void take(int id)
	{
		for (int i = 0; i < list.length; i++) {
			if(i==(id-1))
			{
				list[i].setStatues(true);
				System.out.println("订单签收成功！");
				break;
			}
			
		}
	}
    //删除订单
	public void remove(int id)
	{
		for (int i = 0; i < list.length; i++) {
			if(i==(id-1))
			{
				list[i]=null;
				
			}
			
		}
	}
	//点赞
	public void dianZan(int id)
	{   
		for (int i = 0; i < cuis.length; i++) {
			if(i==(id-1))
			{
				cuis[i].setDianzan(cuis[i].getDianzan()+1);
				System.out.println("点赞成功！");
			}
		
		}
	}

}
		