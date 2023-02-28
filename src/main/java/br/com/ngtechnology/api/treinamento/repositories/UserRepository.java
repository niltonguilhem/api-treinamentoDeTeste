package br.com.ngtechnology.api.treinamento.repositories;

import br.com.ngtechnology.api.treinamento.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
