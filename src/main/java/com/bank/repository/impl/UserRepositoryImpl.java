package com.bank.repository.impl;

import com.bank.domain.User;
import com.bank.repository.UserRepository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    User user;
    private final Map<Integer, User> userIdToUser = new HashMap<>();
    public List<User> userDatabase = new LinkedList<>();

    @Override
    public User findByEmail(String email) {
        User us = null;
        for(Map.Entry<Integer, User> entry : userIdToUser.entrySet()) {
            User value = entry.getValue();
            if (user.getEmail() == email) {
                us = value;
            }
        }
        return us;
    }

    @Override
    public void save(User entity) {
        userIdToUser.put(user.hashCode(),entity);
    }

    @Override
    public User findById(Integer id) {
        User us = null;
        for(Map.Entry<Integer, User> entry : userIdToUser.entrySet()) {
            User value = entry.getValue();
            if (user.getId() == id) {
                us = value;
            }
        }
        return us;
    }



   @Override
   public List<User> findAll(){
       return userDatabase;
   }



    @Override
    public void update(User entity) {
       userIdToUser.toString();
    }

    @Override
    public void deleteById(Integer id) {
        User us = null;
        for(Map.Entry<Integer, User> entry : userIdToUser.entrySet()) {
            Integer key = entry.getKey();
            if (user.getId() == id) {
                userIdToUser.remove(key);
            }
        }
    }
}