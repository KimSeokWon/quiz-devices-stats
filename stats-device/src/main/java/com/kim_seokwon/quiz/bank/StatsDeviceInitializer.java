package com.kim_seokwon.quiz.bank;

import com.kim_seokwon.quiz.bank.loader.CSVFileLoader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.io.IOException;

@SpringBootApplication(scanBasePackages = {"com.kim_seokwon.quiz.bank"})
@Slf4j
public class StatsDeviceInitializer extends SpringBootServletInitializer {

    private final static String FILE_NAME = "sample.csv";
    public static void main(String args[]) {
        SpringApplication.run(StatsDeviceInitializer.class, args);
    }

    @PostConstruct
    public void initialize() {

        final CSVFileLoader loader = new CSVFileLoader();
        try {
            try {
                loader.open(getClass().getClassLoader().getResourceAsStream(FILE_NAME));
            } finally {
                loader.destroy();
            }
        } catch ( IOException ioex) {
            log.error("Load sample file", ioex);
        }
    }
}
