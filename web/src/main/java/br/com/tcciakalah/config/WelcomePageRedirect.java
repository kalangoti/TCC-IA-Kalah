package br.com.tcciakalah.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WelcomePageRedirect implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/")
            .setViewName("forward:/home.xhtml");
        
        registry.addViewController("/home")
            .setViewName("forward:/home.xhtml");
        
        registry.addViewController("/jogar")
        .setViewName("forward:/jogar.xhtml");
        
        registry.addViewController("/treinar")
        .setViewName("forward:/treinar.xhtml");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
