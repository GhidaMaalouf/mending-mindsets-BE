package ad.mendingmindsets.controllers;


import ad.mendingmindsets.entities.Users;
import ad.mendingmindsets.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/users")
    public List<Users>  getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/api/users/add-user")
    public void addUser(@RequestBody Users useradded){
        userService.addUser(useradded);
    }
}
