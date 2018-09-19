package br.com.cursoudemy.resourses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursoudemy.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Ismênia", "maria@gmail.com");
		User joaquim = new User("2", "Joaquim de Castro", "joaquim@gmail.com");
		List<User> list = new ArrayList<User>();
		list.addAll(Arrays.asList(maria, joaquim));
		return ResponseEntity.ok().body(list);
	}

	public UserResource() {
		// TODO Auto-generated constructor stub
	}

}
