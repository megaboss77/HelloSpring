package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan(basePackages ="hello")
@SpringBootApplication
public class Application {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("app is running on the port "+env.getProperty("server.port"));

            // String[] beanNames = ctx.getBeanDefinitionNames();
            // Arrays.sort(beanNames);
            // for (String beanName : beanNames) {
            //     System.out.println(beanName);
            // }

        };
    }

}
