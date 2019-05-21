import java.util.ArrayList;
public class Order {
	ArrayList<OrderLine> lines;
	String customerName;
	
	public Order() {
		lines = new ArrayList<OrderLine>();	
		
	}
	public String getName(){
		return customerName;
	}
	public void setName(String name){
		this.customerName = name;
	}
	public void addOrderLine(Product product,int q) {
		OrderLine line = new OrderLine();
		line.setProduct(product);
		line.setQuantity(q);
		if(lines.isEmpty()) {
			lines = new ArrayList<OrderLine>();
		}
		lines.add(line);
	
	}
	
	

}
