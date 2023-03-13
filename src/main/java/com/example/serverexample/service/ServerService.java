package com.example.serverexample.service;

import com.example.serverexample.model.Server;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collection;
@Service
public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
