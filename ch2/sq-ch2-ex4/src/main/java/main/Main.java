package main;

import animal.Parrot;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // created an instance of the spring context and added the config class for spring to use
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var p1 = context.getBean("parrot1", Parrot.class);
        System.out.println(p1.getName());

        var p2 = context.getBean("kiki", Parrot.class);
        System.out.println(p2.getName());


        var myName = context.getBean(String.class);
        System.out.println(myName);

        var myAge = context.getBean(Integer.class);
        System.out.println(myAge);
    }


}