import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = applicationContext.getBean("getCat", Cat.class);
        Cat cat2 = applicationContext.getBean("getCat", Cat.class);
        boolean rez1 = bean == bean1;
        boolean rez2 = cat1 == cat2;
        System.out.println(rez1);
        System.out.println(rez2);
    }
}