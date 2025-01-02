package dhruv.aneri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		Drawing drawing = (Drawing) app.getBean("drawing");
		
		//Triangle triangle = (Triangle)app.getBean("Triangle");
		//drawing.setShape(triangle);
		drawing.drawShape();
	}

}
