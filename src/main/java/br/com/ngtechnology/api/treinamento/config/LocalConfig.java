package br.com.ngtechnology.api.treinamento.config;

import br.com.ngtechnology.api.treinamento.domain.User;
import br.com.ngtechnology.api.treinamento.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Nilton", "nilton@mail.com", "123");
        User u2 = new User(null, "Valdir", "valdir@mail.com","1234");

        repository.saveAll(List.of(u1, u2));


    }
}
