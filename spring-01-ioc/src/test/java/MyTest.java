import org.example.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
        UserServiceImpl userServiceImpl1 = (UserServiceImpl) context.getBean("userServiceImplByMysql");
        userServiceImpl1.getUser();
    }
}
