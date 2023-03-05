package br.com.ngtechnology.api.treinamento.services;

import br.com.ngtechnology.api.treinamento.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
