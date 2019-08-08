package content;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Order {
	private String name;// 订餐人名称
	private Map cuisine;// 所选菜品
	private int times;// 送餐日期
	private String address;// 地址
	private boolean statues;// 状态
	private double prices;

	public Order() {
		cuisine = new HashMap<String, Integer>();

	}

	public double getPrices() {
		return prices;
	}

	public void setPrices(double prices) {
		this.prices = prices;
	}

	public Order(String name, Map cuisine, int times, String address, boolean statues, double prices) {
		this.cuisine = cuisine;
		this.name = name;
		this.times = times;
		this.address = address;
		this.statues = statues;
		this.prices = prices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisine() {
		Set<Entry<String, Integer>> set = cuisine.entrySet();
		for (Entry<String, Integer> entry : set) {
			return (entry.getKey() + ":" + entry.getValue());
		}
		return null;

	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", cuisine=" + cuisine + ", times=" + times + ", address=" + address
				+ ", statues=" + statues + ", prices=" + prices + "]";
	}

	public void setCuisine(String name, Integer num) {
		cuisine.put(name, num);
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isStatues() {
		return statues;
	}

	public void setStatues(boolean statues) {
		this.statues = statues;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
