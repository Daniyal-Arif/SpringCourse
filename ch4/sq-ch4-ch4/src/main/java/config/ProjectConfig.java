package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

@Configuration
public class ProjectConfig {

    @Bean
    public CommentService commentService(CommentNotificationProxy c, CommentRepository r) {
        CommentService s = new CommentService(c, r);
        return s;
    }

    @Bean
    public CommentNotificationProxy emailCommentNotificationProxy() {
        CommentNotificationProxy p = new EmailCommentNotificationProxy();
        return p;
    }

    @Bean
    public CommentRepository commentRepository() {
        CommentRepository r = new DBCommentRepository();
        return r;
    }

}
