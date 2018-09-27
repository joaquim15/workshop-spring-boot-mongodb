package br.com.cursoudemy.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.cursoudemy.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	// campo pelo qual a busca sera realizada ='title'
	
	@Query("{ 'title' : { $regex: ?0, $options: 'i'} }")
	List<Post> findByTitle(String text);

	List<Post> findByTitleContainingIgnoreCase(String text);

}
