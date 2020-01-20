package com.bank.repository.impl;

import com.bank.domain.Account;
import com.bank.repository.AccountRepository;

import java.util.LinkedList;
import java.util.List;

public class AccountRepositoryImpl implements AccountRepository {
    Account account;
    public List<Account> database = new LinkedList<>();

    //creat
    @Override
    public void save(Account entity) {
        database.add(entity);
    }

    @Override
    public Account findById(Integer id) {
        Account acc = null;
        int i = 0;
        for (Account account : database) {
            if (account.getId() == id) {
                acc = database.get(i);
            }
            i = i + 1;
        }
            return acc;
    }

    @Override
    public List<Account> findAll() {
        return database;
    }

    @Override
    public void update(Account entity) {
       database.toString();
    }

    @Override
    public void deleteById(Integer id) {
        for (Account account : database)
            if(account.getId() == id) database.remove(account);
    }

}