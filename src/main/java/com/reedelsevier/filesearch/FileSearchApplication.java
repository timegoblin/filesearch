package com.reedelsevier.filesearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
@ComponentScan({"com.reedelsevier.filesearch"})
public class FileSearchApplication {
    /**
     * Main class.
     *
     * @param args The arguments.
     * @throws Exception The exception.
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(FileSearchApplication.class, args);
    }

    /**
     * Get message bundle.
     *
     * @return The message source.
     */
    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();
        messageBundle.setBasename("classpath:messages/messages");
        messageBundle.setDefaultEncoding("UTF-8");
        return messageBundle;
    }
}
