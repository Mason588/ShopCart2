package Entity;
//這裡是具體的商品類
public class Product {
	private String pid;//商品編號
	private String name;//商品名
	private double price;//商品價格
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double  getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	 public Product(String pid,String name,double price) {
		// TODO Auto-generated constructor stub
		 this.pid = pid;
		 this.name = name;
		 this.price = price;
	}
	
	
}
