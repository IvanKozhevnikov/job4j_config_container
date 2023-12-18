package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("classpath:app-context-xml.xml");
        Man man = ct.getBean(Man.class);
        man.print();
    }
}