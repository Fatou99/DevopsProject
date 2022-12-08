package tn.devops;

//import com.example.devopsproject.DevOpsProjectApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class app implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(app.class, args);
        System.out.println("version: " + SpringVersion.getVersion());

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("version: " + SpringVersion.getVersion());

    }
}

