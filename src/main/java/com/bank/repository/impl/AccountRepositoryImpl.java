package com.bank.repository.impl;

import com.bank.domain.Account;
import com.bank.repository.AccountRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class AccountRepositoryImpl implements AccountRepository {
    Account account;
    public List<Optional<Account>> database = new LinkedList<>();

    //creat
    @Override
    public void save(Optional<Account> entity) {
        database.add(entity);
    }

    @Override
    public Optional<Account> findById(Integer id) {
            return database.get(id);
    }

    @Override
    public List<Account> findAll() {
        return database.toString();
    }

    @Override
    public void update(Account entity) {

        database.toString();
    }

    @Override
    public void deleteById(Integer id) {
       database.remove(id);
    }

}