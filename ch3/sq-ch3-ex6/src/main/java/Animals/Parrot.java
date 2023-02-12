package Animals;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "kiki";

    public Parrot() {
        System.out.println("Parrots constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }


}
