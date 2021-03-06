package day12;

public abstract class Product {
	//제품명
	private String name;
	//가격
	private int price;
	//수량
	private int amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Product(String name) {
		this(name,0,0);
	}
	public Product(String name, int price, int amount) {
		this.name = name;//매개변수와 멤버변수(필드)의 이름이 같은 경우 또 같이 사용되는 경우 this 꼭 붙여야 함
		this.price = price;
		this.amount = amount;
	}
	public abstract void print();
}
