package constrInjectMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
//if the depedency is a Map use the map tag inside bean tag
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/constrInjectMap/springs.xml");
		RegistrationService service = (RegistrationService) context.getBean("registerService");
		service.process();
	}
}
