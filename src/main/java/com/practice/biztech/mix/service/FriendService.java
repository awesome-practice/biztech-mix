package com.practice.biztech.mix.service;

import com.practice.biztech.mix.entity.User;

import java.util.List;

public interface FriendService {

    List<User> list(String uid);
}
