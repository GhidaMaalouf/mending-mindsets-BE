package ad.mendingmindsets.services;

import ad.mendingmindsets.entities.Users;
import ad.mendingmindsets.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public void deletebyId(UUID id){ userRepository.deleteById(id);}

    public ResponseEntity<Object> updateUser( Users user, UUID id) {

        Optional<Users> usersOptional = userRepository.findById(id);

        if (!usersOptional.isPresent())
            return ResponseEntity.notFound().build();

        user.setId(id);

        userRepository.save(user);

        return ResponseEntity.noContent().build();
    }
}
