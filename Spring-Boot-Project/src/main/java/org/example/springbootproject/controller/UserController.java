package org.example.springbootproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.springbootproject.entity.User;
import org.example.springbootproject.repository.UserRepository;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;
import java.util.List;

 @Slf4j
 @RestController
 @RequiredArgsConstructor
 @RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    @PostMapping
    public User saveUser(@RequestBody User user){
        log.info("Users: {}",user);
        return userRepository.save(user);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        log.info("User: {}",id);
        return userRepository.findUserById(id);
    }
     @GetMapping()
     public List<User> getAllUsers(){
         return userRepository.getAllUser();
     }
     @DeleteMapping("/{id}")
     public String deleteUserById(@PathVariable Long id){
         log.info("User: {}",id);
         userRepository.deleteUserById(id);
         return "User delete from UserBase";
     }

     @PutMapping("/{id}")
     public String updateUser(@RequestBody User user,@PathVariable Long id){
         log.info("Users: {}",user);
         User updateUser = userRepository.findById(id).orElseThrow();
         updateUser.setFirstname(user.getFirstname());
         updateUser.setLastname(user.getLastname());
         userRepository.save(updateUser);
         return "User with " + id + "id was update";
     }
}
