package main;

import animal.Parrot;
import configuration.PackageConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(PackageConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p);
        System.out.println(p.getName());

    }
}