package com.sadtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(
  basePackages = {"com.sadtask.infrastructure.file.local"}
)
@SpringBootApplication
public class sadtaskApplication {

  public static void main(String[] args) {
    SpringApplication.run(sadtaskApplication.class, args);
  }
}
