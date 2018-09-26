package br.com.cursoudemy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoudemy.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
