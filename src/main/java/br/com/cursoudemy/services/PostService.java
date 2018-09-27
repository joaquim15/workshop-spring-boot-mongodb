package br.com.cursoudemy.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoudemy.domain.Post;
import br.com.cursoudemy.repository.PostRepository;
import br.com.cursoudemy.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	private static final Logger log = LoggerFactory.getLogger(PostService.class);

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		log.info(obj.toString());
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado: " + id));
	}

	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);

	}

}
