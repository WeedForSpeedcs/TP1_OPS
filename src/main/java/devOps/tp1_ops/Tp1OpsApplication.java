package devOps.tp1_ops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"devOps.tp1_ops", "devOps.tp3_ops"})
public class Tp1OpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp1OpsApplication.class, args);
    }

}
