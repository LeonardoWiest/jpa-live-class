package github.com.leonardowiest.persistence.layer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import github.com.leonardowiest.persistence.layer.constants.PackageConstants;

@SpringBootApplication(scanBasePackages = { PackageConstants.PKG_BASE })
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
