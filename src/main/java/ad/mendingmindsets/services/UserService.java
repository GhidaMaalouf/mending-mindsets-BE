package ad.mendingmindsets.services;

import ad.mendingmindsets.entities.Users;
import ad.mendingmindsets.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }
    public void addUser(Users userAdd){
        userRepository.save(userAdd);
    }
}
