package config;

//      1. Define a configuration class (annotated with @Configuration) for your project,
//         which, as we’ll discuss later, we use to configure the context of Spring.
//      2. Add a method to the configuration class that returns the object instance you
//         want to add to the context and annotate the method with the @Bean annotation.
//      3. Make Spring use the configuration class defined in step 1. As you’ll learn later, we
//         use configuration classes to write different configurations for the framework.


import animal.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    //By adding the @Bean annotation, we instruct Spring
    //to call this method when at context initialization and
    //add the returned value to the context.
    @Bean
    public Parrot parrot1() {  // by default, name of bean is parrot1 which is th methods name
        var p = new Parrot();
        p.setName("thomas");
        return p;
    }

    @Bean(name="kiki")   // name of bean is kiki
    public Parrot parrot2() {
        var p = new Parrot();
        p.setName("kiki");  // name of parrot is kiki
        return p;
    }

    @Bean
    @Primary   // default bean chosen if Bean name is not given
    public Parrot parrot3() {
        var p = new Parrot();
        p.setName("pogo");
        return p;
    }

    @Bean
    public String mySchool() {
        return "bva";
    }

    @Bean
    public Integer myAge() {
        return 22;
    }

}
