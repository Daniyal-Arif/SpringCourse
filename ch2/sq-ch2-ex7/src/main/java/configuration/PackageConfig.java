package configuration;

import animal.Parrot;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// @Component scan instructs Spring, where to look for stereotypical annotations
@Configuration
@ComponentScan(basePackages = "animal")
public class PackageConfig {

}
