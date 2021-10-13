package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {

       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = applicationContext.getBean("helloworld",HelloWorld.class);
        System.out.println(bean2.getMessage());

        System.out.println(bean == bean2);

        Cat cat =(Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat)applicationContext.getBean("cat");

        System.out.println(cat == cat1);

    }
}
