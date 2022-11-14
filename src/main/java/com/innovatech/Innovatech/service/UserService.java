package com.innovatech.Innovatech.service;
import com.innovatech.Innovatech.entity.User;
import com.innovatech.Innovatech.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepository iUserRepository;

    public List<User> getUsers(){
        return iUserRepository.findAll();
    }

    public User saveUser(User user){
        return iUserRepository.save(user);
    }

    public User getUser(Long idRoll){
        return iUserRepository.findById(idRoll).get();
    }

    public User updateUser(User user){
        return iUserRepository.save(user);
    }

    public void deleteUser(Long id){
        iUserRepository.deleteById(id);
    }


}
