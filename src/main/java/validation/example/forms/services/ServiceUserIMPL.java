package validation.example.forms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import validation.example.forms.entities.User;
import validation.example.forms.repositories.UserRepository;

@Service(value = "userService")
public class ServiceUserIMPL implements IServiceUser{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void addUser(User u) {
		userRepository.save(u);
		
	}

}
