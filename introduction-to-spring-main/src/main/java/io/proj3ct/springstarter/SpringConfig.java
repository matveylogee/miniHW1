package io.proj3ct.springstarter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class SpringConfig {

    @Bean("appleBean")
    @Scope("prototype")
    public Apple getApple(){
        return new Apple();
    }

    @Bean("appleWithColorValue")
    @Scope("prototype")
    public Apple getAppleWithColor(@Value("${apple.color}") String color){
        return new Apple(color);
    }

}
