package main;

import Animals.Parrot;
import Animals.Person;
import configuration.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Persons name: " + person.getName());
        System.out.println("Parrots name: " + parrot.getName());
        System.out.println("Persons Parrot : " + person.getParrot());
    }
}