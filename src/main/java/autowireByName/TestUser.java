package autowireByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/autowireByName/springs.xml");

		UserService uService = (UserService) context.getBean("uService");
		uService.process();
		System.out.println(uService);

		AccountService accountService = (AccountService) context.getBean("aService");

		accountService.validate();
	}

}
