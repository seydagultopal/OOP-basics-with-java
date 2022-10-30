
public class GettersSetters {

	// Constructor
	public GettersSetters(int id, String name, String description, double price, int stockAmount, String renk,
			String kod) {// sadece bu parametreleri verirse çalışır
		System.out.println("Yapıcı blok çalıştı");

		// OVERLOADING
		this.id = id;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
		this.kod = kod;
	}

	public GettersSetters() {

	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

}
