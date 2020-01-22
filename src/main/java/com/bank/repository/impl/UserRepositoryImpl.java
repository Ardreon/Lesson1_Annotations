package com.bank.repository.impl;

import com.bank.domain.User;
import com.bank.repository.UserRepository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    User user;
    private final Map<Integer, Optional<User>> userIdToUser = new HashMap<>();
    public List<User> userDatabase = new LinkedList<>();

    @Override
    public Optional<User> findByEmail(String email) {
        Optional<User> us = null;
        for(Map.Entry<Integer, Optional<User>> entry : userIdToUser.entrySet()) {
            Optional<User> value = entry.getValue();
            if ((Optional<>) == email) {
                us = value;
            }
        }
        return us;
    }

    @Override
    public void save(Optional<User> entity) {
        userIdToUser.put(user.hashCode(),entity);
    }

    @Override
    public Optional<User> findById(Integer id) {
        Optional<User> us = null;
        for(Map.Entry<Integer, Optional<User>> entry : userIdToUser.entrySet()) {
            Optional<User> value = entry.getValue();
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
        Optional<User> us = null;
        for(Map.Entry<Integer, Optional<User>> entry : userIdToUser.entrySet()) {
            Integer key = entry.getKey();
            if (user.getId() == id) {
                userIdToUser.remove(key);
            }
        }
    }
}