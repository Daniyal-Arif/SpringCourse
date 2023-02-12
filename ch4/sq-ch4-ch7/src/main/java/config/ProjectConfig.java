package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import proxies.CommentNotificationProxy;
import proxies.CommentPushNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

@Configuration
@ComponentScan(basePackages = {"services", "repositories", "proxies"})
public class ProjectConfig {


}
