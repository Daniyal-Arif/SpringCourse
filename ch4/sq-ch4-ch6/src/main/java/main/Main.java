package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setText("deliveru at 2");
        comment.setAuthor("dani boi");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}