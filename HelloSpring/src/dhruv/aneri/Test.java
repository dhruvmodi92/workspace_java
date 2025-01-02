package dhruv.aneri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext appcon = new ClassPathXmlApplicationContext("Beans.xml");
		Hello hello = (Hello) appcon.getBean("hello");
		hello.getName();
	}
}
