package main;

import configuration.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("before referencing CommentService Bean");
        var cs = context.getBean(CommentService.class);
        System.out.println("after referencing CommentService Bean, using @Lazy only then the bean is created");

    }
}