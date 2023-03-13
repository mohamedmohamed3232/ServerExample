package com.example.serverexample.repo;

import com.example.serverexample.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server,Long> {
    Server findByIpAddress(String IpAddress);

}
