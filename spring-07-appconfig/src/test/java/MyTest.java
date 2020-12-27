import org.example.config.AppConfig;
import org.example.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test() {
        //通过Java方式与注解完成配置文件的设置
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
