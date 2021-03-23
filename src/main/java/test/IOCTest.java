package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc1.xml");
		Coffee cof1 = (Coffee)ac.getBean("coffee");
		Coffee cof2 = (Coffee)ac.getBean("coffee");
		Coffee cof3 = (Coffee)ac.getBean("coffee");
		Coffee cof4 = (Coffee)ac.getBean("coffee");
		Coffee cof5 = (Coffee)ac.getBean("coffee");
		Coffee cof6 = (Coffee)ac.getBean("coffee");
		System.out.println(cof1 == cof6);
		
	}
}
