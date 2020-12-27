import org.example.pojo.Address;
import org.example.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());

        Address address1 = context.getBean("address", Address.class);
        Address address2 = context.getBean("address", Address.class);
        System.out.println(address1.equals(address2));
        System.out.println(address1 == address2);
    }
}
