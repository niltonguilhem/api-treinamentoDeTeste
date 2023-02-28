package br.com.ngtechnology.api.treinamento.services;

import br.com.ngtechnology.api.treinamento.domain.User;

public interface UserService {

    User findById(Integer id);
}
