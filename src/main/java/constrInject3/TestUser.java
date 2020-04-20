package constrInject3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
				("file:src/main/java/constrInject3/springs.xml");

		UserService uService = (UserService)
				context.getBean("uService");
		
		ProductService pService = (ProductService)
				context.getBean("pService");
		
		uService.saveUser();
		pService.saveProduct();
	}

}
