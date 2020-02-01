package validation.example.forms.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import validation.example.forms.entities.User;
import validation.example.forms.services.IServiceUser;
import validation.example.forms.utils.CustomObjectResponse;


@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@Autowired
    private IServiceUser userService;

    @PostMapping(value="/add")
    public @ResponseBody ResponseEntity<?> addUser(@Valid @RequestBody User user){
    	userService.addUser(user);
    	return new ResponseEntity<Object>(new CustomObjectResponse("Creation done"), HttpStatus.OK);    }


}
