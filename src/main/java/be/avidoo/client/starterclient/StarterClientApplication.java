package be.avidoo.client.starterclient;


import be.avidoo.kring.commons.GreetingService;
import be.avidoo.kring.commons.config.ObjectMapperConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ObjectMapperConfiguration.class)
public class StarterClientApplication implements CommandLineRunner {

    @Autowired
    public GreetingService greetingService;

    public static void main(String[] args) {
        SpringApplication.run(StarterClientApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {

        String result = greetingService.sayHello("Lebron");
        System.out.println(result);
    }
}
