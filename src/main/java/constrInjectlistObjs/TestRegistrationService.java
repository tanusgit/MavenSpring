package constrInjectlistObjs;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRegistrationService {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/constrInjectlistObjs/springs.xml");

		RegistrationService service = (RegistrationService) context.getBean("registerService");

		service.process();
	}
}
