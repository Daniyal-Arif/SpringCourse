package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class CommentService {

    public CommentService() {
        System.out.println("CommentService instance created");
    }

}
