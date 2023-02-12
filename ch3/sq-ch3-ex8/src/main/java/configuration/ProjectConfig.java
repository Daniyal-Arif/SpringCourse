package configuration;

import Animals.Parrot;
import Animals.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("kiki");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("coco");
        return p;
    }

    @Bean
    public Person person(Parrot parrot1) {
        Person p = new Person();
        p.setName("daniyal");
        p.setParrot(parrot1);
        return p;
    }

}
