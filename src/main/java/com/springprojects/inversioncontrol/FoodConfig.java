package com.springprojects.inversioncontrol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@Component("com.springprojects.inversioncontrol")
public class FoodConfig {

    @Primary
    @Bean
    public CookingJob cookerJob() {
        return new CookingJob();
    }
    @Qualifier
    @Bean
    public HeadChef cooker() {
        HeadChef headChef = new HeadChef(cookerJob());
        return headChef;
    }
}
