package peaksoft;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Scope("prototype")
    @Bean(name = "cat")
    public Cat catBean(){
        return  new Cat();
    }
}
