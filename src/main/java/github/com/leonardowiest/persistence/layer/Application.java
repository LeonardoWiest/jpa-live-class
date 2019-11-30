package github.com.leonardowiest.persistence.layer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import github.com.leonardowiest.persistence.layer.constants.PackageConstants;

@SpringBootApplication(scanBasePackages = { PackageConstants.PKG_BASE })
@PropertySource(ignoreResourceNotFound = true, value = "classpath:pl-custom-${spring.profiles.active}.properties")
@PropertySource(ignoreResourceNotFound = false, value = "classpath:application-${spring.profiles.active}.properties")
@PropertySource(ignoreResourceNotFound = false, value = "classpath:application.properties")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
