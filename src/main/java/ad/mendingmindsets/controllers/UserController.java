package ad.mendingmindsets.controllers;


import ad.mendingmindsets.entities.Users;
import ad.mendingmindsets.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4200")
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

    @DeleteMapping("/api/users/{id}")
    public void deleteUser(@PathVariable UUID id) {
        userService.deletebyId(id);
    }

    @PutMapping("/api/users/{id}")
    public void updateUser(@RequestBody Users user,@PathVariable UUID id){
        userService.updateUser(user,id);
    }

}
