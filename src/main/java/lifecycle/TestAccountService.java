package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccountService {


		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/lifecycle/springs.xml");

			System.out.println("*****loaded springs.xml*******");

			System.out.println("*****GET AccountService OBJ*******");
			AccountService accountService = (AccountService) context.getBean("aService");
			accountService.save();

			System.out.println("*****GET AccountService OBJ*******");
			AccountService accountService1 = (AccountService) context.getBean("aService");
			accountService1.save();

		}
	}


