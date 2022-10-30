package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager=new ProductManager();
		Product product=new Product();
		product.price=10;
		product.name="mouse";
		//product.id=12.5;
		manager.add(product);
	
	}

}
