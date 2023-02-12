package main;

import Configurations.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs = context.getBean(CommentService.class); // this returns a proxy object

        Comment comment = new Comment();
        comment.setText("this is text");
        comment.setAuthor("Daniyal");

        String value = cs.publishComment(comment); // returns the value returned by the intercepted method

        logger.info(value);
    }
}