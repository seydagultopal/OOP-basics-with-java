package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(new OracleCusomerDal());
		//customerManager.customerDal=new OracleCusomerDal();
		customerManager.add();

	}

}
