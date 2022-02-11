package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld == bean);

        Cat cat = (Cat) applicationContext.getBean("catBean");
        Cat cat1 = (Cat) applicationContext.getBean("catBean");
        System.out.println(cat==cat1);
        System.out.println(bean.getMessage());

    }
}
