package constrInject4list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/constrInject4list/springs.xml");
		UserService uService = (UserService) context.getBean("uService");
		System.out.println(uService.getUserName());
		System.out.println(uService.getConfigs());
	}
}
