import org.example.pojo.Person;
import org.example.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        //在创建ApplicationContext就会对所有的Bean进行实例化
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //默认使用无参构造
        User user = context.getBean("user", User.class);
        //删除无参构造后，使用有参构造


        System.out.println(user.getName());

        //使用Bean的别名
        User user1 = context.getBean("userNew", User.class);

        System.out.println(user == user1);

        //Person Bean懒加载
        Person person = context.getBean("person", Person.class);
    }
}
