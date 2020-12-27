import org.example.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //现在对象都在Spring中管理
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);
    }
}
