package configuration;

import Animals.Parrot;
import Animals.Person;
import org.springframework.context.annotation.Bean;
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
    public Person person1() {
        Person p = new Person();
        p.setName("Daniyal");
        p.setParrot(parrot1());
        return p;
    }
}
