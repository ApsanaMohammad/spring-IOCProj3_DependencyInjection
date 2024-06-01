package com.nt.test;
import com.nt.beans.Person;
import com.nt.beans.Person1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Create ApplicationContext
        ApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfg/applicationContext.xml");

        // Retrieve bean from the ApplicationContext
        Person person = (Person) context.getBean("per");
        Person1 person1 = (Person1) context.getBean("per1");
        // Use the retrieved bean
        System.out.println(person);
        System.out.println(person1);
        ((AbstractApplicationContext) context).close();
    }
}
