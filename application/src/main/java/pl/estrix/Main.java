package pl.estrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "pl.estrix")
@EnableScheduling
@EnableAutoConfiguration
//@Configuration
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class);
    }
}
