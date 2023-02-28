package br.com.ngtechnology.api.treinamento.services.impl;

import br.com.ngtechnology.api.treinamento.domain.User;
import br.com.ngtechnology.api.treinamento.repositories.UserRepository;
import br.com.ngtechnology.api.treinamento.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
