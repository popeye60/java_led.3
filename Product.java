public class Product {
	private String name;
	private int price;
	private String productID;
	
	
	public Product() {
	}
	public Product(String name, int price, String productID) {
		this.name = name;
		this.price = price;
		this.productID = productID;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String pID){
		this.productID = pID;
	}
		
}
