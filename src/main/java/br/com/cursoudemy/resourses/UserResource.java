package br.com.cursoudemy.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursoudemy.domain.User;
import br.com.cursoudemy.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService serviceUser;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = this.serviceUser.findAll();
		return ResponseEntity.ok().body(list);
	}

	public UserResource() {
		// TODO Auto-generated constructor stub
	}

}
