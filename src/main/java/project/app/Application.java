package project.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "project")
@EnableJpaRepositories(basePackages = "project.repositories")
@EntityScan(basePackages = "project.models")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}