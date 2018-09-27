package br.com.cursoudemy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoudemy.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
