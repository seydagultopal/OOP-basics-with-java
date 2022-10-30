package interfaces;

public class MySqlCustomer implements iCustomerDal, iRepository {
//bir sınıf extend edebilir ama istediğin kadar interface ekleyebilirsin.

	@Override
	public void add() {
		System.out.println("My SQL eklendi.");

	}

}
