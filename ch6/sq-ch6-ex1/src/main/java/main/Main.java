package main;

import Configurations.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setText("this is text");
        comment.setAuthor("Daniyal");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs = context.getBean(CommentService.class); // this returns a proxy object
        System.out.println(cs.getClass());
        cs.publishComment(comment);
    }
}