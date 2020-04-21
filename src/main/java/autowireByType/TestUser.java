package autowireByType;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
				("file:src/main/java/autowireByType/springs.xml");
		AccountService aService = 
				(AccountService) context.getBean("aService");
	 System.out.println(aService);
	}

}
