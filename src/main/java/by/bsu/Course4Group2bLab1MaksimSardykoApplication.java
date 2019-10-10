package by.bsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Course4Group2bLab1MaksimSardykoApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Course4Group2bLab1MaksimSardykoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Course4Group2bLab1MaksimSardykoApplication.class, args);
    }
}
