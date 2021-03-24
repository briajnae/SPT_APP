package com.parker.sptuser.controller;

import com.parker.sptuser.dao.UserRepository;
import com.parker.sptuser.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;



@RestController
@RefreshScope
public class UserController {

    @Autowired
    UserRepository userRepo;



    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody @Valid User user){
        return userRepo.save(user);
    }

    @RequestMapping( value = "/users", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String getAllUsers(){
        return "working";
    }

    @RequestMapping( value = "/users/{user_id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> findUserById(@PathVariable("user_id") Integer id){
        return userRepo.findById(id);
    }

    @RequestMapping( value = "/users/{user_id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void  updateUser(@PathVariable("user_id") Integer id,
                     @RequestBody @Valid User user){
        userRepo.saveAndFlush(user);
    }

    @RequestMapping( value = "/users/{user_id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("user_id") Integer id){
        userRepo.deleteById(id);
    }

}
