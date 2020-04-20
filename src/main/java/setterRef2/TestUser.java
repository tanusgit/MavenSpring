package setterRef2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"file:src/main/java/setterRef2/springs.xml");
		UserService uService = (UserService) context.getBean("uService");
		AccountService aService = (AccountService) context.getBean("aService");

		aService.m1();
		uService.m2();
		
	}

}
