package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class CommentService {

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;
    @Autowired
    private CommentRepository commentRepository;

    public void publishComment(Comment comment) {
        commentNotificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
    }
}
