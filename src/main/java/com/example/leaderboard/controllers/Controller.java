package com.example.leaderboard.controllers;


import com.example.leaderboard.models.Request;
import com.example.leaderboard.models.User;
import com.example.leaderboard.repos.UserRepos;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class Controller {
    public UserRepos userRepos;

    public Controller(UserRepos userRepos){
        this.userRepos = userRepos;
    }

    @GetMapping("/checkName")
    public String check(@RequestParam String name){
        return String.valueOf(userRepos.findAllByName(name).isEmpty());
    }
    @PostMapping("/addUser")
    public void addUser(@RequestBody Request request){
        List<User> users = userRepos.findAllByName(request.name());
        if(users.isEmpty()){
            userRepos.save(new User(request.name(),request.point()));
        }
    }
    @PostMapping("/updatePoint")
    public void updatePoint(@RequestBody Request request){
        userRepos.save(new User(request.name(),request.point()));
    }
    @GetMapping("/getAll")
    public List<User> getAll(){
        List<User> list = userRepos.findByOrderByPoints();
        Collections.reverse(list);
        return list;
    }
}
