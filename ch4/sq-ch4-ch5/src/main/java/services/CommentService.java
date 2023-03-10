package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;


@Component
public class CommentService {

    private final CommentNotificationProxy commentNotificationProxy;

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    public void publishComment(Comment comment) {
        commentNotificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
    }
}
