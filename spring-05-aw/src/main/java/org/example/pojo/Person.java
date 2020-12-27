package org.example.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Person {
    @Value("欧阳")
    private String name;
    @Autowired
    private Cat cat;
    /*
    先通过类型查找
    如果对应的Bean中类型唯一，则id是任意值都可以自动装配成功
    如果有多个相同类型
    则选出对应的id与属性名相同的那个bean
    如果都没有匹配的，则需要用Qualifier注解指定id名称
     */
    @Autowired
    @Qualifier("dog1")
    private Dog dog;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
