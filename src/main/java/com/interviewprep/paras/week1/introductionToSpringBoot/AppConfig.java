package com.interviewprep.paras.week1.introductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration// you can define multiple type of configuration and also can define some conditional properties like:
// how and when the configuration should be loaded depending on some other type of configuration
//
public class AppConfig {

    @Bean
    @Scope("prototype") // "singleton" by default
    Apple getApple(){// factory method
        return new Apple();// the creation of object part is being created by programmer/developer but the management part/ DI part taken care by Spring boot application
    }

}
