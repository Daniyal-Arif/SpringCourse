package configuration;

import Animals.Parrot;
import Animals.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Animals")
public class ProjectConfig {


}
