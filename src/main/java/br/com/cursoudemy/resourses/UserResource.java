package br.com.cursoudemy.resourses;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursoudemy.domain.User;
import br.com.cursoudemy.dto.UserDTO;
import br.com.cursoudemy.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService serviceUser;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {

		List<User> list = this.serviceUser.findAll();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

	public UserResource() {
		// TODO Auto-generated constructor stub
	}

}
