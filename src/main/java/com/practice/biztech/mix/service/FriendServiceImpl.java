package com.practice.biztech.mix.service;

import com.practice.biztech.mix.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {
    @Cacheable("friends")
    @Override
    public List<User> list(String uid) {


        // TODO: 2019/9/18
        return null;
    }
}
