package com.bank.service.validator;

import com.bank.domain.User;
import com.bank.repository.impl.UserRepositoryImpl;

public class UserValidator implements Validator<User> {

    @Override
    public void validate(User entity) {
        try{

        } catch (IllegalAccessError e){
            e.printStackTrace();
        }
    }
}