package com.example.serverexample;

import com.example.serverexample.enumeration.Status;
import com.example.serverexample.model.Server;
import com.example.serverexample.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.example.serverexample.enumeration.Status.SERVER_DOWN;
import static com.example.serverexample.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ServerRepo serverRepo) {
        return args -> {
            serverRepo.save(new Server(null,"192.168.1.168","Ubuntu Linux", "16 GB", "Personal PC",
                    "http://localhost:8080/server/image/server1.png", SERVER_UP));
            serverRepo.save(new Server(null,"192.168.1.58","Fedora Linux", "16 GB", "Dell Tower",
                    "http://localhost:8080/server/image/server2.png", SERVER_DOWN));
            serverRepo.save(new Server(null,"192.168.1.21","MS 2008", "32 GB", "Web Server",
                    "http://localhost:8080/server/image/server3.png", SERVER_UP));
            serverRepo.save(new Server(null,"192.168.1.14","Red Hat", "64 GB", "Mail Server",
                    "http://localhost:8080/server/image/server4.png", SERVER_DOWN));



        };
    }

}
