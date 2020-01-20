package com.bank.repository;

import com.bank.domain.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User> {

    User findByEmail(String email);
}