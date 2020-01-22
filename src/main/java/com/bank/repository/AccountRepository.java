package com.bank.repository;

import com.bank.domain.Account;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<Account> {
 Optional<Account> findById(Integer id);
}