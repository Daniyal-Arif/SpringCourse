package main;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        var emailCommentNotificationProxy = new EmailCommentNotificationProxy();
        var dbCommentRepository = new DBCommentRepository();

        var comment = new Comment();
        comment.setText("deliveru at 2");
        comment.setAuthor("dani boi");

        CommentService commentService = new CommentService(emailCommentNotificationProxy, dbCommentRepository);
        commentService.publishComment(comment);
    }
}