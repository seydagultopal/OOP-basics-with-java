import javax.management.loading.PrivateClassLoader;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
	}
	public void add() {
		 
		System.out.println("müşteri eklendi");
		this.logger.log("Log mesajı");
	}

}
