package com.example.api.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.api.domain.User;
import com.example.api.repositories.UserRepository;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Ian", "ian@email", "123");
        User u2 = new User(null, "Edu", "edu@email", "123");

        userRepository.saveAll(List.of(u1, u2));
    }
}
