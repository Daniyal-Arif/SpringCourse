package main;

import configuration.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean("commentService", CommentService.class);
        var userService = context.getBean("userService", UserService.class);

        var cr1 = commentService.getCommentRepository();
        var cr2 = userService.getCommentRepository();

        System.out.println(cr1 == cr2);



    }
}