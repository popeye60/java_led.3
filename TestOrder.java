public class TestOrder {

	public static void main(String[] args) {
		Product[] product = new Product[2];
		product[0] = new Product();
		product[0].setName("Ichitan");
		product[0].setPrice(10);
		product[0].setProductID("001");
		product[1] = new Product("Oishi",12,"002");
		
		for(int i = 0; i < product.length; i++) {
			System.out.println(product[i].getName());
		}
		Order order1 = new Order();
		order1.setName("Note Udom");
		order1.addOrderLine(product[0],10);
		order1.addOrderLine(product[1], 5);
		
		printOrder(order1);
		
		Order order2 = new Order();
		order2.setName("Yaya");
		order2.addOrderLine(product[0], 20);
		order2.addOrderLine(product[1], 15);
		
		printOrder(order2);

	}
public static void printOrder(Order o) {
	int p,q,amount,total = 0;
	System.out.println(o.getName());
	
	for(int i = 0; i < o.lines.size(); i++) {
		System.out.print(o.lines.get(i).getProduct().getProductID()+" ");
		System.out.print(o.lines.get(i).getProduct().getName()+" ");
		p = o.lines.get(i).getProduct().getPrice();
		System.out.print(o.lines.get(i).getProduct().getPrice()+" ");		
		q = o.lines.get(i).getQuantity();
		System.out.print(q + " ");
		amount = p*q;
		System.out.println(amount);
		total += amount;
	}
	System.out.println("Total Price: " +total);
}

}
