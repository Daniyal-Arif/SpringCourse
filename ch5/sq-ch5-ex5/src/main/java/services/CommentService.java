package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;


public class CommentService {

    public CommentService() {
        System.out.println("New CommentService Bean created");
    }
}
