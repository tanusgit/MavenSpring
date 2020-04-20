package constrInject2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
				("file:src/main/java/constrInject2/springs.xml");
		UserService service = (UserService)	context.getBean("uService");
		service.saveUser();
	}

}
