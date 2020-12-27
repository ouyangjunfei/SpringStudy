package org.example.config;

import org.example.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//包扫描模式必须给类加上@Component注解
@ComponentScan("org.example")
//引入另一个配置文件
@Import(MyConfig.class)
public class AppConfig {

    /*不开启包扫描模式则需要手动使用@Bean注解一个个注册Bean
    并且注册完成的Bean名称为方法名称
    对应的类则可以不加@Component注解，加上也不会出错*/

    /*@Bean
    public User getUser() {
        return new User();
    }*/
}
