package autowireByName;

public class DaoImpl {

	String config ;

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	@Override
	public String toString() {
		return "DaoImpl [config=" + config + "]";
	}
	
	public void save() {
		System.out.println("save using config:"+config);
	}
	
}

