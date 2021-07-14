package ar.alejoacosta.java.examples.springwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App {
    public static void main (String[] args){
        System.out.println("How u doin?");
        SpringApplication.run(App.class, args);

    }
}
