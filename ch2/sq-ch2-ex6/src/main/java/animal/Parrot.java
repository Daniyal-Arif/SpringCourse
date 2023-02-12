package animal;

import org.springframework.stereotype.Component;

// by marking your class with @Component you are telling Spring to add this class's instance to its context
@Component
public class Parrot {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
