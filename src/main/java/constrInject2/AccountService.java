package constrInject2;

public class AccountService {

	private String dbName;

	public AccountService(String dbName) {
		this.dbName = dbName;
	}

	public void save(){
		System.out.println("account- save:::"+dbName);
	}
	

}
