package com.practice.biztech.mix.controller;

import com.practice.biztech.mix.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendController {

    @GetMapping("/friends")
    public List<User> friends(@RequestParam("uid") String uid) {

        // TODO: 2019/9/18
        return null;

    }
}
