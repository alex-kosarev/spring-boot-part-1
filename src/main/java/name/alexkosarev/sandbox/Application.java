package name.alexkosarev.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args)
                .registerShutdownHook();
    }

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("Hello from {}", applicationName);
    }
}
