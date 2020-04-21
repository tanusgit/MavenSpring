package autowireByName;

public class UserService {

	
	/*	private DaoImpl dao1;

	public DaoImpl getDao1() {
		return dao1;
	}

	public void setDao1(DaoImpl dao1) {
		this.dao1 = dao1;
	}
*/
	private DaoImpl dao;

	
	private DaoImpl dao1;
	 
	 public DaoImpl getDao1() { return dao1; }
	 
	 public void setDao1(DaoImpl dao1) { this.dao1 = dao1; }
	 
	public DaoImpl getDao() {
		return dao;
	}

	public void setDao(DaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "UserService [dao=" + dao + "]" + "[dao1=" + dao1 + "]";
	}

	public void process() {
		dao.save();
	}

}