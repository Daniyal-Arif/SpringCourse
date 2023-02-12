package main;

import configuration.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);

        var cr1 = s1.getCr();
        var cr2 = s2.getCr();

        System.out.println(cr1 == cr2);
    }
}